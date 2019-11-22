package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.util.Base64Util;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Role;
import com.example.demo.bean.User;
import com.example.demo.bean.UserExample;
import com.example.demo.bean.UserExample.Criteria;
import com.example.demo.bean.UserRole;
import com.example.demo.bean.UserRoleExample;
import com.example.demo.dao.UserMapper;
import com.example.demo.dao.UserRoleMapper;
import com.example.demo.dao.extend.UserExtendMapper;
import com.example.demo.utils.CustomerException;
import com.example.demo.utils.MD5Utils;
@Service
public class UserServiceImpl implements UserService{

	@Resource
	public UserMapper userMapper;
	
	@Resource
	private UserExtendMapper userExtendMapper;
	
	@Resource
	private UserRoleMapper userRoleMapper;
	
	//查询所有用户
	@Override
	public List<User> findAllUser() {
		UserExample example=new UserExample();
		List<User> list = userMapper.selectByExample(example);
		return list;
	}
	
	//级联查询所有用户
		@Override
		public List<com.example.demo.bean.extend.UserRole> cascadeRoleFindAll() {
			List<com.example.demo.bean.extend.UserRole> userRoles = userExtendMapper.cascadeRoleFindAll();
			return userRoles;
		}
	
	//根据用户的id删除用户
	@Override
	public void deleteUserById(Long id) {
		//判断用户的id是否存在
		User user = userMapper.selectByPrimaryKey(id.intValue());
		if(user==null) {
			throw new CustomerException("不好意思，你想要删除的用户不存在");
		}else {
			userMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	//保存或者更新用户
	@Override
	public void saveOrUpdate(User user) {
		//判断用户的id是否存在
		if(user.getId()==null) {
			//此处执行保存操作
			//判断用户名是否已经存在
			UserExample example=new UserExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andUsernameEqualTo(user.getUsername());
			List<User> selectByExample = userMapper.selectByExample(example);
			String encode = Base64Util.encode(user.getPassword());
			user.setPassword(encode);
			if(selectByExample.size()>0) {
				throw new CustomerException("用户名已经存在");
			}else {
				user.setStatus(1);
				userMapper.insert(user);
			}
		}else{
			userMapper.updateByPrimaryKey(user);
		}
		
	}
	@Override
	public void setRoles(Long user_id, Long[] role_id) {
		com.example.demo.bean.extend.UserRole selectAll = userExtendMapper.selectAll(user_id);
		//创建list集合用来接收原来的角色id
		List<Long> ids=new ArrayList<>();
		//根据角色id查出来的list集合
		List<Role> list = selectAll.getList();		
		//遍历list集合获取每一个role值
		for(Role role:list) {
			ids.add(role.getId().longValue());
		}
		//用旧的id值去对比新的
		for(Long id:role_id) {
			if(!ids.contains(id)) {
				UserRole userRole=new UserRole();
				userRole.setRoleId(id.intValue());
				userRole.setUserId(user_id.intValue());
				userRoleMapper.insert(userRole);
			}
		}
		
		//用新的去对比旧的
		for(Long id:ids) {
			List<Long> list1 = Arrays.asList(role_id);
			if(!list1.contains(id)) {
				UserRoleExample example=new UserRoleExample();
				com.example.demo.bean.UserRoleExample.Criteria createCriteria = example.createCriteria();
				createCriteria.andUserIdEqualTo(user_id.intValue()).andRoleIdEqualTo(id.intValue());
				userRoleMapper.deleteByExample(example);
			}
		}
	}
	
	

}
