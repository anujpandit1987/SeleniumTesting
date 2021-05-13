package com.croma.testng;

import org.testng.annotations.Test;

public class TestNGPriorityExample {
	
	@Test(priority = 1)
	public void one()
	{
		System.out.println("This is test 1 method");
	}
	
	@Test(priority = 1)
	public void two()
	{
		System.out.println("This is test 2 method");
	}
	
	@Test(priority = 1)
	public void three()
	{
		
		System.out.println("This is test 3 method");
	}
	
	@Test(priority = 1)
	public void four()
	{
		System.out.println("This is test 4 method");
	}

}
