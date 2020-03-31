package com.yhl.entity;

import java.util.List;

public class ShopCart {
	private Integer shopCarId;
	
	private Consumer consumerId;
	
	private List<Clothes> clothesId;
	
	private Integer count;
	
	public ShopCart() {
		// TODO Auto-generated constructor stub
	}

	public Integer getShopCarId() {
		return shopCarId;
	}

	public void setShopCarId(Integer shopCarId) {
		this.shopCarId = shopCarId;
	}

	public Consumer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Consumer consumerId) {
		this.consumerId = consumerId;
	}

	

	public List<Clothes> getClothesId() {
		return clothesId;
	}

	public void setClothesId(List<Clothes> clothesId) {
		this.clothesId = clothesId;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ShopCart [shopCarId=" + shopCarId + ", consumerId=" + consumerId + ", clothesId=" + clothesId
				+ ", count=" + count + "]";
	}
	
	
}
