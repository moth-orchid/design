package com.example.demo.dao.extend;

import java.util.List;

import com.example.demo.bean.Role;
import com.example.demo.bean.extend.RolePrivilege;

public interface RoleExtendMapper {
	List<Role> findByUserId(Long id);
	
	RolePrivilege findRolePrivilege(Long id);
}
