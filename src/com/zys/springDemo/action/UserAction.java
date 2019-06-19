package com.zys.springDemo.action;

import com.zys.springDemo.bean.User;

public class UserAction {
	private User user;
	public void print(){
		System.out.println(user.getName());
	}
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user=user;
	}
}
