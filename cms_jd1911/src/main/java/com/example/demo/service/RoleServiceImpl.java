package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Privilege;
import com.example.demo.bean.Role;
import com.example.demo.bean.RoleExample;
import com.example.demo.bean.UserRole;
import com.example.demo.bean.UserRoleExample;
import com.example.demo.bean.extend.RolePrivilege;
import com.example.demo.bean.RoleExample.Criteria;
import com.example.demo.bean.RolePrivilegeExample;
import com.example.demo.dao.RoleMapper;
import com.example.demo.dao.RolePrivilegeMapper;
import com.example.demo.dao.extend.RoleExtendMapper;
import com.example.demo.utils.CustomerException;
@Service
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleMapper roleMapper;
	
	@Resource
	private RoleExtendMapper roleExtendMapper;
	
	@Resource
	private RolePrivilegeMapper rolePrivilegeMapper;
	
	@Override
	public void saveOrUpdateRole(Role role) {
		if(role.getId()==null) {
			//此处执行保存操作
			//判断用户名是否已经存在
			RoleExample example=new RoleExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andNameEqualTo(role.getName());
			List<Role> selectByExample = roleMapper.selectByExample(example);
			if(selectByExample.size()>0) {
				throw new CustomerException("该角色已经存在");
			}else {
				roleMapper.insert(role);
			}
		}else{
			roleMapper.updateByPrimaryKey(role);
		}		
	}

	@Override
	public void deleteRoleById(Long id) {
		roleMapper.deleteByPrimaryKey(id.intValue());
		
	}

	@Override
	public List<Role> findAll() {
		RoleExample example=new RoleExample();
		List<Role> roles = roleMapper.selectByExample(example);
		return roles;
	}

	@Override
	public void setPrivilege(Long id, Long[] ids) {
		//根据角色id获得角色与权限
		RolePrivilege privileges= roleExtendMapper.findRolePrivilege(id);
		
		System.out.println(privileges);
		//创建list集合用来接收原来的角色id
		List<Long> idss=new ArrayList<>();
		//根据角色id查出来的list集合
		List<Privilege> list = privileges.getPrivileges();		
		//遍历list集合获取每一个role值
		for(Privilege p:list) {
			idss.add(p.getId().longValue());
			System.out.println(p.getId()+".............");
		}
		//用旧的id值去对比新的
		for(Long id1:ids) {
			if(!idss.contains(id1)) {
				System.out.println(id1);
				com.example.demo.bean.RolePrivilege rolePrivilege=new com.example.demo.bean.RolePrivilege();
				rolePrivilege.setRoleId(id.intValue());
				rolePrivilege.setPrivilegeId(id1.intValue());
				rolePrivilegeMapper.insert(rolePrivilege);
			}
		}
		
		//用新的去对比旧的
		for(Long id2:idss) {
			List<Long> list1 = Arrays.asList(ids);
			if(!list1.contains(id2)) {
				RolePrivilegeExample example=new RolePrivilegeExample();
				com.example.demo.bean.RolePrivilegeExample.Criteria createCriteria = example.createCriteria();
				createCriteria.andRoleIdEqualTo(id.intValue()).andPrivilegeIdEqualTo(id2.intValue());
				rolePrivilegeMapper.deleteByExample(example);
			}
		}
	}
	
}
