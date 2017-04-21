package com.gzu.camel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.User;
@Service
public interface StoreService {
	//查询信息
	public List<Store> selectStore(Integer id)throws Exception;
	//修改信息
	public int updateStore(Store store)throws Exception;
}
