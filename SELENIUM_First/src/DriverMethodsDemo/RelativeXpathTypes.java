package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathTypes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
	//  using contains()-------
    //  1)contains method using partial value of attribute
		WebElement user=driver.findElement(By.xpath("//input[contains(@name,'user')]"));
		user.sendKeys("Admin");
		
	//  2)starts-with()--------
		WebElement pass=driver.findElement(By.xpath("//input[starts-with(@name,'password')]"));
		pass.sendKeys("admin123");
		
	//  3)text()---------------
		
	}

}
