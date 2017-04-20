package com.gzu.camel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.UserMapper;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
@Autowired
private UserMapper usermapper;
	@Override
	public List<User> queryAllUser() throws Exception {
		return usermapper.selectAllUser();
	}

}
