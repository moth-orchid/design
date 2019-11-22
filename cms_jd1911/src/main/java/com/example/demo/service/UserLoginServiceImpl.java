package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.util.Base64Util;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.bean.UserExample;
import com.example.demo.bean.UserExample.Criteria;
import com.example.demo.bean.extend.UserRole;
import com.example.demo.bean.extend.UserVM;
import com.example.demo.dao.UserMapper;
import com.example.demo.dao.extend.UserExtendMapper;
import com.example.demo.utils.CustomerException;
import com.example.demo.utils.MD5Utils;
@Service
public class UserLoginServiceImpl implements UserLoginService{
	 
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private UserExtendMapper userExtendMapper;
	
	@Override
	public User login(UserVM user) {
		user.setPassword(Base64Util.encode(user.getPassword()));
		UserExample example=new UserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		List<User> list = userMapper.selectByExample(example);
		if(list.size()>0) {
			return list.get(0);
		}else {
			throw new CustomerException("用户名或者密码有误");
		}
	}

	@Override
	public UserRole findUser(Long id) {
		UserRole user = userExtendMapper.selectAll(id);
		return user;
	}

}
