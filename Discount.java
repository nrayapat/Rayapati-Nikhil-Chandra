package com.capagemini.day2;

public class Discount {
	public static double calcDiscount(int newItem) {
	double discount = (0.65) * newItem;
	double newItemPrice = newItem - discount;
	System.out.println("The original price of the Item : " + newItem);
	System.out.println("The discount on the Item : " + discount);
	System.out.println("The new price of the Item : " + newItemPrice);
	return newItemPrice;

	}

}
