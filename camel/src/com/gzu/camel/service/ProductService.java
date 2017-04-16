package com.gzu.camel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.Product;
import com.gzu.camel.pojo.ProductSplitPageVo;
@Service
public interface ProductService {
	//根据商品名字查询数据库
	public int countByProductName(String name) throws Exception;
	//商品分页
	public List<Product> splitPage(ProductSplitPageVo productSplitPageVo)throws Exception;
}
