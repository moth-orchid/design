package com.yhl.entity;

public class ShopCart {
	private Integer shopCartId;
	
	private Consumer consumerId;
	
	public ShopCart() {
		// TODO Auto-generated constructor stub
	}

	public Integer getShopCartId() {
		return shopCartId;
	}

	public void setShopCartId(Integer shopCartId) {
		this.shopCartId = shopCartId;
	}

	public Consumer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Consumer consumerId) {
		this.consumerId = consumerId;
	}

	@Override
	public String toString() {
		return "ShopCart [shopCartId=" + shopCartId + ", consumerId=" + consumerId + ", getShopCartId()="
				+ getShopCartId() + ", getConsumerId()=" + getConsumerId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
