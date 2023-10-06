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

public class CrossBrowserTest {
	public WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(); 
		}
	}
	
  @Test(dataProvider = "dp")
  public void login(String  uname, String pass) {
	  driver.get("https://demoqa.com/login");
	  WebElement user=driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Login']"));
	  user.sendKeys(uname);
	  password.sendKeys(pass);
	  //loginbtn.click();
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", loginbtn);
	  
  }

  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "rohini.dhumal", "rohini@1234" },
      
    };
  }
}
