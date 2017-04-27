package com.gzu.camel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.UserCustom;

@Service
public interface StoreUserService {
	//根据用户ID查询店铺信息
	  public  List<UserCustom> selectStoreUser(String userid)throws Exception;
	
	    //更新店铺
	    public void updateStoreUser(UserCustom record) throws Exception;
		//根据店铺ID查询店铺信息
	    public Store selectcStore(Integer storeid)  throws Exception;
	    
}
