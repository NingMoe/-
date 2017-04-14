package com.gzu.camel.mapper;

import com.gzu.camel.pojo.ProductstoreExample;
import com.gzu.camel.pojo.ProductstoreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductstoreMapper {
    int countByExample(ProductstoreExample example);

    int deleteByExample(ProductstoreExample example);

    int deleteByPrimaryKey(ProductstoreKey key);

    int insert(ProductstoreKey record);

    int insertSelective(ProductstoreKey record);

    List<ProductstoreKey> selectByExample(ProductstoreExample example);

    int updateByExampleSelective(@Param("record") ProductstoreKey record, @Param("example") ProductstoreExample example);

    int updateByExample(@Param("record") ProductstoreKey record, @Param("example") ProductstoreExample example);
    
    
    /*自己添加的方法，方便管理*/
}