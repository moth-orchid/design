package com.yhl.entity;

public class ShopCartClothes {
	private Integer shopCartClothes;
	
	private ShopCart shopCart;
	
	private Clothes clothes;
	
	private Integer count;
	
	public ShopCartClothes() {
		// TODO Auto-generated constructor stub
	}

	public Integer getShopCartClothes() {
		return shopCartClothes;
	}

	public void setShopCartClothes(Integer shopCartClothes) {
		this.shopCartClothes = shopCartClothes;
	}

	public ShopCart getShopCart() {
		return shopCart;
	}

	public void setShopCart(ShopCart shopCart) {
		this.shopCart = shopCart;
	}

	public Clothes getClothes() {
		return clothes;
	}

	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ShopCartClothes [shopCartClothes=" + shopCartClothes + ", shopCart=" + shopCart + ", clothes=" + clothes
				+ ", count=" + count + "]";
	}
	
	
}
