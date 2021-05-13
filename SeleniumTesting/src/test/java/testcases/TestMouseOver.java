package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.name("q")).sendKeys("cromacampus");
	
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span"))).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a/div")).click();
		
		WebElement menu = driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/div[3]/ul/li[2]/a"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		//driver.findElement(By.xpath("/html/body/section[1]/div/div[1]/div/div/div/div[1]/div[2]/div/div/div[2]/div/ul/li[1]/h3/a")).click();
		
		
	}

}
