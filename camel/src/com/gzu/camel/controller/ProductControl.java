package com.gzu.camel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gzu.camel.service.ProductService;

@Controller
public class ProductControl {
	@Autowired
	private ProductService productService;
	
	/**
	 * @author asus
	 * Description:根据商品名字模糊查询
	 * @return 返回整数
	 * @throws Exception
	 */
	//@RequestMapping(value = "/queryCount.action", method = RequestMethod.GET)
	@RequestMapping("/queryCount")
	public ModelAndView queryCount()throws Exception{
		int count=productService.countByProductName("1");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("count",count);
		modelAndView.setViewName("user/index");
		return modelAndView;
	}
}
