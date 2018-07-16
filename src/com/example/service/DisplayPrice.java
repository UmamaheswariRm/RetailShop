package com.example.service;

import com.example.mockedData.AddMockedProduct;

public class DisplayPrice {

	public int getDiscount(String prod_num, String username, String custType) {
		// TODO Auto-generated method stub

		System.out.println("prod_num = " + prod_num);
		String[] product_numbers = prod_num.split(",");
		int price = 0;
		int groceryPrice = 0 ;
		//String desc = "";

		AddMockedProduct prod = new AddMockedProduct();

		for(String pn : product_numbers)
		{
			price += prod.getPrice(pn);
		}

		System.out.println("Total Price : " + price);
		if(price == 0 )
		{
			System.out.println(username + ", Cart is empty !!" );
		}

		System.out.println("custType = " + custType);
		if(custType.equals("E") )
		{
			for(String pn : product_numbers)
			{
				if(pn.equals("21") || pn.equals("22") || pn.equals("23"))
				{
					groceryPrice = prod.getPrice(pn);
				// 	Excluding grocery items from discount !!
					price = price - groceryPrice;
					
					// Calculating discount
					price = price - ((price * 30 ) /100);

					//Adding grocery price after discount
					
					price = price + groceryPrice;
				}
			}
		}
		else if(custType.equals("A"))
		{
			for(String pn : product_numbers)
			{
				if(pn.equals("21") || pn.equals("22") || pn.equals("23"))
				{
					groceryPrice = prod.getPrice(pn);
				// 	Excluding grocery items from discount !!
					price = price - groceryPrice;
					
					// Calculating discount
					price = price - ((price * 10 ) /100);

					//Adding grocery price after discount
					
					price = price + groceryPrice;
				}
			}
		}
		else if(custType.equals("C"))
		{
			for(String pn : product_numbers)
			{
				if(pn.equals("21") || pn.equals("22") || pn.equals("23"))
				{
					groceryPrice = prod.getPrice(pn);
				// 	Excluding grocery items from discount !!
					price = price - groceryPrice;
					
					// Calculating discount
					price = price - ((price * 5 ) /100);

					//Adding grocery price after discount
					
					price = price + groceryPrice;
			}
			}		
		}
		else if(custType.equals("N"))
		{
			for(String pn : product_numbers)
			{
				if(pn.equals("21") || pn.equals("22") || pn.equals("23"))
				{
					groceryPrice = prod.getPrice(pn);
				// 	Excluding grocery items from discount !!
					price = price - groceryPrice;
					
					// Calculating discount
					int i = price / 100;
					price = price - (i * 5);

					//Adding grocery price after discount
					
					price = price + groceryPrice;
				}
			}
		}

		return price;

	}


}
