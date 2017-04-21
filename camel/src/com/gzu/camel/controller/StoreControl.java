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

import com.gzu.camel.pojo.Store;
import com.gzu.camel.service.StoreService;


@Controller
@RequestMapping(value="Store")
public class StoreControl {
	
	@Autowired
	private StoreService storeService; 
	
	//查询店铺信息
	@RequestMapping(value="/selectstore")
	public String selectStore(Model model,Store store) throws Exception{
		List<Store> store2 = new ArrayList<Store>();
		store2 = storeService.selectStore(store.getStoreid());
		model.addAttribute("user", store2);
		return "admin/admininfo"; //展示页面
		//返回用户详情界面
	}
	
	//更新店铺信息
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
		storeService.updateStore(store);
		return "success";} //返回跳转页 
	 }
	
	
}
