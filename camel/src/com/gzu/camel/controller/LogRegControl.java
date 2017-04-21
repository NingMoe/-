package com.gzu.camel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;


import com.gzu.camel.mapper.UserMapper;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.LogRegService;

@Controller
@RequestMapping(value="/loginReg")
public class LogRegControl {
	
	@Autowired
	private LogRegService logRegService;
	
	//注册（ok）**************************
	@RequestMapping(value="/Reg")
	public String insert(@Validated User user ,BindingResult result,Model model) throws Exception{

			if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError objectError:errors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("errors", errors);
			return "login_reg/register";
			
		}else {
			user.setUtype("1");
			user.setUmoney(1000d);
		logRegService.insertUser(user);
		return "success";} //返回jsp登陆页面   
	}
	
	//登陆（ok）*******************************************8
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request, User user) throws Exception{
		User user2=new User();
		user2=logRegService.login(user.getUserid());
		if(user2!=null){
			if(user.getUpassword().equals(user2.getUpassword())){
				request.getSession().setAttribute("userid", user.getUserid());
				if("1".equals(user2.getUtype())){
					request.setAttribute("url", "/camel/product/index.action");
					request.setAttribute("message", "成功");
					return "forward";  //返回商城首页
				}
				if("2".equals(user2.getUtype())){
				return "success";  //店铺首页
				}
				else{
						return "failed";  //失败页面
					}
				}else{
					return "failed";//失败页面
					
				}
		}else{
			return "failed";//失败页面
		}
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "success";//haha
	}
}
