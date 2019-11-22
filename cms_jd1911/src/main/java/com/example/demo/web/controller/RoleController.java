package com.example.demo.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Role;
import com.example.demo.bean.User;
import com.example.demo.service.RoleService;
import com.example.demo.utils.Message;
import com.example.demo.utils.MessageUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Validated
@ControllerAdvice
@RestController
@RequestMapping("/roleManager")
public class RoleController {
	@Autowired
	private RoleService roleservice;
	
	@PostMapping("/findAllRole")
	@ApiOperation("查询所有角色")
	public Message finaAllRole() {
		List<Role> list = roleservice.findAll();
		return MessageUtil.success(list);
	}
	
	@PostMapping("/deleteById")
	@ApiOperation("根据用户的id删除角色")
	@ApiImplicitParams(
			@ApiImplicitParam(name = "id",value = "角色",paramType = "query",required = true)
			)
	public Message deleteById(Long id) {
		roleservice.deleteRoleById(id);
		return MessageUtil.success("删除成功");
	}
	
	@PostMapping("/saveOrUpdate")
	@ApiOperation("保存或者更新用户角色")
	public Message saveOrUpdate(Role role) {
		roleservice.saveOrUpdateRole(role);
		return MessageUtil.success("执行成功");
	}
	
	@PostMapping("/setPrivilege")
	@ApiOperation("为角色设置权限")
	public Message setPrivilege(Long id,Long[] ids) {
		roleservice.setPrivilege(id,ids);
		return MessageUtil.success("执行成功");
	}
}
