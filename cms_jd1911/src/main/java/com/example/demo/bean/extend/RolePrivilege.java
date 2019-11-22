package com.example.demo.bean.extend;

import java.util.List;

import com.example.demo.bean.Privilege;
import com.example.demo.bean.Role;

public class RolePrivilege extends Role{
	private List<Privilege> privileges;

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	@Override
	public String toString() {
		return "RolePrivilege [privileges=" + privileges + "]";
	}

	
	
	
	
	
}
