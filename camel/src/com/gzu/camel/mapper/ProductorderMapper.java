package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Productorder;
import com.gzu.camel.pojo.ProductorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductorderMapper {
    int countByExample(ProductorderExample example);

    int deleteByExample(ProductorderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Productorder record);

    int insertSelective(Productorder record);

    List<Productorder> selectByExample(ProductorderExample example);

    Productorder selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Productorder record, @Param("example") ProductorderExample example);

    int updateByExample(@Param("record") Productorder record, @Param("example") ProductorderExample example);

    int updateByPrimaryKeySelective(Productorder record);

    int updateByPrimaryKey(Productorder record);
    
    
    /*自己添加的方法，方便管理*/
}