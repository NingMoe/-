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
import com.gzu.camel.service.UserService;

@Controller
@RequestMapping(value="/admin")
public class AdminControl {
	
	@Autowired
	private AdminService adminService;
	//管理员对商铺的模糊查询
	@RequestMapping(value="/selectAllStoreBy")
	public String selectAllStoreBy(String nameorid,Model model,Store store)throws Exception{
		List<Store> somestore = new ArrayList<Store>();
		somestore = adminService.selectAllStoreBy(nameorid);
		model.addAttribute("somestore", somestore);
		return "store/store_info2";//管理员管理商铺页面（商铺列表）
	}
	//管理员对用户的模糊查询
	@RequestMapping(value="/selectAllUserBy")
	public String selectAllUserBy(String nameorid,Model model)throws Exception{
		List<User> someUsers = new ArrayList<User>();
		someUsers = adminService.selectAllUserBy(nameorid);
		model.addAttribute("someUsers",someUsers);
		return "user/user_Info/user_info2";//管理员管理用户界面（用户列表）
	}
	//管理员用户列表查询的页面(ok)************************
	@RequestMapping(value="/userInfo")
	public String userInfo(Model model) throws Exception{
			
			List<User> allUser=new ArrayList<User>();
			allUser=adminService.queryAllUser();
			model.addAttribute("allUser", allUser);
			return "user/user_Info/user_info";//管理员管理用户界面（用户列表）
		
		
	}
	//查询用户的详细信息(ok)***************************
	@RequestMapping(value="/selectuser")
		public String selectUser(Model model,User user) throws Exception{
			user = adminService.selectUserByid(user.getUserid());
			model.addAttribute("user", user);
			return "user/user_Info/userinfo"; //用户的详情页
		}
	@RequestMapping(value="/selectuserforstore")
	public String selectUsers(Model model,User user) throws Exception{
		user = adminService.selectUserByid(user.getUserid());
		model.addAttribute("user", user);
		return "store/storeinsert"; //用户的详情页
	}
		//管理员删除用户（ok）*************************
		@RequestMapping(value="/userdelete")
		public String deletUser(User user) throws Exception{
			adminService.deletUser(user.getUserid());
			return"redirect:userInfo.action";//管理员管理用户界面（用户列表）
		}
	//管理员插入用户数据（ok）***************************
	@RequestMapping(value="/userinsert")
	public String insertUser(@Validated User user,BindingResult result,Model model) throws Exception{
		
		if(user.getUserid()==null){
			return "admin/register";
		}
		
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError objectError:errors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("errors", errors);
			return "admin/register";
		}
		
		if(!((user.getUserid()).equals(adminService.selectid(user.getUserid())))){
			user.setUmoney(1000d);
			adminService.insertUser(user);
			return "redirect:userInfo.action";
			}else {
				return "login_reg/haha";//跳转页用户存在
			}
		
		
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
			return "admin/register";
		}
		user.setUmoney(1000d);
		adminService.updateUser(user);
		return "redirect:userInfo.action";
		}//管理员管理用户界面（用户列表） 


//********************************用户商家分界线************************************************************
	//管理员对商铺列表的查询(ok)***********************
	@RequestMapping(value="/storeInfo")
	public String storeinfo(Model model)throws Exception{
		List<Store> allStores = new ArrayList<Store>();
		allStores = adminService.findAllStores();
		model.addAttribute("allStores", allStores);
		return "store/store_info";//管理员管理商铺界面（商铺列表）
	}
	//管理员插入店铺信息(ok)*************************************
	@RequestMapping(value="/storeinsert")
	public String insertStore(Model model,@Validated Store store,BindingResult result,@Validated User user,BindingResult result2) throws Exception{
		if(store.getUserid()==null||store.getSname()==null||store.getSphone()==null||store.getStoreid()==null){
			return "store/storeinsert";
		}
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError objectError:errors){
				System.out.println(objectError.getCode());
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("errors", errors);
			return "store/storeinsert";//返回插入信息的页面
		}
			Store store2 = new Store();
			store2 = adminService.selectStoreByUserid(user.getUserid());
			if(store2!=null){
				if((user.getUserid()).equals(store2.getUserid())){      //判断商铺的用户id在商铺中存在
				return "store/storeinsert";
				}
				return "store/storeinsert";
		    //管理员管理商铺界面（商铺列表）
			}
			adminService.insertStore(store);
		    return "redirect:storeInfo.action";
			
	}
	
	//管理员删除店铺（ok）*************************
	@RequestMapping(value="/storedelete")
	public String deletStore(Store store) throws Exception{
			adminService.deletStore(store.getStoreid());
		return"redirect:storeInfo.action";//管理员管理商铺界面（商铺列表）
	}
	//管理员更新店铺信息(ok)***************************
	@RequestMapping(value="/storeupdate")
	public String updatestore(@Validated Store store,BindingResult result,Model model) throws Exception{
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError objectError:errors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("errors", errors);
			return "store/store_info";//修改页面
		}else {
		adminService.updateStore(store);
		return "redirect:storeInfo.action";} //管理员管理商铺界面（商铺列表） 
	 }
	
	//查询店铺的详细信息*********************************
	@RequestMapping(value="/selectstore")
	public String selectStore(Model model,Store store) throws Exception{
		store = adminService.selectStore(store.getStoreid());
		model.addAttribute("store", store);
		return "store/storeinfo"; //商铺详情页
	}
	
	//管理员登陆
	@RequestMapping(value="/adminlogin")
	public String adminlogin(Admin admin)throws Exception{
		
		if(admin.getAdminid()==null||admin.getAdminpassword()==null){
			return "login_reg/Adminlogin";
		}
		
		Admin admin2=new Admin();
		admin2=adminService.login(admin.getAdminid());
		
		if(admin2!=null){
			if((admin2.getAdminid()).equals(admin.getAdminid())&&(admin2.getAdminpassword()).equals(admin.getAdminpassword())){
				return "admin/admin";
			}
			return "login_reg/Adminlogin";
		}
	return "admin/Backstage";
	}	
	//重置
	@RequestMapping(value="/adminreset")
	public String adminreset()throws Exception{
		return "login_reg/Adminlogin";
	}
}

