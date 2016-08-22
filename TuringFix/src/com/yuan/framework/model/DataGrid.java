package com.yuan.framework.model;

import java.util.ArrayList;
import java.util.List;

public class DataGrid {

	private Long total = 0L;
	private List rows = new ArrayList();
	
	private int pageSize;
	private int pageNo;
	private int pageCount;
	private int rowCount;
	private int pageGroup;


	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageCount() {
		
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		//this.pageCount=(this.rowCount%this.pageSize==0)?(this.rowCount/this.pageSize):(this.rowCount/this.pageSize+1);
		this.pageCount = pageCount;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getPageGroup() {
		//this.pageCount=this.getPageCount();		
		return pageGroup;
	}

	public void setPageGroup(int pageGroup) {
		//this.pageGroup=this.pageNo/5+1;
		this.pageGroup = pageGroup;
	}

	@Override
	public String toString() {
		return "DataGrid [total=" + total + ", rows=" + rows + ", pageSize=" + pageSize + ", pageNo=" + pageNo
				+ ", pageCount=" + pageCount + ", rowCount=" + rowCount + ", pageGroup=" + pageGroup + "]";
	}

	
	

}
