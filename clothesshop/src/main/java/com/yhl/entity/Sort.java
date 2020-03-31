package com.yhl.entity;

import java.util.List;

public class Sort {
	private Integer sortId;
	
	private String sortName;
	
	private List<Clothes> clothes;
	
	public Sort() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSortId() {
		return sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	
	
	public List<Clothes> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothes> clothes) {
		this.clothes = clothes;
	}

	@Override
	public String toString() {
		return "Sort [sortId=" + sortId + ", sortName=" + sortName + ", clothes=" + clothes + "]";
	}
	
	
	
}
