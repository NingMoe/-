package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Producttype;
import com.gzu.camel.pojo.ProducttypeExample;
import com.gzu.camel.pojo.ProducttypeCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducttypeMapper {
    int countByExample(ProducttypeExample example);

    int deleteByExample(ProducttypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    List<Producttype> selectByExample(ProducttypeExample example);

    Producttype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByExample(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);
    
    
    //查詢商品分類
    List<ProducttypeCustom> selectproducttype() throws Exception;
}