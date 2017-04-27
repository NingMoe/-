package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Store;
import com.gzu.camel.pojo.StoreExample;
import com.gzu.camel.pojo.StoreKey;
import com.gzu.camel.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    int countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(StoreKey key);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(StoreKey key);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
    
    List<Store> selectAllStore();
    
    Store selectStore(Integer id);
    
    void deletByid(Integer id);
    
    List<Store> selectAllStoreBy(String id);
    
    Store selectStoreByUserid(String userid);
}