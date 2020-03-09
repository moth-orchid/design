package com.yhl.entity;

public class Address {
	private Integer id;
	private String addressee;
	private String address;
	private String phone;
	
	private Consumer consumer;
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressee=" + addressee + ", address=" + address + ", phone=" + phone
				+ ", consumer=" + consumer + "]";
	}

	
	
}
