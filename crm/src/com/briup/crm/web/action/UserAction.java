package com.briup.crm.web.action;

import com.briup.crm.domain.Customer;
import com.briup.crm.domain.User;
import com.briup.crm.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	@Override
	public User getModel() {	
		return user;
	}
	/* 要在这里调用业务层，所以就将Service注入 */
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//用户注册的方法
	public String regist() {
		userService.regist(user);
		return LOGIN;
	}
	//用户登录的方法
	public String login() {
		User exituser=userService.login(user);
		if(exituser==null) {
			this.addActionError("用户名或者密码错误");
			return LOGIN;
		}else {
			ActionContext.getContext().getSession().put("exituser", exituser);
			return SUCCESS;
		}
	}
	
}
