package com.calculator;

public class Calculator {
	public static void main(String... args)
	{
		
		
		CalculatorFeature s3 = new CalculatorFeature();
		
		int addition =s3.add(2, 3);
		int multiplication =s3.div(10,5);
		int subtraction = s3.mult(3, 3);
		int AddingThreeNumbers = s3.adding(5, 5, 5);
		
		System.out.println("Addition of two numbers is =" + addition);
		System.out.println("Addition of two numbers is =" + multiplication);
		System.out.println("Addition of two numbers is =" + subtraction);
		System.out.println("Addition of three numbers is =" + AddingThreeNumbers);
		s3.equal();
		System.out.println();
		
	}

}
