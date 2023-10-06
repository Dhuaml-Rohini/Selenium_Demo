package DriverMethodsDemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//Get Method
		driver.get("https://google.com");
		
		driver.get("https://www.facebook.com");
		
		//url saved in string and pass string in get method
		String google="https://google.com";
		String Fb="https://www.facebook.com";
		driver.get(google);
		driver.get(Fb);
		
		//Navigate commands
		driver.navigate().to("https://utkarshaaacademy.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//for mobile view set dimention
		driver.manage().window().setSize(new Dimension(360,740));
		

	}

}

