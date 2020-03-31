package com.yhl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yhl.entity.Clothes;
import com.yhl.entity.Seller;
import com.yhl.service.ClothesSelect;

@Controller
public class ClothesController {
	
	@Autowired
	private ClothesSelect clothesSelect;
	
	@RequestMapping(value = "/clothesManager", method = RequestMethod.GET)
	public ModelAndView clothesManager(@ModelAttribute Seller seller) {
		ModelAndView mv=new ModelAndView();
		
		return mv;
	}
	
	
	
}
