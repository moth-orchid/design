package com.example.demo.dao.extend;

import java.util.List;

import com.example.demo.bean.extend.UserRole;


public interface UserExtendMapper {
	UserRole selectAll(Long id);
	
	public List<UserRole> cascadeRoleFindAll();
}
