package com.croma.testng;

import org.testng.annotations.Test;

public class GmailTest {
  @Test
  public void LoginTest() {
	  System.out.println("Successfully Logged In");
  }
  @Test
  public void LogoutTest()
  {
  System.out.println("Successfully Logged Out");
  }
  @Test(priority=1)
  public void b_method(){
  System.out.println("B Method");
  }

@Test(priority=1)
  public void a_method(){
  System.out.println("A method");
  }

}
