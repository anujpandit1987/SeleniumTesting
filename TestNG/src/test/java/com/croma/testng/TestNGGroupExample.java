package com.croma.testng;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNGGroupExample {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("This is test 1 method");
	}
	
	@Test(groups= {"windows.regression"})
	public void test2()
	{
		System.out.println("This is test 2 method");
	}
	
	@Test(groups= {"linux.regression"})
	public void test3()
	{
		System.out.println("This is test 3 method");
	}
	
	@Test(groups = {"regression", "smoke"})
	public void test4()
	{
		System.out.println("This is test 4 method");
	}
	@Test(groups = {"smoke"})
	public void test5()
	{
		System.out.println("This is test 5 method");
	}
	
	public void test6()
	{
		System.out.println("This is test 6 normal test method");
	}
}
