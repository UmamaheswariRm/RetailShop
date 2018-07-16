package com.example.mockedData;

import java.util.ArrayList;

import com.example.bean.Customer;

public class AddMockedCustomer {

	ArrayList<Customer> listofCustomers = new ArrayList<Customer>();
	
	public void addCustomers()
	{
		listofCustomers.add(new Customer("Uma", "password","E"));
		listofCustomers.add(new Customer("Anand", "abc","E"));
		listofCustomers.add(new Customer("yash", "abc","A"));
		listofCustomers.add(new Customer("gayathri", "abc","A"));
		listofCustomers.add(new Customer("ram", "abc","A"));
		listofCustomers.add(new Customer("saranya", "abc","E"));
		listofCustomers.add(new Customer("umarm", "abc","C"));
		listofCustomers.add(new Customer("vasu", "abc","A"));
		listofCustomers.add(new Customer("annu", "abc","A"));
		listofCustomers.add(new Customer("avram", "abc","A"));
		listofCustomers.add(new Customer("fabi", "abc","C"));
		listofCustomers.add(new Customer("sam", "abc","E"));
		listofCustomers.add(new Customer("harry", "abc","C"));
		listofCustomers.add(new Customer("william", "abc","C"));
	}

	public ArrayList<Customer> getListofCustomers() {
		return listofCustomers;
	}

	public void setListofCustomers(ArrayList<Customer> listofCustomers) {
		this.listofCustomers = listofCustomers;
	}

	public void addUser(String username, String password, String c) {
		// TODO Auto-generated method stub
		listofCustomers.add(new Customer(username, password,c));
	}
	
	
}
