package com.croma.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTitle {
	
	WebDriver driver;
    // Saving the expected title of the Webpage
    String title = "ToolsQA - Demo Website For Automation";
    
   
    @Test
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	
    	System.setProperty("webdriver.chrome.driver", "D:\\Croma\\Selenium\\chromedriver.exe");
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver = new ChromeDriver();
    	driver = new ChromeDriver();
    	driver.get("https://demoqa.com/");
    }
    
    
    @Test(groups = { "demo1" }) 
    public void checkTitle() { 
       String testTitle = "Free QA Automation Tools For Everyone";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    } 
    
    @Test(groups = { "demo2" }) 
    public void click_element() { 
       driver.findElement(By.xpath("/html/body/div[1]/header/a/img")).click();
        System.out.println("Home Page heading is displayed"); 
    }
}
