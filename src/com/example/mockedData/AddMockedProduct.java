package com.example.mockedData;

import java.util.HashMap;

import com.example.bean.Product;

public class AddMockedProduct {

	HashMap<Integer, Product> productsList = new HashMap<Integer, Product>();
	
	public void addProducts()
	{
		productsList.put(1, new Product("Baby Suit", 100));
		productsList.put(2, new Product("Ladies Dress", 400));
		productsList.put(3, new Product("Ladies Kurtha", 200));
		productsList.put(4, new Product("Ladies Salwar", 200));
		productsList.put(5, new Product("Jeans", 75));
		productsList.put(6, new Product("Baby frocks", 100));
		productsList.put(7, new Product("designer gown", 500));
		productsList.put(8, new Product("Saree", 500));
		productsList.put(9, new Product("Ladies wear", 100));
		productsList.put(10, new Product("T-Shirt", 100));
		productsList.put(11, new Product("Shirts", 100));
		productsList.put(12, new Product("Trousers", 50));
		productsList.put(13, new Product("Shorts", 40));
		productsList.put(14, new Product("Laganga", 300));
		productsList.put(15, new Product("Tights", 80));
		productsList.put(16, new Product("accessories", 35));
		productsList.put(17, new Product("ladies jeans", 75));
		productsList.put(18, new Product("jeggings", 60));
		productsList.put(19, new Product("Leggings", 40));
		productsList.put(20, new Product("Baby dress", 90));
		productsList.put(21, new Product("Groceries", 20));
		productsList.put(22, new Product("Groceries", 10));
		productsList.put(23, new Product("Groceries", 50));
	}

	public HashMap<Integer, Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(HashMap<Integer, Product> productsList) {
		this.productsList = productsList;
	}
	
	public int getPrice(String prod_num)
	{
		addProducts();
		//Validation for Product number
		if(Integer.parseInt(prod_num)>23 || Integer.parseInt(prod_num)==0)
		{
			System.out.println("Invalid product item number " + prod_num);
			return 0;
		}
		
		Product product = productsList.get(Integer.parseInt(prod_num));
		return product.getPrice();
	}
	
	public String getDescription(String prod_num)
	{
		addProducts();
		//Validation for Product number
		if(Integer.parseInt(prod_num)>23 || Integer.parseInt(prod_num)==0)
		{
			System.out.println("Invalid product item number " + prod_num);
			return "";
		}
		
		Product product = productsList.get(Integer.parseInt(prod_num));
		return product.getDescription();
	}
}
