package com.gzu.camel.mapper;

import com.gzu.camel.pojo.Admin;
import com.gzu.camel.pojo.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(String adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(String adminid);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    
    
    /*自己添加的方法，方便管理*/
}