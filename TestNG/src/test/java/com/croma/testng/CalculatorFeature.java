package com.croma.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorFeature {
	
	@Test
	@Parameters({"a","b"})
	public void add(int a, int b)
	{
		int sum = a+b;
		  System.out.println("Add of two numbers : "+sum); 
	}
	
	@Test
	@Parameters({"a","b"})
	public void mult(int a, int b)
	{
		int mult = a*b;
		 System.out.println("Mult of two numbers : "+mult); 
	}
	@Test
	@Parameters({"a","b"})
	public void div(int a, int b)
	{
		int div = b/a;
		
		 System.out.println("div of two numbers : "+div); 
	}
	@Test
	@Parameters({"a","b"})
	public void sub(int a, int b)
	{
		int sub = b-a;
				
	System.out.println("sub of two numbers : "+sub);
	}
	
		
}
