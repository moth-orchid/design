package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.bean.Privilege;
import com.example.demo.bean.extend.PrivilegeTree;

public interface PrivilegeSevice {
	//根据id删除权限
	void deletePrivilegeById(Long id);
	
	//查询所有权限
	List<Privilege> findAllPrivilege();
	
	//保存或者更新权限
	void saveOrUpdate(Privilege privilege);

	List<Privilege> findByParentId(Long id);

	List<PrivilegeTree> findPrivilegeTree();

	List<Privilege> findUserId(Long userId);
}
