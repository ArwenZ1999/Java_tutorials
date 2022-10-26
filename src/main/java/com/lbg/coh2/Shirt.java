package com.lbg.coh2;
/*
 * Constructor tutorials:
 * Constructor can be seen as a method that create objects
 */
public class Shirt
{
	//Add some properties
	public  String color;
	public  String size;
	//create construtor
	Shirt(){};
	Shirt(String color, String size)
	{
		this.color=color;
		this.size=size;
		
	}
	//make some methods( those are instance method)
	/**
	 * non-static method can call static method.
	 */
	public void putOn()
	{
		System.out.println("Shirt is on");
	}
	public static void takeOff()
	{
		System.out.println("Shirt if off");
	}
	//the following ways to set attributes are daunting, thats why we need constructor.
//	public void setColor(String newColor)
//	{
//		color=newColor;
//	}
//	public void setSize(String newSize)
//	{
//		color=newSize;
//	}
}
