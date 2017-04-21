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
import org.springframework.web.servlet.ModelAndView;

import com.gzu.camel.pojo.Admin;
import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.AdminService;

@Controller
@RequestMapping(value="/admin")
public class AdminControl {
	
	@Autowired
	private AdminService adminService;
	//管理员用户列表查询的页面(ok)************************
	@RequestMapping(value="/userInfo")
	public String userInfo(Model model) throws Exception{
		List<User> allUser=new ArrayList<User>();
		allUser=adminService.queryAllUser();
		model.addAttribute("allUser", allUser);
		return "admin/admin";
	}
	//查询用户的详细信息(ok)***************************
		@RequestMapping(value="/selectuser")
		public String selectUser(Model model,User user) throws Exception{
			List<User> users = new ArrayList<User>();
			users = adminService.selectUserByid(user.getUserid());
			model.addAttribute("user", users);
			return "admin/admininfo"; 
			//返回用户详情界面
		}
		//管理员删除用户（ok）*************************
		@RequestMapping(value="/userdelete")
		public String deletUser(User user) throws Exception{
			if(user.getUserid()!=null){
				adminService.deletUser(user.getUserid());
			}
			return"admin/admin";//返回用户查询首页
		}
	//管理员插入用户数据（ok）***************************
	@RequestMapping(value="/userinsert")
	public String insertUser(@Validated User user ,BindingResult result,Model model) throws Exception{
		if(user.getUserid().equals(adminService.selectid(user.getUserid()))){
			return "forward";
		}
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError objectError:errors){
				System.out.println(objectError.getCode());
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("errors", errors);
			return "login_reg/register";
		}else{
		    adminService.insertUser(user);
		return "success";} //返回jsp登陆页面   
	}
	
	//管理员更新用户（ok）**********************************
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
		adminService.updateUser(user);
		return "success";} //返回jsp登陆页面  
	 }


//********************************用户商家分界线************************************************************
	//管理员对商铺列表的查询(ok)***********************
	@RequestMapping(value="/storeInfo")
	public String storeinfo(Model model)throws Exception{
		List<Store> allStores = new ArrayList<Store>();
		allStores = adminService.findAllStores();
		model.addAttribute("allsStores", allStores);
		return "store/admin";
	}
	//管理员插入店铺信息(ok)*************************************
	@RequestMapping(value="/storeinsert")
	public String insertStore(@Validated Store store ,BindingResult result,Model model) throws Exception{
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError objectError:errors){
				System.out.println(objectError.getCode());
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("errors", errors);
			return "success";//返回插入信息的页面
		}else{
		    adminService.insertStore(store);
		return "success";
		} //返回jsp登陆页面   
	}
	//管理员删除店铺（ok）*************************
	@RequestMapping(value="/storedelete")
	public String deletStore(Store store) throws Exception{
		if(store.getStoreid()!=null){
			adminService.deletStore(store.getStoreid());
		}
		return"success";//返回用户查询首页
	}
	//管理员更新店铺信息(ok)***************************
	@RequestMapping(value="/storeupdate")
	public String updatestore(@Validated Store store ,BindingResult result,Model model) throws Exception{
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError objectError:errors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("errors", errors);
			return "success";//修改页面
		}else {
		adminService.updateStore(store);
		return "success";} //返回跳转页 
	 }
	//查询店铺的详细信息*********************************
	@RequestMapping(value="/selectstore")
	public String selectStore(Model model,Store store) throws Exception{
		List<Store> store2 = new ArrayList<Store>();
		store2 = adminService.selectStore(store.getStoreid());
		model.addAttribute("user", store2);
		return "admin/admininfo"; //展示页面
		//返回用户详情界面
	}
	//管理员登陆
	@RequestMapping(value="/adminlogin")
	public String adminlogin(Admin admin)throws Exception{
		Admin admin2 = new Admin();
		admin2 = adminService.login(admin.getAdminid());
		if(admin2!=null){
			if(admin.getAdminid()!=null&&admin.getAdminpassword()!=null){
				if(admin2.getAdminid().equals(admin.getAdminid())){
					return "";//管理界面
				}return "";//错误界面，密码或id不能为空
			}return "";//用户不存在
		}
		return "失败";//
	}
}
