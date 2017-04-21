package com.gzu.camel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.User;

@Service
public interface UserService {
	//查询个人信息
	public List<User> selectUserByid(String userid)throws Exception;
	//修改个人信息
	public int updateUser(User user)throws Exception;
}
