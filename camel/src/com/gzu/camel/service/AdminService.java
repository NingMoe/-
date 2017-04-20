package com.gzu.camel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.User;

@Service
public interface AdminService {
	public List<User> queryAllUser()throws Exception;
}
