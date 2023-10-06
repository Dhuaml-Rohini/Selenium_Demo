package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DPLogintest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String uname, String pass) {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationexercise.com/login");
	  
	  WebElement user=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
	  WebElement password=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
	  WebElement loginbtn=driver.findElement(By.xpath("//button[@data-qa='login-button']"));
	  user.sendKeys(uname);
	  password.sendKeys(pass);
	 // loginbtn.click();
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click", loginbtn);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "rohini.dhumal@gmail.com", "rohini@123" },
      new Object[] { "shivraj.gadhave@gmail.com", "shiv@123" },
    };
  }
}
