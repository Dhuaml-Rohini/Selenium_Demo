package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxessMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobile");
		WebElement searchbtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();
		WebElement redmi=driver.findElement(By.xpath("//li[@aria-label='Redmi']//child::i"));
		redmi.click();
		
	}

}
