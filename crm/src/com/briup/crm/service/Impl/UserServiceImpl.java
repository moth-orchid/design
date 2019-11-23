package com.briup.crm.service.Impl;
import org.springframework.transaction.annotation.Transactional;

import com.briup.crm.dao.UserDao;
import com.briup.crm.domain.User;
import com.briup.crm.service.UserService;
import com.briup.crm.util.MD5Utils;
@Transactional
public class UserServiceImpl implements UserService{
	//注入dao
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void regist(User user) {
		//对密码进行加密--这里使用MD5加密算法
		String password = MD5Utils.md5(user.getUser_password());
		user.setUser_password(password);
		//设置状态码，1表示状态正常，0表示用不了了
		user.setUser_state("1");	
		userDao.save(user);
		
	}
	//业务层用户登录的方法
	@Override
	public User login(User user) {
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		User exitUser=userDao.login(user);
		return exitUser;
	}

}
