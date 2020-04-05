package com.yhl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yhl.entity.Clothes;
import com.yhl.entity.Seller;
import com.yhl.entity.Sort;
import com.yhl.service.ClothesSelect;
import com.yhl.service.UserSelect;

@Controller
public class ClothesController {
	
	@Autowired
	private ClothesSelect clothesSelect;
	
	@Autowired
	private UserSelect userSelect;
	
	//商家商品管理
	@RequestMapping(value = "/selectAllClothes", method = RequestMethod.GET)
	public ModelAndView selectAllClothes(@ModelAttribute Seller seller) {
		ModelAndView mv=new ModelAndView();
		
		List<Clothes> clothesList=clothesSelect.selectAllClothes(seller);
		mv.addObject("clothesList", clothesList);
		mv.addObject("seller", seller);
	    mv.setViewName("clothesManagerBySeller");
		return mv;
	}
	
	//友情链接
	@RequestMapping(value = "/lianjie", method = RequestMethod.GET)
	public String lianjie() {
		return "link";
	}
	
	//商品类别管理
	@RequestMapping(value = "/SortManager", method = RequestMethod.GET)
	public ModelAndView SortManager() {
		ModelAndView mv=new ModelAndView();
		
		List<Sort> sortList=clothesSelect.selectAllSort();
		mv.addObject("sortList", sortList);
	    mv.setViewName("sortManager");
		return mv;
	}
	
	//新增商品类别--1
	
	@RequestMapping(value = "/addSort", method = RequestMethod.GET)
	public String addSort() {
		return "addSort";
	}
	
	//新增商品类别2
	@RequestMapping(value = "/addSort2", method = RequestMethod.GET)
	public ModelAndView addSort2(@ModelAttribute Sort sort) {
		System.out.println(sort);
		clothesSelect.addSort(sort);
		
		ModelAndView mv=SortManager();
		return mv;
	}
	
	//删除类别
		@RequestMapping(value = "/sortDelete", method = RequestMethod.GET)
		public ModelAndView sortDelete(@ModelAttribute Sort sort) {
			System.out.println(sort);
			clothesSelect.sortDelete(sort);
			
			ModelAndView mv=SortManager();
			return mv;
		}
		
		//商家个人中心
		@RequestMapping(value = "/sellerPersonal", method = RequestMethod.GET)
		public ModelAndView sellerPersonal(@ModelAttribute Seller seller) {
			System.out.println(seller);
			
			List<Seller> sellerList=clothesSelect.selectSeller(seller);
			ModelAndView mv=new ModelAndView();
			mv.addObject("sellerList", sellerList);
			mv.setViewName("sellerPersonal");
			return mv;
		}
		
		//商家修改密码
		@RequestMapping(value = "/updatePassword", method = RequestMethod.GET)
		public ModelAndView updatePassword(@ModelAttribute Seller seller) {
			System.out.println(seller);
			ModelAndView mv=new ModelAndView();
			mv.addObject("seller", seller);
			mv.setViewName("updatePwd");
			return mv;
		}
		
		//主页中短袖
		@RequestMapping(value = "/showDuanXiu", method = RequestMethod.GET)
		public ModelAndView showDuanXiu(@ModelAttribute Sort sort) {
			ModelAndView mv=new ModelAndView();
			
			List<Clothes> clothesList=clothesSelect.showDuanXiu(sort);
			mv.addObject("clothesList", clothesList);
		    mv.setViewName("showDuanXiu");
			return mv;
		}
		//主页中风衣
		@RequestMapping(value = "/showFengYi", method = RequestMethod.GET)
		public ModelAndView showFengYi(@ModelAttribute Sort sort) {
			ModelAndView mv=new ModelAndView();
			
			List<Clothes> clothesList=clothesSelect.showFengYi(sort);
			mv.addObject("clothesList", clothesList);
		    mv.setViewName("showFengYi");
			return mv;
		}
		
		//主页中棉衣
		@RequestMapping(value = "/showMianYi", method = RequestMethod.GET)
		public ModelAndView showMianYi(@ModelAttribute Sort sort) {
			ModelAndView mv=new ModelAndView();
			
			List<Clothes> clothesList=clothesSelect.showMianYi(sort);
			mv.addObject("clothesList", clothesList);
		    mv.setViewName("showMianYi");
			return mv;
		}
		
		//主页中裤子
		@RequestMapping(value = "/showKuZi", method = RequestMethod.GET)
		public ModelAndView showKuZi(@ModelAttribute Sort sort) {
			ModelAndView mv=new ModelAndView();
			
			List<Clothes> clothesList=clothesSelect.showKuZi(sort);
			mv.addObject("clothesList", clothesList);
		    mv.setViewName("showKuZi");
			return mv;
		}
		
		
}
