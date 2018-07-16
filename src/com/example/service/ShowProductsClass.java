package com.example.service;

import java.util.ArrayList;

import java.util.HashMap;

import com.example.bean.Customer;
import com.example.bean.Product;
import com.example.mockedData.*;

public class ShowProductsClass {

	public void showProducts()
	{
		AddMockedProduct prod = new AddMockedProduct();
		prod.addProducts();

		HashMap<Integer, Product> getProdsmap = prod.getProductsList();
		getProdsmap.forEach((key,value) -> System.out.println(key + " = " + value));

	}

	public String getValidation(String username, String password, String custType)
	{
		AddMockedCustomer customer = new AddMockedCustomer();
		customer.addCustomers();

		ArrayList<Customer> listofCustomers = customer.getListofCustomers(); 

		for(Customer cust: listofCustomers)
		{
			if(custType.equalsIgnoreCase("E") || custType.equalsIgnoreCase("A") || custType.equalsIgnoreCase("C")) 
			{
				if(cust.getUsername().equalsIgnoreCase(username) && cust.getPassword().equalsIgnoreCase(password))
				{
					System.out.println("Welcome " + username + " !!");
					return "success";
				}
			}
			else if(custType.equalsIgnoreCase("N"))
			{
				System.out.println("Welcome new user !! " + username);
				return "success";
			}
			else
			{
				// Any new user can buy products but not registered online !!
				System.out.println("Invalid credentials, If you are a new User, please type Customer Type as N ");
				return "fail";
			}

		}
		return "success";

	}
}
