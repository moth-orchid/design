package com.yhl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class User_ClothesController {
	
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
	
	/*
	 * @RequestMapping(value = "/addShopaCart", method = RequestMethod.GET) public
	 * ModelAndView addShopaCart() {
	 * 
	 * }
	 */
}
