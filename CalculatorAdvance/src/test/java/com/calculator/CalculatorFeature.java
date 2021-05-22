package com.calculator;

public class CalculatorFeature {
	
	
	public int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public int mult(int a, int b)
	{
		int mult = a*b;
		return mult;
	}
	public int div(int a, int b)
	{
		int div = a/b;
		
		return div;
	}
	public int sub(int a, int b)
	{
		int sub = a-b;
				return sub;
	}
	
	public int adding(int a, int b, int c)
	{
		
		int adds = a+b+c;
		return adds;
		
	}
	
	public void equal()
	{
		System.out.println("This is a calculator feature class of string");
	}

	
	
}
