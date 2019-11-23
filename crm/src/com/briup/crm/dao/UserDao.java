package com.briup.crm.dao;

import com.briup.crm.domain.User;

public interface UserDao {

	void save(User user);

	User login(User user);

}
