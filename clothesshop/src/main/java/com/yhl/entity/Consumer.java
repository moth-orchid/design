package com.yhl.entity;

import java.util.List;

public class Consumer {
	private Integer consumerId;
	
	private String consumerName;
	
	private String consumerPassword;
	
	private String consumerEmail;
	
	private String consumerAddress;
	
	private String consumerPhone;
	
	private String consumerZip;
	
	private List<Address> address;
	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getConsumerPassword() {
		return consumerPassword;
	}

	public void setConsumerPassword(String consumerPassword) {
		this.consumerPassword = consumerPassword;
	}

	public String getConsumerEmail() {
		return consumerEmail;
	}

	public void setConsumerEmail(String consumerEmail) {
		this.consumerEmail = consumerEmail;
	}

	public String getConsumerAddress() {
		return consumerAddress;
	}

	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public String getConsumerPhone() {
		return consumerPhone;
	}

	public void setConsumerPhone(String consumerPhone) {
		this.consumerPhone = consumerPhone;
	}

	public String getConsumerZip() {
		return consumerZip;
	}

	public void setConsumerZip(String consumerZip) {
		this.consumerZip = consumerZip;
	}
	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Consumer [consumerId=" + consumerId + ", consumerName=" + consumerName + ", consumerPassword="
				+ consumerPassword + ", consumerEmail=" + consumerEmail + ", consumerAddress=" + consumerAddress
				+ ", consumerPhone=" + consumerPhone + ", consumerZip=" + consumerZip + "]";
	}
	
	
}
