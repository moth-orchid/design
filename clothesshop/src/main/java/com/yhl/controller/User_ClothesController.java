package com.yhl.controller;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yhl.entity.Clothes;
import com.yhl.entity.RealShopCart;
import com.yhl.entity.Seller;
import com.yhl.entity.Sort;
import com.yhl.service.ClothesSelect;

@Controller
public class User_ClothesController {
	
	@Autowired
	private ClothesSelect clothesSelect;
	
	@RequestMapping(value = "/enterIndex", method = RequestMethod.GET)
	public String enterIndex() {
		return "index";
	}
	@RequestMapping(value = "/showC1", method = RequestMethod.GET)
	public String showC1() {
		System.out.println("..........//");
		return "c1";
	}
	@RequestMapping(value = "/showC2", method = RequestMethod.GET)
	public String showC2() {
		return "c2";
	}
	@RequestMapping(value = "/showC3", method = RequestMethod.GET)
	public String showC3() {
		return "c3";
	}
	@RequestMapping(value = "/showC4", method = RequestMethod.GET)
	public String showC4() {
		return "c4";
	}
	
	//加入购物车
	 @RequestMapping(value = "/addCart", method = RequestMethod.GET)
	 public ModelAndView addCart(Integer clothesId,Integer consumerId,Integer count) {
		 clothesSelect.addCart(clothesId,consumerId,count);
		 
		 return enterDetail( clothesId, consumerId);
	 }
	 
	
	//进入商品详情页
	
	@RequestMapping(value = "/enterDetail", method = RequestMethod.GET)
	public ModelAndView enterDetail(Integer clothesId,Integer consumerId) {
		ModelAndView mv=new ModelAndView();
		System.out.println(clothesId+consumerId);
		mv.setViewName("clothesDetail");
		Clothes clothes=clothesSelect.queryClothesById(clothesId);
		System.out.println(clothes);
		Seller seller=clothesSelect.querySellerById(clothes.getSellerId());
		System.out.println(clothes.getSellerId());
		System.out.println(seller+"/////");
		Sort sort=clothesSelect.querySortById(clothes.getSortId());
		System.out.println(sort+"/////");
		mv.addObject("consumerId", consumerId);
		mv.addObject("clothes", clothes);
		mv.addObject("seller", seller);
		mv.addObject("sort", sort);
		return mv;
	}
	
	//购物车页面
	 @RequestMapping(value = "/shopCart", method = RequestMethod.GET)
	 public ModelAndView shopCart(Integer consumerId) {
		 ModelAndView mv=new ModelAndView();
		 List<RealShopCart> realShopCart =clothesSelect.sellectShopCart(consumerId);
		 mv.addObject("consumerId", consumerId);
		 mv.addObject("realShopCart", realShopCart);
		 mv.setViewName("ShopCart");
		 return mv;
	 }
	
}
