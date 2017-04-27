package com.gzu.camel.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Store extends StoreKey {
	@NotNull(message="商铺名字不能为空")
	@Size(min=1,max=10,message="商铺名字为1-10位有效字符")
    private String sname;
	
	@NotNull(message="商铺电话不能为空")
	@Size(min=1,max=15,message="商铺id为1-15位有效字符")
    private String sphone;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }
}