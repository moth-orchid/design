package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Privilege;
import com.example.demo.bean.PrivilegeExample;
import com.example.demo.bean.extend.PrivilegeTree;
import com.example.demo.dao.PrivilegeMapper;
import com.example.demo.dao.extend.PrivilegeExtendMapper;

@Service
public class PrivilegeServiceImpl implements PrivilegeSevice{
	
	@Autowired
	private PrivilegeMapper privilegeMapper;
	
	@Autowired
	private PrivilegeExtendMapper privilegeExtendMapper;
	
	@Override
	public void deletePrivilegeById(Long id) {
		privilegeMapper.deleteByPrimaryKey(id.intValue());	
	}

	@Override
	public List<Privilege> findAllPrivilege() {
		PrivilegeExample example=new PrivilegeExample();
		List<Privilege> selectByExample = privilegeMapper.selectByExample(example);		
		return selectByExample;
	}

	@Override
	public void saveOrUpdate(Privilege privilege) {
		//判断权限id是否存在
		if(privilege.getId()!=null) {
			//是对权限进行更新
			privilegeMapper.updateByPrimaryKey(privilege);
		}else {
			privilegeMapper.insert(privilege);
		}
		
	}

	@Override
	public List<Privilege> findByParentId(Long id) {
		List<Privilege> findByParentId = privilegeExtendMapper.findByParentId(id);
		return findByParentId;
	}

	@Override
	public List<PrivilegeTree> findPrivilegeTree() {
		List<PrivilegeTree> findNull = privilegeExtendMapper.findNull();
		return findNull;
	}

	@Override
	public List<Privilege> findUserId(Long userId) {
		List<Privilege> findUserId = privilegeExtendMapper.findUserId(userId);
		return findUserId;
	}
	
}
