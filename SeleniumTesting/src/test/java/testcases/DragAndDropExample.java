package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropExample {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
	driver.switchTo().frame(0);
	
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions action = new Actions(driver);
	
	
	action.
	clickAndHold(source).
	moveToElement(target).
	release(target).
	build().
	perform();
	
	
	
		//driver.quit();
			}
	
	
	

}
