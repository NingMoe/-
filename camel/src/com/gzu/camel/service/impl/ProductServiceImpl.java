package com.gzu.camel.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.ProductMapper;
import com.gzu.camel.mapper.ProducttypeMapper;
import com.gzu.camel.pojo.Product;
import com.gzu.camel.pojo.ProductCustom;
import com.gzu.camel.pojo.ProductSplitPageVo;
import com.gzu.camel.pojo.ProducttypeCustom;
import com.gzu.camel.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private ProducttypeMapper producttypeMapper;

	/**
	 * @author asus
	 * Description:根据商品名字模糊查询
	 * @return 返回整数
	 * @throws Exception
	 */
	@Override
	public int countByProductName(String name) throws Exception {
		int x=productMapper.countByProductName(name);
		return x;
	}

	@Override
	public List<Product> splitPage(ProductSplitPageVo productSplitPageVo) throws Exception {
		List<Product> allProduct=new ArrayList<Product>();
		allProduct=productMapper.selectSplitPage(productSplitPageVo);
		return allProduct;
	}

	@Override
	public List<ProducttypeCustom> queryProductType() throws Exception {
		List<ProducttypeCustom> allType=new ArrayList<ProducttypeCustom>();
		allType=producttypeMapper.selectproducttype();
		return allType;
	}

	@Override
	public ProductCustom queryProductDetails(int pid) throws Exception {
		return productMapper.selectProductDetails(pid);
	}

}
