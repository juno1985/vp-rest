package org.softcits.vp.model;

import java.util.List;

public class PCPager<T> {
	
	private Integer pageNum;
	//rows per page
	private Integer rows;
	private Long totalRows;
	private List<T> data;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Long getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(Long totalPage) {
		this.totalRows = totalPage;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
	

}
