package com.example.bean;

public class Customer {

	private String username;
	private String password;
	private String custType;
	
	public Customer(String username, String password, String custType) {
		super();
		this.username = username;
		this.password = password;
		this.custType = custType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password
				+ ", custType=" + custType + "]";
	}
	
	
}
