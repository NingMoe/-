package com.gzu.camel.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.UserMapper;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.LogRegService;

@Service
public class LogRegServiceImpl implements LogRegService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(String id) throws Exception {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
		
	}

	@Override
	public int insertUser(User user) throws Exception {
		int result=userMapper.insert(user);
		return result;
	}

	@Override
	public String selectTypeByid(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
