package com.gzu.camel.pojo;

public class ProductCustom extends Product {
	private int currentPage;//当前页
	private int pageSize;//每页显示最大数量
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
