package com.gzu.camel.pojo.userstore;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.UserMapper;
import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.UserCustom;
import com.gzu.camel.service.StoreUserService;
@Service
public class StoreUserServiceImpl implements StoreUserService {
	private UserMapper userMapper;
//用户ID查询店铺
	@Override
	public List<UserCustom> selectStoreUser(String userid) throws Exception {
		
		return userMapper.selectStoreUser(userid);
	}
//更新店铺信息
	@Override
	public void updateStoreUser(UserCustom record) throws Exception {
		
		 userMapper.updateStoreUser(record);
	}
//店铺ID查询店铺信息
	@Override
	public Store selectcStore(Integer storeid) throws Exception {
		
		return  userMapper.selectByStoreId(storeid);
	}
}
