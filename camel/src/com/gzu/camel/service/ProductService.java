package com.gzu.camel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.Product;
import com.gzu.camel.pojo.ProductCustom;
import com.gzu.camel.pojo.ProductSplitPageVo;
import com.gzu.camel.pojo.ProducttypeCustom;
import com.gzu.camel.pojo.ShopingcarCustom;
@Service
public interface ProductService {
	//根据商品名字查询数据库
	public int countByProductName(String name) throws Exception;
	//商品分页
	public List<Product> splitPage(ProductSplitPageVo productSplitPageVo)throws Exception;
	//查詢商品所有分類
	public List<ProducttypeCustom> queryProductType()throws Exception;
	//查詢商品詳細信息
	public ProductCustom queryProductDetails(int pid)throws Exception;
	//加入购物车
	public void addToCart(ShopingcarCustom shopingcarCustom)throws Exception;
	//根据用户ID查询购物车
	public List<ShopingcarCustom> queryCar(String userid)throws Exception;
	//删除购物车商品
	public void deleteProduct(ShopingcarCustom spCustom)throws Exception;
}
