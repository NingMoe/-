package com.gzu.camel.pojo;

public class Product {
    private Integer pid;

    private Integer storeid;

    private Integer typeid;

    private String pname;

    private Double pprice;

    private String pdes;

    private Integer pno;

    private Integer pimageno;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public String getPdes() {
        return pdes;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes == null ? null : pdes.trim();
    }

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public Integer getPimageno() {
        return pimageno;
    }

    public void setPimageno(Integer pimageno) {
        this.pimageno = pimageno;
    }
}