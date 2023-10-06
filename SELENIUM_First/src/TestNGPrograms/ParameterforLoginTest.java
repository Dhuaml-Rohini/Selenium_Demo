package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterforLoginTest {
	public WebDriver driver;
  @Test
  @Parameters({"username","password"})
  public void login(String uname,String pwd) {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/login");
	  
	  WebElement user=driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginbtn=driver.findElement(By.xpath("//button[@id='login']"));
	  user.sendKeys(uname);
	  pass.sendKeys(pwd);
	  loginbtn.click();
  }
}
