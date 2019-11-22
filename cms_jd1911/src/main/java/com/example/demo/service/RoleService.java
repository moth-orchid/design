package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Role;

public interface RoleService {
	//增加角色
	void saveOrUpdateRole(Role role);
	
	//根据角色id删除角色
	void deleteRoleById(Long id);
	
	//查看所有角色
	List<Role> findAll();

	void setPrivilege(Long id, Long[] ids);
}
