package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class AssertDemo {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			
		}
 }
	
@Test
  public void validatetitle() {
	  driver.manage().window().maximize();
	  driver.get("https://automationexercise.com/login");
	  String expectedtitle="Automation Exercise - Signup / Login";
	  String ActualTitle=driver.getTitle();
    //  Hard Assert or Defualt assert
	//  Assert.assertEquals(ActualTitle, expectedtitle);
	//  System.out.println("Assert demo");
	  
    //soft Assert
	  SoftAssert sassert=new SoftAssert();
	  sassert.assertEquals(ActualTitle, expectedtitle, "failed:if title isnt matched");
	  sassert.assertAll();  //this is always must defined.
	  }
  @Test
  public void validatelogo() {
	  driver.get("https://facebook.com");
	  WebElement wlogo=driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
	  System.out.println(wlogo);
	  Assert.assertTrue(wlogo.isDisplayed(),"if pass:logo is displayed");
  }
}
