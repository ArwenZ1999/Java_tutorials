package com.lbg.coh2;

import java.text.DecimalFormat;

public class Parent_0
{
	protected String description;
	protected int productCode;
	protected double price;
	protected double vatRate;
	protected boolean warranty;
	protected int quantityOfStock;
	
	public Parent_0(String description, int productCode, double price, double vatRate, boolean warranty, int quantityOfStock)
	{
		this.description = description;
		this.productCode = productCode;
		this.price = price;
		this.vatRate = vatRate;
		this.warranty = warranty;
		this.quantityOfStock = quantityOfStock;
	}
	public void printPrice()
	{
		Parent_0 p= new Parent_0("HI",2,3,4,true,3);
		System.out.println(p.price);
	}
}
