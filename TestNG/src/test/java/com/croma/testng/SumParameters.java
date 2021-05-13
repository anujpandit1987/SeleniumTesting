package com.croma.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumParameters {
	
	@Parameters({"var1", "var2"})
	@Test
	public void Sum(int n1, int n2)
	{
	int sum = n1 + n2;
	System.out.println("Sum is = " + sum );
	}

}
