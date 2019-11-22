package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.bean.extend.UserRole;
import com.example.demo.bean.extend.UserVM;

public interface UserLoginService {

	User login(UserVM user);
	
	UserRole findUser(Long user);
}
