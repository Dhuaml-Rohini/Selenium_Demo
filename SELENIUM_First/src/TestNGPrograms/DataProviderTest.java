package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String uname, String pwd) throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/login");
	  
	  WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginbtn=driver.findElement(By.xpath("//button[@id='login']"));
	  username.sendKeys(uname);
	  password.sendKeys(pwd);
	  loginbtn.click();
	  Thread.sleep(2000);
	//  JavascriptExecutor js=(JavascriptExecutor)driver;
	  Assert.assertTrue(driver.getCurrentUrl().contains("profile"));
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "rohini.dhumal", "rohini@1234" },
      new Object[] { "shivraj.gadhave", "shiv@1012#" },
    };
  }
}
