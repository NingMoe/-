package com.gzu.camel.pojo;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User {
	
	@NotNull(message="用户id不能为空")
	@Size(min=1,max=10,message="用户id为1-10位有效字符")
    private String userid;
	
	@NotNull(message="名字不能为空")
    @Size(min=1,max=10,message="用户名是1-10位有效数字")
    private String uname;
    
    @NotNull(message="密码不能为空")
    @Size(min=1,max=10,message="密码是1-10位有效字符")
    private String upassword;
    
    @NotNull(message="手机号不能为空")
    @Size(min=1,max=20,message="手机号是1-20位有效数字")
    private String uphone;
    
    @NotNull(message="地址栏不能为空")
    @Size(min=1,max=20,message="收货地址是1-20位有效数字")
    private String uaddr;
    
    @NotNull(message="性别不能为空")
    @Size(min=1,max=5,message="性别是一位有效字符")
    private String usex;
    
    private String utype;
    
    private Double umoney;

    public String getUserid() {
        return userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype == null ? null : utype.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUaddr() {
        return uaddr;
    }

    public void setUaddr(String uaddr) {
        this.uaddr = uaddr == null ? null : uaddr.trim();
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public Double getUmoney() {
        return umoney;
    }

    public void setUmoney(Double umoney) {
        this.umoney = umoney;
    }
}