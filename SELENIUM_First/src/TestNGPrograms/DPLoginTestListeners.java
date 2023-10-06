package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
//@Listeners(ListenerDemo.class)
public class DPLoginTestListeners {
	public WebDriver driver;
	
	  @Test(dataProvider = "LoginDp", description="DemoQA login test",timeOut=10000)
	  public void login(  String uname, String pass) throws InterruptedException {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/login");
		  
		  WebElement user=driver.findElement(By.xpath("//input[@id='userName']"));
		  WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement logbtn=driver.findElement(By.xpath("//button[text()='Login']"));
		  user.sendKeys(uname);	
		  pwd.sendKeys(pass);
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", logbtn);
		  
		  Thread.sleep(3000);
		  Assert.assertTrue(driver.getCurrentUrl().contains("profile"));
	}
	  @Test
	  public void testsuccess() {
		  Assert.assertTrue(true);  //test case pass
	  }
	  @Test
	  public void testfailure() {
		  Assert.assertTrue(false);//test case failed
	  }

	  @DataProvider(name="LoginDp")
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "rohini.dhumal", "rohini@1234" },
	      new Object[] { "bharat.lokhande", "bharat@1234" },
	     // new Object[] { "amita.malusare", "amita@123" },
	    //  new Object[] { "diksha.dhumal", "dhiksha@124" },
	      
	    };
	  }
}
