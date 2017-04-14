package com.gzu.camel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.ProductMapper;
import com.gzu.camel.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productMapper;

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

}
