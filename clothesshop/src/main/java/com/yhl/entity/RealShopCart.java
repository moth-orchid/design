package com.yhl.entity;

public class RealShopCart {
	private Integer realShopCartId;
	
	private Clothes clothes;
	
	private Seller seller;
	
	private Integer count;
	
	public RealShopCart() {
		// TODO Auto-generated constructor stub
	}

	public Integer getRealShopCartId() {
		return realShopCartId;
	}

	public void setRealShopCartId(Integer realShopCartId) {
		this.realShopCartId = realShopCartId;
	}

	public Clothes getClothes() {
		return clothes;
	}

	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "RealShopCart [realShopCartId=" + realShopCartId + ", clothes=" + clothes + ", seller=" + seller
				+ ", count=" + count + "]";
	}
	
	
	
	
}
