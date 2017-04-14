package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Shopingcar;
import com.gzu.camel.pojo.ShopingcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopingcarMapper {
    int countByExample(ShopingcarExample example);

    int deleteByExample(ShopingcarExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Shopingcar record);

    int insertSelective(Shopingcar record);

    List<Shopingcar> selectByExample(ShopingcarExample example);

    Shopingcar selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Shopingcar record, @Param("example") ShopingcarExample example);

    int updateByExample(@Param("record") Shopingcar record, @Param("example") ShopingcarExample example);

    int updateByPrimaryKeySelective(Shopingcar record);

    int updateByPrimaryKey(Shopingcar record);
    
    
    /*自己添加的方法，方便管理*/
}