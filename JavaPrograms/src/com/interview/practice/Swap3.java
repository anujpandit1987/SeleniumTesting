package com.interview.practice;

public class Swap3 {
	
	/*
	 * Approach 3: Swapping the Values Using Operator
	 * 
	 * Bit-wise operators are used to perform manipulation of individual bits of a
	 * number. They can be used with any of the integral types (char, short, int,
	 * etc). They are used when performing update and query operations of Binary
	 * indexed tree.
	 * 
	 * This operator is binary operator, denoted by ‘^’. It returns bit by bit XOR
	 * of input values, i.e, if corresponding bits are different, it gives 1, else
	 * it gives 0.
	 */
	public static void SwapNumber(int a , int b)
	{
		
		a= a^b;
		b = a^b;
		a=a^b;
		System.out.println("Value of a "+a+" Value of b "+b);
	}

	public static void main(String[] args)
	{
		int a =10, b=20;
		SwapNumber(a,b);
	}
}
