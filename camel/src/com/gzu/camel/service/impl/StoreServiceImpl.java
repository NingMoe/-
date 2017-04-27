package com.gzu.camel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.StoreMapper;
import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreMapper storeMapper;
	

	@Override
	public int updateStore(Store store) throws Exception {
		return storeMapper.updateByPrimaryKey(store);
	}

	@Override
	public List<User> selectAllStoreBy(String nameorid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Store> selectStore(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
