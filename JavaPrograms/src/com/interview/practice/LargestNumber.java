package com.interview.practice;

public class LargestNumber {

	/*
	 * Algorithm to find the largest of three numbers:
	 * 
	 * 1. Start 2. Read the three numbers to be compared, as A, B and C 3. Check if
	 * A is greater than B.
	 * 
	 * 3.1 If true, then check if A is greater than C If true, print 'A' as the
	 * greatest number If false, print 'C' as the greatest number
	 * 
	 * 3.2 If false, then check if B is greater than C If true, print 'B' as the
	 * greatest number If false, print 'C' as the greatest number 4. End
	 */
	public static int largestNumber(int x, int y, int z)
	{
		if (x>y && x>z)
		{
			
			return x;
		}else if(y>x && y>z)
		{
			return y;
		}
		return z;
	}
	public static void main(String[] args) {
		int x =10, y=20, z=5, largest;
		
		 largest = largestNumber(x, y, z);
		 System.out.println("largest number is " + largest);

	}

}
