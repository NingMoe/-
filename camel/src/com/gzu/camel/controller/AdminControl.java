package com.gzu.camel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.camel.pojo.User;
import com.gzu.camel.service.AdminService;

@Controller
@RequestMapping(value="/admin")
public class AdminControl {
	@Autowired
	private AdminService adminService;
	
	
	@RequestMapping(value="/userInfo")
	public String userInfo(Model model) throws Exception{
		List<User> allUser=new ArrayList<User>();
		allUser=adminService.queryAllUser();
		model.addAttribute("allUser", allUser);
		return "admin/admin";
	}
}
