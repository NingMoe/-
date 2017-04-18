package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Shopingcar;
import com.gzu.camel.pojo.ShopingcarCustom;
import com.gzu.camel.pojo.ShopingcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopingcarMapper {
    int countByExample(ShopingcarExample example);

    int deleteByExample(ShopingcarExample example);
//删除购物车商品
    int deleteByPrimaryKey(ShopingcarCustom record);
//加入购物车
    int insert(ShopingcarCustom record);

    int insertSelective(Shopingcar record);

    List<Shopingcar> selectByExample(ShopingcarExample example);

    List<ShopingcarCustom> selectByUserid(String userid);

    int updateByExampleSelective(@Param("record") Shopingcar record, @Param("example") ShopingcarExample example);

    int updateByExample(@Param("record") Shopingcar record, @Param("example") ShopingcarExample example);

    int updateByPrimaryKeySelective(Shopingcar record);

    int updateByPrimaryKey(Shopingcar record);
    
     
    
    
    
    
}