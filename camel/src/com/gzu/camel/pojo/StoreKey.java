package com.gzu.camel.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StoreKey {
	
    private Integer storeid;
	
	@NotNull(message="用户id不能为空")
	@Size(min=1,max=10,message="用户id为1-10位有效字符")
    private String userid;

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}