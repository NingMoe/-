package com.gzu.camel.pojo;

public class ProductCustom extends Product {
	private int currentPage;//當前頁
	private int start;//第一條數據
	private int pageSize;//每页显示最大数量
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
