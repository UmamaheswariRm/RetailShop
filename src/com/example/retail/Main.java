package com.example.retail;

import java.util.Scanner;

import com.example.service.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username=scanner.next();
		
		System.out.println("Enter password: ");
		String password = scanner.next();
		
		System.out.println("Enter Customer Type('E' for Employee,\n 'A' for Affiliafe,\n  'C' for Customer,\n  'N' for New customers) :");
		String custType = scanner.next();
		
		ShowProductsClass showProducts = new ShowProductsClass();
		String validatationResult = showProducts.getValidation(username,password,custType);
		System.out.println("validatationResult = " + validatationResult);
		if( validatationResult =="success")
			showProducts.showProducts();
		else
		{
			System.out.println("Please enter valid credentials with new user N");
			return;
		}
		
		System.out.println("Enter the product number if u wish to add to cart (in a comma separated value)");
		String prod_num = scanner.next();
		
		System.out.println("Selected items are : " + prod_num);

		DisplayPrice price = new DisplayPrice();
		System.out.println("Total Price After Discount :" + price.getDiscount(prod_num, username, custType));
		
		System.out.println("Thanks for shopping !! :)");
		scanner.close();
	}

}
