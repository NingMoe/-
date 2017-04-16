package com.gzu.camel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gzu.camel.pojo.Product;
import com.gzu.camel.pojo.ProductCustom;
import com.gzu.camel.pojo.ProductSplitPageVo;
import com.gzu.camel.service.ProductService;

@Controller
@RequestMapping("/product")
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
	@RequestMapping(value="/queryCount",method={RequestMethod.GET})
	public String queryCount(Model model)throws Exception{
		int count=productService.countByProductName("1");
		model.addAttribute("count", count);
		return "user/index";
	}
	@RequestMapping(value="/splitPage",method={RequestMethod.GET})
	public String splitPage(Model model) throws Exception{
		ProductSplitPageVo productSplitPageVo=new ProductSplitPageVo();
		ProductCustom productCustom=new ProductCustom();
		productCustom.setCurrentPage(1);
		productCustom.setPageSize(1);
		productCustom.setPname("");
		productCustom.setTypeid(1);
		
		productSplitPageVo.setProductCustom(productCustom);
		List<Product> allProduct=new ArrayList<Product>();
		allProduct=productService.splitPage(productSplitPageVo);
		model.addAttribute("allProduct", allProduct);
		return "user/index";
	}
}
