package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class CrossBrowserTest2 {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
	}
  @Test(dataProvider = "loginDp", description="automation Exercise test")
  public void login(String uname, String pass) {
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

  @DataProvider(name="loginDp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "rohini.dhumal@gmail.com", "rohini@123" },
     
    };
  }
}
