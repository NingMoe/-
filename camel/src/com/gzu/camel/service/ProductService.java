package com.gzu.camel.service;

import org.springframework.stereotype.Service;
@Service
public interface ProductService {
	
	public int countByProductName(String name) throws Exception;

}
