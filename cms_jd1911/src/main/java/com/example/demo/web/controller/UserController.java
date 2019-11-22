package com.example.demo.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.bean.extend.UserRole;
import com.example.demo.service.UserService;
import com.example.demo.utils.Message;
import com.example.demo.utils.MessageUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Validated
@ControllerAdvice
@RestController
@RequestMapping("/userManager")
public class UserController {
	@Autowired
	public UserService userService;
	
	@PostMapping("/findAllUser")
	@ApiOperation("查询所有用户")
	public Message finaAllUser() {
		List<User> list = userService.findAllUser();
		return MessageUtil.success(list);
	}
	
	@PostMapping("/cascadeRoleFindAll")
	@ApiOperation("查询所有用户")
	public Message cascadeRoleFindAll() {
		List<UserRole> list = userService.cascadeRoleFindAll();
		return MessageUtil.success(list);
	}
	
	@PostMapping("/deleteById")
	@ApiOperation("根据用户的id删除用户")
	@ApiImplicitParams(
			@ApiImplicitParam(name = "id",value = "用户的编号",paramType = "query",required = true)
			)
	public Message deleteById(Long id) {
		userService.deleteUserById(id);
		return MessageUtil.success("删除成功");
	}
	
	@PostMapping("/saveOrUpdate")
	@ApiOperation("保存或者更新用户")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id",value = "用户编号",paramType = "query"),
			@ApiImplicitParam(name = "username",value = "用户名",paramType = "query",required = true),
			@ApiImplicitParam(name = "password",value = "用户密码",paramType = "query",required = true),
			@ApiImplicitParam(name = "telephone",value = "联系方式",paramType = "query"),
			@ApiImplicitParam(name = "realname",value = "用户的真实姓名",paramType = "query",required = true),
			@ApiImplicitParam(name = "gender",value = "用户性别",paramType = "query"),
			@ApiImplicitParam(name = "birth",value = "用户生日",paramType = "query")
	})
	public Message saveOrUpdate(String username,String password,String telephone,String realname,String 
			gender, Date birth) {
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRealname(realname);
		user.setTelephone(telephone);
		user.setGender(gender);
		user.setBirth(birth);
		userService.saveOrUpdate(user);
		return MessageUtil.success("执行成功");
	}
	
	@PostMapping("/setRoles")
	@ApiOperation("为用户设置角色")
	public Message setRoles(Long user_id,Long[] role_id) {
		userService.setRoles(user_id,role_id);
		return MessageUtil.success("设置角色成功");
	}
}
