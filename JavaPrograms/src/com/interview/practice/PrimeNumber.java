package com.interview.practice;

public class PrimeNumber {

	public static void primeNumber(int n)
	{
		int x, y, flag;
		
		System.out.println("All the prime numbers within 1 and " + n + " are ");
		
		for (x=1; x<=n; x++)
		
			if(x==1 || x==0)
			continue;
		flag =1;
		
		for(y=2; y<=x/2; ++y)
		{
			if(x % y== 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
		
			System.out.println(y + " ");
		
		
				
	}
	
	
	
	public static void main(String[] args) {
	
		int n = 45;
	
	primeNumber(n);
	}

}
