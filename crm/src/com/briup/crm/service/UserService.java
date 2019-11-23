package com.briup.crm.service;

import com.briup.crm.domain.User;

public interface UserService {

	void regist(User user);

	User login(User user);
	
}
