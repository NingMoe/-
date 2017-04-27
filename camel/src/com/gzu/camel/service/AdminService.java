package com.gzu.camel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.camel.pojo.Admin;
import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.User;

@Service
public interface AdminService {
	//用户的模糊查询
	public List<User> selectAllUserBy(String nameorid)throws Exception;
	//查询用户信息
	public List<User> queryAllUser()throws Exception;
	//查询单个用户信息
	public User selectUserByid(String userid)throws Exception;
	//添加用户
	public int insertUser (User user)throws Exception;
	//删除用户（根据id）
	public int deletUser(String userid)throws Exception;
	//变更用户信息(根据id)
	public int updateUser(User user)throws Exception;
	//查询用户信息（根据id模糊查询）
	public User selectUser(String userid)throws Exception;
	//查询id是否重复
	public String selectid(String id)throws Exception;
	//查询商家信息
	public List<Store> findAllStores()throws Exception;
	//添加商家
	public int insertStore(Store Store)throws Exception;
	//删除商家
	public void deletStore(Integer id)throws Exception;
	//查询商家
	public Store selectStore(Integer id)throws Exception;
	//变更商家数据
	public int updateStore(Store store)throws Exception;
	//管理员登陆
	public Admin login(String adminid)throws Exception;
	//管理员模糊查询商铺
	public List<Store> selectAllStoreBy(String id)throws Exception;
	//根据用户id查询店铺
	public Store selectStoreByUserid(String userid)throws Exception;
}
