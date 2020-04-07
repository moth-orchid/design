package com.yhl.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yhl.entity.Address;
import com.yhl.entity.Admin;
import com.yhl.entity.Clothes;
import com.yhl.entity.Consumer;
import com.yhl.entity.Seller;
import com.yhl.entity.User;
import com.yhl.service.ClothesSelect;
import com.yhl.service.UserSelect;

@Controller
public class UserController {
	
	@Autowired
	private UserSelect userSelect;
	
	@Autowired
	private ClothesSelect clothesSelect;
	
	/*
	 * @RequestMapping(value = "/userList", method = RequestMethod.GET) public
	 * ModelAndView userList(@ModelAttribute User user) { ModelAndView mv=new
	 * ModelAndView(); System.out.println("............");
	 * 
	 * System.out.println(user); List<User>
	 * list=userSelect.queryByAgeAndName(user.getUserName(), user.getUserAge());
	 * System.out.println(list); mv.addObject("userList",list);
	 * mv.setViewName("itemList"); return mv; }
	 * 
	 * @RequestMapping(value = "/userList1", method = RequestMethod.GET) public
	 * ModelAndView userList1(@ModelAttribute User user) { ModelAndView mv=new
	 * ModelAndView(); System.out.println("保存用户");
	 * 
	 * User user1=new User();
	 * 
	 * user1.setUserId(user.getUserId()); user1.setUserName(user.getUserName());
	 * user1.setUserAge(user.getUserAge());
	 * 
	 * //user1.setUserName("yhl"); //user1.setUserAge(24);
	 * 
	 * userSelect.insertUser(user1); mv.setViewName("itemList"); return mv; }
	 * 
	 * @RequestMapping(value = "/userDelete", method = RequestMethod.GET) public
	 * ModelAndView userDelete(@ModelAttribute User user) { ModelAndView mv=new
	 * ModelAndView(); System.out.println("删除用户");
	 * 
	 * User user1=new User();
	 * 
	 * System.out.println(user.getUserId()); user1.setUserId(user.getUserId());
	 * 
	 * userSelect.deleteUser(user1);
	 * 
	 * mv.setViewName("itemList"); return mv; }
	 */
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/consumer", method = RequestMethod.GET)
	public ModelAndView enterConsumer(String name,String password,String status) {
		System.out.println(name+password+status);
		ModelAndView  mv=new ModelAndView();
		//判断用户身份
		if(status.equals("商家")&&status!=null) {
			//判断该商家是否存在
			Seller seller=new Seller();
			seller.setSellerName(name);
			seller.setSellerPassword(password);
			
			Boolean flag=userSelect.queryByNameAndPassword1(seller);
			System.out.println(flag);
			if(flag==true) {
				Integer sellerId=userSelect.queryByNameAndPassword2(seller);
				mv.setViewName("sellerIndex"); 
				mv.addObject("sellerId", sellerId);
				return mv;
			}else {
				mv.setViewName("seller_regist");
				return mv;
			}
		}
		else if (status.equals("消费者")&&status!=null) {
			//判断该消费者是否存在
			Consumer consumer=new Consumer();
			consumer.setConsumerName(name);
			consumer.setConsumerPassword(password);
			
			Boolean flag=userSelect.queryByNameAndPassword(consumer);
			System.out.println(flag);
			if(flag==true) {
				System.out.println(".............");
				Consumer consumer1=userSelect.query(consumer);
				System.out.println(consumer1+"/////");
				mv.addObject("consumerId", consumer1.getConsumerId());
				List<Clothes> clothesList=selectAllClothesIndex();
				mv.addObject("clothesList", clothesList);
				mv.setViewName("estoreIndex");
				return mv;
			}else {
				mv.setViewName("consumer_regist");
				return mv;
			}
		}
		else if(status.equals("管理员")&&status!=null){
			//判断管理员是否存在
			Admin admin=new Admin();
			admin.setAdminName(name);
			admin.setAdminPassword(password);
			
			Boolean flag=userSelect.queryByNameAndPassword2(admin);
			System.out.println(flag);
			if(flag==true) {
				mv.setViewName("admin");
				return mv;
			}else {
				return mv;
			}
		}
		else {
			return mv;
		}
	}
	
	@RequestMapping(value = "/consumerRegist", method = RequestMethod.GET)
	public String consumerRegist(@ModelAttribute Consumer consumer) {
		userSelect.insertCustomer(consumer);
		return "login";
	}
	
	@RequestMapping(value = "/sellerRegist", method = RequestMethod.GET)
	public String sellerRegist(@ModelAttribute Seller seller) {
		userSelect.insertSeller(seller);
		return "login";
	}
	
	@RequestMapping(value = "/consumerManager", method = RequestMethod.GET)
	public ModelAndView consumerManager() {
		ModelAndView mv=new ModelAndView(); 
		
		System.out.println("消费者管理");
				
	    List<Consumer> consumerList= userSelect.findAllConsumer();
		
	    mv.addObject("consumerList", consumerList);
	    mv.setViewName("consumerManager");
	    
	    return mv; 
	    
	}
	
	@RequestMapping(value = "/sellerManager", method = RequestMethod.GET)
	public ModelAndView sellerManager() {
		ModelAndView mv=new ModelAndView(); 
		
		System.out.println("商家管理");
				
	    List<Seller> sellerList=userSelect.findAllSeller();
		
	    mv.addObject("sellerList", sellerList);
	    mv.setViewName("sellerManager");
	    
	    return mv; 	    
	}
	
