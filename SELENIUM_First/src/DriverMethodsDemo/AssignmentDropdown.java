package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//https://zpluscybertech.com/#/Home-----url
public class AssignmentDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zpluscybertech.com/#/Home");
		
	//	WebElement services=driver.findElement(By.xpath("//a[@role='button']"));
	//	services.click();
	//	WebElement drop=driver.findElement(By.linkText("Software Development"));
	//	drop.click();
		
		WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		btn.click();
		
		
		

	}

}
