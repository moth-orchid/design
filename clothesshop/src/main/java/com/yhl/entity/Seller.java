package com.yhl.entity;

import java.util.List;

public class Seller {
	private Integer sellerId;
	
	private String sellerName;
	
	private String sellerPassword;
	
	private String sellerEmail;
	
	private String sellerAddress;
	
	private String sellerPhone;
	
	private String sellerZip;
	
	private List<Clothes> clothes;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerPassword() {
		return sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerPhone() {
		return sellerPhone;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public String getSellerZip() {
		return sellerZip;
	}

	public void setSellerZip(String sellerZip) {
		this.sellerZip = sellerZip;
	}
	
	
	public List<Clothes> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothes> clothes) {
		this.clothes = clothes;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerPassword=" + sellerPassword
				+ ", sellerEmail=" + sellerEmail + ", sellerAddress=" + sellerAddress + ", sellerPhone=" + sellerPhone
				+ ", sellerZip=" + sellerZip + "]";
	}
	
	
}
