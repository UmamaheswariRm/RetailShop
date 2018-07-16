package com.example.bean;

public class Product {

	private String description;
	private int price;
	private int prodNumber;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public Product(String description, int price) {
		super();
		this.description = description;
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProdNumber() {
		return prodNumber;
	}
	public void setProdNumber(int prodNumber) {
		this.prodNumber = prodNumber;
	}
	
	@Override
	public String toString() {
		return "Product [description=" + description + ", price=" + price
				+ "]";
	}
	
	
	
}
