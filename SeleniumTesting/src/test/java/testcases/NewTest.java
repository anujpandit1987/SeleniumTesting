package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public String baseUrl = "https://www.google.co.in/";
		String driverPath = "D:\\Croma\\Selenium\\chromedriver.exe";
		public WebDriver driver ;
		 
		@BeforeTest
		public void launchBrowser() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		}
		@Test
		public void verifyHomepageTitle() {
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		}
		@AfterTest
		public void terminateBrowser(){
		driver.close();
		}

}
