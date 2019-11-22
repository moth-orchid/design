package com.example.demo.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.bean.extend.UserRole;
import com.example.demo.bean.extend.UserVM;
import com.example.demo.service.UserLoginService;
import com.example.demo.utils.JwtTokenUtil;
import com.example.demo.utils.Message;
import com.example.demo.utils.MessageUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Validated
@ControllerAdvice
@RestController
@RequestMapping("/user")
public class UserLoginController {
	@Autowired
	private UserLoginService userLoginService;
	
	@PostMapping("/login")
	@ApiOperation("用户登录")
	public Message login(@RequestBody UserVM userVM) {
		User user= userLoginService.login(userVM);
		 // 2. 如果登录成功产生token,将token缓存起来，返回
		String token = JwtTokenUtil.createJWT(user.getId().longValue(), user.getUsername());
		
		Map<String,String> map=new HashMap<>();
		map.put("token",token);
		return MessageUtil.success(map);
	}
	
	@GetMapping("/info")
	@ApiOperation("获取用户信息")
	public Message info(String token) {
		long id = Long.parseLong(JwtTokenUtil.getUserId(token,JwtTokenUtil.base64Secret));
		UserRole userRole = userLoginService.findUser(id);
		return MessageUtil.success(userRole);
	}
	
	 @PostMapping("logout")
	    public Message logout(){
	        // 1. 登录， token从缓存中移除掉
	        return MessageUtil.success("退出成功");
	 }
	
}
