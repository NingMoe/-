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



import com.gzu.camel.pojo.User;
import com.gzu.camel.service.AdminService;
import com.gzu.camel.service.LogRegService;



@Controller
@RequestMapping(value="/loginReg")
public class LogRegControl {
	
	@Autowired
	private LogRegService logRegService;
	@Autowired
	private AdminService adminService;
	
	//注册（ok）**************************
	
		
		@RequestMapping(value="/Reg")
		public String insert(@Validated User user ,BindingResult result,Model model) throws Exception{
			if (result.hasErrors()) {
				List<ObjectError> errors = result.getAllErrors();
				for(ObjectError objectError:errors){
					System.out.println(objectError);
					System.out.println(new String(objectError.getDefaultMessage()));
				}
				model.addAttribute("errors", errors);
				return "login_reg/register";
				}
				user.setUtype("1");
				user.setUmoney(1000d);
				logRegService.insertUser(user); 
				return "login_reg/login";//注册成功，跳转页，返回登陆界面
				
				
			}
	
	//登陆（ok）*******************************************
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request,User user,Model model) throws Exception{
		
		if(user.getUserid()==null||user.getUpassword()==null){
			return "login_reg/login";
		}
		
		User user2=new User();
		user2=logRegService.login(user.getUserid());
		if(user2!=null){
			if((user.getUpassword()).equals(user2.getUpassword())&&(user.getUserid()).equals(user2.getUserid())){
				request.getSession().setAttribute("userid", user.getUserid());
				if("1".equals(user2.getUtype())){
					return "user/index";  //返回商城首页(用户)
				}
				else{
				return "store/info";      //店铺首页（商家）
				}
				}
					return "login_reg/login";//用户不存在
		}else{
			return "login_reg/login";//登陆界面
		}
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "success";//登出，返回登陆界面
	}
}
