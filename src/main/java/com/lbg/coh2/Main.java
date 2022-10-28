package com.lbg.coh2;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
       //create the shirt, this is how java creates object.
    	//Shirt() is a default object, which do nothing but creates
    	Shirt s=new Shirt("White","M");
    	s.putOn();
    	System.out.println(s.color);
    	System.out.println(s.size);
    	Child_0 c= new Child_0("2",2,3.0,0.3,true,3);
    	c.printPrice();
    	
    }
}