	@RequestMapping(value = "/clothesManagerByAdmin", method = RequestMethod.GET)
	public ModelAndView clothesManagerByAdmin() {
		ModelAndView mv=new ModelAndView(); 
		
		System.out.println("商品管理");
				
	    List<Clothes> clothesList=userSelect.selectAllClothes();
		
	    System.out.println(clothesList);
	    mv.addObject("clothesList", clothesList);
	    mv.setViewName("clothesManager");
	    
	    return mv; 	    
	}
	
	@RequestMapping(value = "/clothesDelete", method = RequestMethod.GET)
	public ModelAndView clothesDelete(@ModelAttribute Clothes clothes) {
	
		userSelect.clothesDelete(clothes.getClothesId());
		
		ModelAndView mv=clothesManagerByAdmin();
		return mv;
	}
	
	@RequestMapping(value = "/consumerDelete", method = RequestMethod.GET)
	public ModelAndView consumerDelete(@ModelAttribute Consumer consumer) { 		
		System.out.println("删除消费者");
		
		userSelect.deleteConsumer(consumer);
		ModelAndView mv=consumerManager();		
	    return mv; 	    
	}
	
	@RequestMapping(value = "/addConsumer", method = RequestMethod.GET)
	public String addConsumer() {
		return "addConsumer";
	}
	
	
	@RequestMapping(value = "/addConsumer1", method = RequestMethod.GET)
	public ModelAndView addConsumer1(@ModelAttribute Consumer consumer) {
		System.out.println("添加消费者");
		
		userSelect.addConsumer(consumer);
		
		ModelAndView mv=consumerManager();		
	    return mv; 
	}
	
	@RequestMapping(value = "/sellerDelete", method = RequestMethod.GET)
	public ModelAndView sellerDelete(@ModelAttribute Seller seller) { 		
		System.out.println("删除商家");
		
		userSelect.deleteSeller(seller);
		ModelAndView mv=sellerManager();		
	    return mv; 	    
	}
	
	@RequestMapping(value = "/addSeller", method = RequestMethod.GET)
	public String addSeller() {
		return "addSeller";
	}
	
	@RequestMapping(value = "/addSeller1", method = RequestMethod.GET)
	public ModelAndView addSeller1(@ModelAttribute Seller seller) {
		System.out.println("添加商家");
		
		userSelect.addSeller(seller);
		
		ModelAndView mv=sellerManager();		
	    return mv; 
	}
	
	@RequestMapping(value = "/personalManager", method = RequestMethod.GET)
	public ModelAndView personalManager(@ModelAttribute Consumer consumer) {
		System.out.println("个人中心");
		Consumer consumer1=userSelect.queryById(consumer);
		
		ModelAndView mv=new ModelAndView();
		List<Consumer> list=new ArrayList<>();
		list.add(consumer1);
		mv.addObject("personal", list);
		mv.setViewName("personal");
		
		return mv;
	}
	//输出所有收货地址
	@RequestMapping(value = "/addresseeManager", method = RequestMethod.GET)
	public ModelAndView addresseeManager(@ModelAttribute Consumer consumer) {
		ModelAndView mv=new ModelAndView();
		
		List<Address> list=userSelect.queryAddresseeById(consumer);
		
		System.out.println(list+"////.....?///");
		mv.setViewName("addresseeManager");
		mv.addObject("addressList", list);
		mv.addObject("consumerId", consumer.getConsumerId());
		return mv;
	}
	//新增收货地址
	@RequestMapping(value = "/addAddress", method = RequestMethod.GET)
	public ModelAndView addAddress(@ModelAttribute Consumer consumer) {
		ModelAndView mv=new ModelAndView();
		System.out.println("yonhuid"+consumer.getConsumerId());
		mv.addObject("consumerId", consumer.getConsumerId());
		mv.setViewName("addAddress");
		return mv;
	}
	@RequestMapping(value = "/addAddress1", method = RequestMethod.GET)
	public ModelAndView addAddress1(@ModelAttribute Address address,String consumerId)   {
		System.out.println(consumerId);
		System.out.println(address);
		Consumer consumer=new Consumer();
		consumer.setConsumerId(Integer.parseInt(consumerId));
		address.setConsumer(consumer);
		userSelect.addAddress(address);
		ModelAndView mv=addresseeManager(address.getConsumer());
		return mv;
	}
	
	@RequestMapping(value = "/addressDelete", method = RequestMethod.GET)
	public ModelAndView addressDelete(@ModelAttribute Address address,String consumerId) { 		
		System.out.println("删除收货地址");
		System.out.println(address);
		userSelect.deleteAddress(address);
		Consumer consumer=new Consumer();
		consumer.setConsumerId(Integer.parseInt(consumerId));
		ModelAndView mv=addresseeManager(consumer);
		return mv;	    
	}
	
	@RequestMapping(value = "/consumerUpdate", method = RequestMethod.GET)
	public ModelAndView consumerUpdate(@ModelAttribute Consumer consumer) { 		
		System.out.println("修改个人信息");
		ModelAndView mv=new ModelAndView();
		
		return mv;	    
	}
	
	@RequestMapping(value = "/selectAllClothesIndex", method = RequestMethod.GET)
	public List<Clothes> selectAllClothesIndex() {
		
		List<Clothes> clothesList=clothesSelect.selectAllClothesIndex();
		return clothesList;
	}
	
	
	
	@RequestMapping(value = "/adminManager", method = RequestMethod.GET)
	public String adminManager() {
		return "info";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product() {
		return "product";
	}
	
	//userRegist判断
	@RequestMapping(value = "/userRegist", method = RequestMethod.GET)
	public String userRegist(String status) {
		if(status.equals("消费者")) {
			return "consumer_regist";
		}else if(status.equals("商家")) {
			return "seller_regist";
		}else {
			return "index";
		}
	}
}
