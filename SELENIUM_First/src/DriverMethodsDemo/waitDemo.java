package DriverMethodsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitDemo {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//  implicit wait===
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	Explicit wait---1)WebDriver wait   2)fluent wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	//  fluent wait---
		Wait<WebDriver>wait1=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(TimeoutException.class);
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement createacc=driver.findElement(By.xpath("//a[text()='Create new account']"));
		createacc.click();
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sign Up']")));
		
		WebElement sinup=driver.findElement(By.xpath("//div[text()='Sign Up']"));
		System.out.println(sinup.isDisplayed());
	}

}
