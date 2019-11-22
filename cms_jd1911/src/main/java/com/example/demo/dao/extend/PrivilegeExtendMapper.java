package com.example.demo.dao.extend;

import java.util.List;
import java.util.Map;

import com.example.demo.bean.Privilege;
import com.example.demo.bean.extend.PrivilegeTree;

public interface PrivilegeExtendMapper {
	List<Privilege> findByParentId(Long id);
	
	List<PrivilegeTree> findNull();
	
	List<Privilege> findByRoleId(Long id);
	
	List<Privilege> findUserId(Long id);
}
