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
import com.gzu.camel.pojo.ProducttypeCustom;
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
	
	//首頁
	@RequestMapping(value="/index",method={RequestMethod.GET})
	public String index(Model model,ProductSplitPageVo pageVo) throws Exception{
		List<Product> allProduct=new ArrayList<Product>();
		List<ProducttypeCustom> allType=new ArrayList<ProducttypeCustom>();
		//為首次進入頁面設置默認值
		if(pageVo.getProductCustom()==null){
			ProductCustom productCustom=new ProductCustom();
			productCustom.setStart(0);
			productCustom.setPageSize(13);
			productCustom.setPname("");
			productCustom.setTypeid(null);
			pageVo.setProductCustom(productCustom);
		}else{
			//設置開始查詢的位置
			int start=(pageVo.getProductCustom().getCurrentPage()-1)*pageVo.getProductCustom().getPageSize();
			pageVo.getProductCustom().setStart(start);
		}
			//分頁功能
			allProduct=productService.splitPage(pageVo);
			allType=productService.queryProductType();
			
		model.addAttribute("allProduct", allProduct);
		model.addAttribute("allType", allType);
		return "user/index";
	}
	
	//商品詳情頁
	@RequestMapping(value="details",method={RequestMethod.GET})
	public String productDetails(Integer pid,Model model) throws Exception{
		ProductCustom productDetails=productService.queryProductDetails(pid);
		model.addAttribute("productDetails", productDetails);
		return "";
	}
	
	
}
