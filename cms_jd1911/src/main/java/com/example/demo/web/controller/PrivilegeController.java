package com.example.demo.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Privilege;
import com.example.demo.bean.Role;
import com.example.demo.bean.extend.PrivilegeTree;
import com.example.demo.service.PrivilegeSevice;
import com.example.demo.service.RoleService;
import com.example.demo.utils.Message;
import com.example.demo.utils.MessageUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Validated
@ControllerAdvice
@RestController
@RequestMapping("/privilege")
public class PrivilegeController {
	@Autowired
	private PrivilegeSevice  privilegeService;
	
	@PostMapping("/findAllPrivilege")
	@ApiOperation("查询所有权限")
	public Message finaAllPrivilege() {
		List<Privilege> list = privilegeService.findAllPrivilege();
		return MessageUtil.success(list);
	}
	
	@PostMapping("/deleteById")
	@ApiOperation("根据权限id删除权限")
	@ApiImplicitParams(
			@ApiImplicitParam(name = "id",value = "角色",paramType = "query",required = true)
			)
	public Message deleteById(Long id) {
		privilegeService.deletePrivilegeById(id);
		return MessageUtil.success("删除成功");
	}
	
	@PostMapping("/saveOrUpdate")
	@ApiOperation("保存或者更新用户角色")
	public Message saveOrUpdate(Privilege privilege) {
		privilegeService.saveOrUpdate(privilege);
		return MessageUtil.success("执行成功");
	}
	
	@PostMapping("/findByParentId")
	@ApiOperation("根据父类id查找权限")
	public Message findByParentId(Long id) {
		List<Privilege> list1=privilegeService.findByParentId(id);
		return MessageUtil.success(list1);
	}
	
	@PostMapping("/findPrivilegeTree")
	@ApiOperation("查找权限树")
	public Message findPrivilegeTree() {
		List<PrivilegeTree> privilegeTree = privilegeService.findPrivilegeTree();
		return MessageUtil.success(privilegeTree);
	}
}
