package com.gzu.camel.service;

import com.gzu.camel.pojo.User;

public interface LogRegService {
	public void login(String id,String password) throws Exception;
	public void reg(User user)throws Exception;
}
