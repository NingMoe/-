package com.gzu.camel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gzu.camel.pojo.Product;
import com.gzu.camel.pojo.ProductCustom;
import com.gzu.camel.pojo.ProductSplitPageVo;
import com.gzu.camel.pojo.ProducttypeCustom;
import com.gzu.camel.pojo.ShopingcarCustom;
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
		return "user/product/product_info";
	}
	//获取登陆用户的ID
	public String queryUserid(HttpServletRequest request){
		return (String) request.getSession().getAttribute("userid");
	}
	//加入购物车
	@RequestMapping(value="addToCart",method={RequestMethod.GET})
	public String addToCart(Model model,Integer pid,HttpServletRequest request)throws Exception{
		String userid=queryUserid(request);
		if(userid==null){
			request.setAttribute("errorMsg","用户未登陆");
			//返回登录页
			return "";
		}else{
			ShopingcarCustom spCustom=new ShopingcarCustom();
			spCustom.setPid(pid);
			spCustom.setUserid(userid);
			spCustom.setNumber(1);
			if(productService.queryCarByUPid(spCustom)==null){
				
				//加入购物车
				productService.addToCart(spCustom);
			}
			
			return "forward:/product/showCar.action";
		}
		
	}
	
	//显示购物车商品信息
	@RequestMapping(value="showCar")
	public String showCar(Model model,HttpServletRequest request) throws Exception{
		String userid=queryUserid(request);
		List<ShopingcarCustom> allCarProduct=new ArrayList<ShopingcarCustom>();
		if(userid==null){
			request.setAttribute("errorMsg","用户未登陆");
			//返回登录页
			return "";
			}else{
				//查询购物车里的信息
				allCarProduct=productService.queryCar(userid);
				model.addAttribute("allCarProduct", allCarProduct);
				return "user/car/car";
				
			}
		
	}
	
	//修改购物车信息
	@RequestMapping(value="/DeleteProduct",method={RequestMethod.GET})
	public String DeleteProduct(Integer pid,HttpServletRequest request) throws Exception{
		String userid=(String)queryUserid(request);
		ShopingcarCustom sCustom=new ShopingcarCustom(); 
		sCustom.setPid(pid);
		sCustom.setUserid(userid);
		productService.deleteProduct(sCustom);
		return "forward:/product/showCar.action";
	}
	
	
}
