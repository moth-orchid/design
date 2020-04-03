package com.yhl.entity;

public class Clothes {
	private Integer clothesId;
	
	private String clothesIntroduction;
	
	private Integer price;
	
	private String clothesImg;
	
	private Integer clothesCount;
	
	private Seller sellerId;
	
	private Sort sortId;
	
	public Clothes() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getClothesId() {
		return clothesId;
	}

	public void setClothesId(Integer clothesId) {
		this.clothesId = clothesId;
	}

	public String getClothesIntroduction() {
		return clothesIntroduction;
	}

	public void setClothesIntroduction(String clothesIntroduction) {
		this.clothesIntroduction = clothesIntroduction;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getClothesImg() {
		return clothesImg;
	}

	public void setClothesImg(String clothesImg) {
		this.clothesImg = clothesImg;
	}

	public Integer getClothesCount() {
		return clothesCount;
	}

	public void setClothesCount(Integer clothesCount) {
		this.clothesCount = clothesCount;
	}

	public Seller getSellerId() {
		return sellerId;
	}

	public void setSellerId(Seller sellerId) {
		this.sellerId = sellerId;
	}

	public Sort getSortId() {
		return sortId;
	}

	public void setSortId(Sort sortId) {
		this.sortId = sortId;
	}

	@Override
	public String toString() {
		return "Clothes [clothesId=" + clothesId + ", clothesIntroduction=" + clothesIntroduction + ", price=" + price
				+ ", clothesImg=" + clothesImg + ", clothesCount=" + clothesCount + ", sellerId=" + sellerId
				+ ", sortId=" + sortId + "]";
	}

	
	
	
}
