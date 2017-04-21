package com.gzu.camel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.UserMapper;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.UserService;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserMapper userMapper;

@Override
public List<User> selectUserByid(String userid) throws Exception {
	return userMapper.selectUser(userid);
}

@Override
public int updateUser(User user) throws Exception {
	return userMapper.updateByPrimaryKey(user);
}

	

}
