package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	//  locator--by cssselector using substring--syntax-tagname[attribute^/$/*='value']
	// 1)using first value in attribute(use charAt symbol(^))	
	    WebElement email=driver.findElement(By.cssSelector("input[class^='inputtext']"));
	    email.sendKeys("abcd@gmail.com");
	    
   //  2)using last value in attribute(use $ symbol)
	    WebElement pass=driver.findElement(By.cssSelector("input[class$='_9npi']"));
	    pass.sendKeys("pass@123");
	    
   //  3)using any value in attribute value(use*symbol)
	    
	    WebElement login=driver.findElement(By.cssSelector("button[class*='_4jy6 ']"));
	    login.click();
	    

	}

}
