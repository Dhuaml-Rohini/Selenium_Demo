package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	//  locator---by id
		WebElement emailorPhone=driver.findElement(By.id("email"));
		emailorPhone.sendKeys("9412345667");
		
		emailorPhone.clear();
		
		emailorPhone.sendKeys("abcd@gmail.com");
		
	//  locator--by name
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("p@ssw@rd");
		
	//  locator-- by className	
	//       WebElement pass=driver.findElement(By.className("inputtext ._55r1 ._6luy ._9npi"));
	//      pass.sendKeys("p@ssw0rd");	
		
	//  locator-- by tagname
		WebElement login=driver.findElement(By.tagName("button"));
        login.click();
        
		
	
	}

}
