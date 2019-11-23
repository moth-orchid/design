package com.briup.crm.dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.briup.crm.dao.UserDao;
import com.briup.crm.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	//用户注册的dao层方法
	@Override
	public void save(User user) {		
		this.getHibernateTemplate().save(user);
	}
	
	//用户登录的dao层方法
	@Override
	public User login(User user) {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where user_code=? and user_password=?", user.getUser_code(),user.getUser_password());
			if(list.size()>0) {
				return list.get(0);
			}
		return null;
	}

}
