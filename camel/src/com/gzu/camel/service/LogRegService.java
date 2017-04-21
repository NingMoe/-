package com.gzu.camel.service;

import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.User;
@Service
public interface LogRegService {
	//查找用户的密码
	public User login(String id) throws Exception;
	//添加用户信息
	public int insertUser(User user)throws Exception;
	//查询用户的类型
	public String selectTypeByid(String id)throws Exception;
}
