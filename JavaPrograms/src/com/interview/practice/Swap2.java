package com.interview.practice;

public class Swap2 {

	/*
	 * Approach 2: Swapping the Values Without Using Third Variable by using sum and
	 * differences concepts of maths.
	 * 
	 * Algorithms: There are 3 standard steps as listed below:
	 * 
	 * Difference of second number from the first number is stored in memory cell
	 * where first number was already stored. Sum of both the numbers is stored in
	 * second memory cell(number). Difference of first number from the second is
	 * computed and stored in memory cell where at initial first value was stored.
	 */
	
public static void SwapWithoutTemp(int a, int b)
	{
		a = a-b;
		b = a + b;
		a= b-a;
		
		System.out.println("Value of a is "+a+"  Value of b is " +b);
		
	}
	public static void main(String[] args)
	{
		int a = 10, b=20;
		SwapWithoutTemp(a, b);
		
	}
	
}
