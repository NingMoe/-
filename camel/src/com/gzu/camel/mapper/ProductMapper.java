package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Product;
import com.gzu.camel.pojo.ProductExample;
import com.gzu.camel.pojo.ProductSplitPageVo;
import com.gzu.camel.pojo.ProducttypeCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    
    
    /*自己添加的方法，方便管理*/
    
    
    
    /* 根据商品名字，模糊查询商品总数*/
   int countByProductName(String name);
   
   //商品分页
   List<Product> selectSplitPage(ProductSplitPageVo productSplitPageVo);
   

   
}