package com.gzu.camel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.camel.mapper.AdminMapper;
import com.gzu.camel.mapper.StoreMapper;
import com.gzu.camel.mapper.UserMapper;
import com.gzu.camel.pojo.Admin;
import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.User;
import com.gzu.camel.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private StoreMapper storeMapper;
	@Autowired
	private AdminMapper adminMapper;

	/*	@Override
	public List<User> selectUserList(User user) throws Exception {
		return adminMapper.selectUser();
	}
	*/
	//管理员查询用户信息*****************
	@Override
	public List<User> queryAllUser() throws Exception {
		return userMapper.selectAllUser();
	}
	//查询单个用户信息*******************
	@Override
	public User selectUserByid(String userid) throws Exception {
		return userMapper.selectByPrimaryKey(userid);
	}
	//插入用户信息************************
	@Override
	public int insertUser(User user) throws Exception {
		return userMapper.insert(user);
	}
	//删除用户信息**************************
	@Override
	public int deletUser(String userid) throws Exception {
		return userMapper.deleteByPrimaryKey(userid);
	}
	//查询密码是否重复*************************
	@Override
	public String selectid(String id) throws Exception {
		return userMapper.selectid(id);
	}
	//更新用户信息
	@Override
	public int updateUser(User user) throws Exception {
		return userMapper.updateByPrimaryKey(user);
		}
	//*********************************************************************
	//管理员查询商铺信息(ok)********************************
	@Override
	public List<Store> findAllStores() throws Exception {
		return storeMapper.selectAllStore();
	}
	//(ok)******************************************
	@Override
	public int insertStore(Store Store) throws Exception {
		return storeMapper.insert(Store);
	}
	@Override
	public User selectUser(String userid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	//(ok)******************
	@Override
	public void deletStore(Integer id) throws Exception {
		storeMapper.deletByid(id);
	}
	
	@Override
	public Store selectStore(Integer id) throws Exception {
		return storeMapper.selectStore(id);
	}
	@Override
	public int updateStore(Store store) throws Exception {
		return storeMapper.updateByPrimaryKey(store);
	}
	@Override
	public Admin login(String adminid) throws Exception {
		return adminMapper.selectByPrimaryKey(adminid);
	}
	@Override
	public List<User> selectAllUserBy(String nameorid) throws Exception {
		return userMapper.selectAllUserBy(nameorid);
	}
	@Override
	public List<Store> selectAllStoreBy(String id) throws Exception {
		return storeMapper.selectAllStoreBy(id);
	}
	@Override
	public Store selectStoreByUserid(String userid) throws Exception {
		return storeMapper.selectStoreByUserid(userid);
	}

}
