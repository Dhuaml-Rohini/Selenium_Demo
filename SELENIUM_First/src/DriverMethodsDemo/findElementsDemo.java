package DriverMethodsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElementsDemo {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito"); //for delete cookies
		option.addArguments("--start-maximized"); // for maximize window
		option.addArguments("--verbose",
			  "--headless",
			  "--disable-web-security",
			  "--ignore-certificate-errors",
			  "--allow-running-insecure-content",
			  "--allow-insecure-localhost",
			  "--no-sandbox",
			  "--disable-gpu");
		WebDriver driver=new ChromeDriver(option);
	//  driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		List<WebElement> grid1=driver.findElements(By.xpath("//div[@id='desktop-grid-1']//child::span"));
		System.out.println((grid1.size()));
		for(WebElement ele:grid1) {
			System.out.println(ele.getText());
		}
	}

}
