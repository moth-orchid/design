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

import com.yhl.entity.Consumer;
import com.yhl.entity.User;
import com.yhl.service.UserSelect;

@Controller
public class UserController {
	
	@Autowired
	private UserSelect userSelect;
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public ModelAndView userList(@ModelAttribute User user) {
		ModelAndView mv=new ModelAndView();
		System.out.println("............");
		
		System.out.println(user);
		List<User> list=userSelect.queryByAgeAndName(user.getUserName(), user.getUserAge());
		System.out.println(list);
		mv.addObject("userList",list);
		mv.setViewName("itemList");
		return mv;
	}
	
	@RequestMapping(value = "/userList1", method = RequestMethod.GET)
	public ModelAndView userList1(@ModelAttribute User user) {
		ModelAndView mv=new ModelAndView();
		System.out.println("保存用户");
		
		User user1=new User();
		
		user1.setUserId(user.getUserId());
		user1.setUserName(user.getUserName());
		user1.setUserAge(user.getUserAge());
		
		//user1.setUserName("yhl");
		//user1.setUserAge(24);
		
		userSelect.insertUser(user1);
		mv.setViewName("itemList");
		return mv;
	}
	
	@RequestMapping(value = "/userDelete", method = RequestMethod.GET)
	public ModelAndView userDelete(@ModelAttribute User user) {
		ModelAndView mv=new ModelAndView();
		System.out.println("删除用户");
		
		User user1=new User();
		
		System.out.println(user.getUserId());
		user1.setUserId(user.getUserId());
		
		userSelect.deleteUser(user1);
		
		mv.setViewName("itemList");
		return mv;
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin() {
		return "userLogin";
	}
	
	@RequestMapping(value = "/consumer", method = RequestMethod.GET)
	public String enterConsumer(String name,String password,String status) {
		System.out.println(name+password+status);
		//判断用户身份
		if(status.equals("商家")&&status!=null) {
			return "seller";
		}
		else if (status.equals("消费者")&&status!=null) {
			//判断该消费者是否存在
			Consumer consumer=new Consumer();
			consumer.setConsumerName(name);
			consumer.setConsumerPassword(password);
			Boolean flag=userSelect.queryByNameAndPassword(consumer);
			if(flag==true) {
				return "regist";
			}else {
				return "consumer";
			}
		}else {
			return "admin";
		}
	}
	
	
	
}
