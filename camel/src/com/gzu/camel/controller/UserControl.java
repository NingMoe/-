package com.gzu.camel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.camel.mapper.UserMapper;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.AdminService;
import com.gzu.camel.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserControl {
@Autowired
private UserService userService;
@Autowired
private AdminService adminService;

//查询用户信息
@RequestMapping(value="/selectuser")
public String selectUser(Model model,User user) throws Exception{
	List<User> users = new ArrayList<User>();
	users = userService.selectUserByid(user.getUserid());
	model.addAttribute("user", users);
	return "admin/admininfo"; 
	//返回用户详情界面
}

//更新用户信息
@RequestMapping(value="/userupdate")
public String updateUser(@Validated User user ,BindingResult result,Model model) throws Exception{
	if (result.hasErrors()) {
		List<ObjectError> errors = result.getAllErrors();
		for(ObjectError objectError:errors){
			System.out.println(objectError.getDefaultMessage());
		}
		model.addAttribute("errors", errors);
		return "admin/admininfo";
	}else {
		userService.updateUser(user);
	return "success";} //返回jsp登陆页面  
 }

@RequestMapping(value="/userinsert")
public String insertUser(@Validated User user,BindingResult result,Model model) throws Exception{
	
	if(user.getUserid()==null){
		return "login_reg/register";
	}
	
	if (result.hasErrors()) {
		List<ObjectError> errors = result.getAllErrors();
		for(ObjectError objectError:errors){
			System.out.println(objectError.getDefaultMessage());
		}
		model.addAttribute("errors", errors);
		return "login_reg/register";
	}else{
	
	
		adminService.insertUser(user);
		return "login_reg/login";
		
	}
	
}

}
