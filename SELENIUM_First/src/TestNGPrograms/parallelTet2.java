package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelTet2 {
	public WebDriver driver;
	
	  @Test
	  public void loginwithchrome() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
		  
		  WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement logbtn=driver.findElement(By.xpath("//button[@name='login']"));
		  user.sendKeys("rohini.dhumal@gmail.com");	
		  pwd.sendKeys("rohini@1234");
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", logbtn);
		  
	  }
	  @Test
	  public void loginwithFirefox() {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
		  
		  WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement logbtn=driver.findElement(By.xpath("//button[@name='login']"));
		  user.sendKeys("rohini.dhumal@gmail.com");	
		  pwd.sendKeys("rohini@1234");
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", logbtn);
		  
		  
	  }
}
