package com.fujitsu.shop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        System.out.println("Welcome");
		System.out.println("To the world technologies");

	Product p=new Product(101,"pen","TryMax",100.00f);
	p.display();

	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("JDBC Driver Loaded");
		
		}
	catch(Exception e)
	{

		e.printStackTrace();
	
	}


	}
}
