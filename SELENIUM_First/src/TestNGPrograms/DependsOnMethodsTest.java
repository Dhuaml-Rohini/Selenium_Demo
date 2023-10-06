package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	
	public WebDriver driver;
  @Test(dependsOnMethods="OpenBrowser")
  public void SinUp() {
	  WebElement sinupform=driver.findElement(By.xpath("//div[@class='signup-form']"));
	  Assert.assertTrue(sinupform.isDisplayed(), "sinup form is displayed");
	  WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
	  name.sendKeys("Rohini");
	  WebElement email=driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
	  email.sendKeys("dhumalrohini@gmail.com");
	  WebElement sinup=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
	  sinup.click();
	  System.out.println("this will execute second(sinUp)");
  }
  @Test(dependsOnMethods= {"OpenBrowser","SinUp"})
  public void validateLoginform() {
	  
	  WebElement loginfromvisible=driver.findElement(By.xpath("//div[@class='login-form']"));
	  Assert.assertTrue(loginfromvisible.isDisplayed(), "login form is displayed");
	 
	  WebElement mrsradiobtn=driver.findElement(By.xpath("//input[@id='id_gender2']"));
	  mrsradiobtn.click();
	  
	  WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	  pass.sendKeys("p@ssw0rd");
	  
	  System.out.println("this will execute third(validateloginform)");
  }
  @Test
  public void OpenBrowser() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationexercise.com/login");
	  System.out.println("this will execute first(openBrowser)");
  }
  @Test(dependsOnMethods= {"OpenBrowser","SinUp","validateLoginform"})  //multiple dependency
  public void logout() {
	  System.out.println("this will execute fourth(logout) ");
  }
}
