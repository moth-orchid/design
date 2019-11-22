package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.User;
import com.example.demo.bean.extend.UserRole;

public interface UserService {
	//查询所有用户
	List<User> findAllUser();
	
	//删除用户
	void deleteUserById(Long id);
	
	//保存或者更新用户
	void saveOrUpdate(User user);
	
	//为用户设置角色
	void setRoles(Long user_id, Long[] role_id);
	
	//查询所有用户级联角色
	List<UserRole> cascadeRoleFindAll();
}
