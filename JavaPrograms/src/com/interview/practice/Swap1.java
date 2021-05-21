package com.interview.practice;

public class Swap1 {

	//Approach 1: Swapping the Values Using Third Variable
	
	public static void TwoNumberSwap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Values of a is  " + " "+a + " Values of b is" +" "+ b);
	}
	
	public static void main(String[] args) {
		int a = 10 , b = 5;
		TwoNumberSwap(a,b);
		

	}

}
