package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.User;
import com.gzu.camel.pojo.UserCustom;
import com.gzu.camel.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAllUser();
    
    User selectUser(String id);
    
    String selectid(String id);
    
    List<User> selectAllUserBy(String nameorid);
    //--------------------------------------------
    
    List<UserCustom> selectStoreUser(String id);
    //更新用户信息
    int updateStoreUser(UserCustom record);
    //根据商铺ID查询商铺信息
	Store selectByStoreId(Integer storeid);
    
}