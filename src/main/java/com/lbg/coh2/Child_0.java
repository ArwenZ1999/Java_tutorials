package com.lbg.coh2;

import java.text.DecimalFormat;

public class Child_0 extends Parent_0 {

	double quantity;
	int insuranceLength;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public Child_0(String description, int productCode, double price, double vatRate, boolean warranty,
			int quantityOfStock) 
	{
		super(description, productCode, price, vatRate, warranty, quantityOfStock);
		// TODO Auto-generated constructor stub
	}

	public void setQuantity(double quantity)
	{
		this.quantity = quantity;
	}
	
	public double getQuantity() 
	{
		return quantity;
	}
	
	public int getInsuranceLength()
	{
		return insuranceLength;
	}

	public void setInsuranceLength(int insuranceLength)
	{
		this.insuranceLength = insuranceLength;
	}
}
