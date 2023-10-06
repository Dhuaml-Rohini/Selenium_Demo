package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	
	//  locator--By xpath	
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("9312345566");
				
	//  locator---by linkText
		
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
	//	link.click();
		
	//  locator--By partial LinkText
		WebElement newAcc=driver.findElement(By.partialLinkText("Create"));
		newAcc.click();
		
        
	}

}
