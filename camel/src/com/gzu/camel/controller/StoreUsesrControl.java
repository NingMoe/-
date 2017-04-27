package com.gzu.camel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.UserCustom;
import com.gzu.camel.service.StoreUserService;

@Controller
@RequestMapping("/StoreUsesrControl")

	
public class StoreUsesrControl {
	@Autowired
	private StoreUserService storeUserService;
	@RequestMapping(value="/selectStoreUser")
public String selectStoreUser(HttpServletRequest request,Model model, String userid)throws Exception {
		
		/*获取登陆用户的ID
		String a =  (String) request.getSession().getAttribute("userid");*/
		
		//调用service根据商品id查询商品信息
		 List<UserCustom> userCustom = storeUserService.selectStoreUser((String) request.getSession().getAttribute("userid"));
		model.addAttribute("userCustom", userCustom);
		return "store/store";
		}
	//商铺信息修改提交
		@RequestMapping("/updateStoreSubmit")
		public String updateStoreSubmit(HttpServletRequest request,Integer id,UserCustom userCustom)throws Exception {
			
			//调用service更新商品信息，页面需要将商品信息传到此方法
			storeUserService.updateStoreUser(userCustom);
			return "store/store_info3";
			}
		
		@RequestMapping(value="selectcStore")
		public Store selectcStore(Integer storeid,HttpServletRequest request)throws Exception{
			return storeUserService.selectcStore((Integer) request.getSession().getAttribute("storeid"));
			
				
		}


}
