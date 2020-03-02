package com.yhl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhl.dao.UserDao;
import com.yhl.entity.User;
@Service
public class UserSelectByNameAndAge implements UserSelect{
	
	
	@Autowired
	private UserDao userDao;
	 
	@Override
	public List<User> queryByAgeAndName(String userName, Integer userAge) {
		List<User> list=userDao.queryByAgeAndName(userName, userAge);
		return list;
	}

	@Override
	public void insertUser(User user1) {
		userDao.insertUser(user1);
		
	}

	@Override
	public void deleteUser(User user1) {
		userDao.deleteUser(user1);
		
	}
	
}
