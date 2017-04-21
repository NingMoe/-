package com.gzu.camel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.StoreMapper;
import com.gzu.camel.pojo.Store;
import com.gzu.camel.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreMapper storeMapper;
	@Override
	public List<Store> selectStore(Integer id) throws Exception {
		return storeMapper.selectStore(id);
	}

	@Override
	public int updateStore(Store store) throws Exception {
		return storeMapper.updateByPrimaryKey(store);
	}
	
}
