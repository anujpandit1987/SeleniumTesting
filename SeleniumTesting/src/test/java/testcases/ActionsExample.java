package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Croma\\Selenium\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://mrbool.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
	
			
	Actions action = new Actions(driver);
	
	action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	Thread.sleep(3000);
		
	driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
	
			
	driver.quit();
		}
	
}
