/**
 * Instance method VS Static methods.
 * 1. Static methods are the methods in Java that can be 
 * called without creating an object of class. 
 * They are referenced by the class name itself or reference to the Object of that class.  
 * Instance on the other hand need to be called by creating an object: Class_instance in =new Class_instance(); in.instance_method();
 * 2. static methods are designed with the aim to be shared among all objects created from the same class.
 */
package com.lbg.coh2;

public class Static_explain
{
	int a=0;
	public static void main(String[] args)
	{
		int b=1;
		//cannot print a, even tho it is a global variable. 
		//System.out.println(a);
		//can be done by either 1: create an object
		Static_explain s = new Static_explain();
		System.out.println(s.a);
	}
}

