package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest {
	public WebDriver driver;
	/*Sanity Testing :- is done after thorough regression testing is over. 
	  It is done to make sure that any defect fixes or changes 
	  after regression testing does not break the core functionality of the product.
	 */
	
	/*End-to-End Testing :- is a methodology used to test whether the flow of an application
	  is performing as designed from start to finish.
	 *End to End Testing is usually executed after functional and system testing.
	 */
  @Test(groups={"sanity","regression","E2ETest"},priority=1)
  public void loginPage() {
	  driver=new ChromeDriver();
	  Reporter.log("we use google chrome version 117 for launching chrome browser",true);
	  driver.manage().window().maximize();
	  driver.get("https://automationexercise.com/login"); 
	  String ExpectedTitle="Automation Exercise - Signup / Login";
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ExpectedTitle, ActualTitle, "fail:Actual title is not match with expected title");
	  }
  /*Regression testing :- is the retesting of a software system to confirm that 
    changes made to a few parts of the codes have not any side effects on existing system functionalities.
   *It is to ensure that old codes are still working as 
    they were before the introduction of the new change.
   */
  @Test(groups="regression",priority=2)
  public void validatelogin() {
	  WebElement sinupform=driver.findElement(By.xpath("//div[@class='signup-form']"));
	  Assert.assertTrue(sinupform.isDisplayed(), "sinup form is displayed");
	  WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
	  name.sendKeys("Rohini");
	  WebElement email=driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
	  email.sendKeys("dhumalrohini@gmail.com");
	  WebElement sinup=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
	  sinup.click();
	  
	  WebElement loginfromvisible=driver.findElement(By.xpath("//div[@class='login-form']"));
	  Assert.assertTrue(loginfromvisible.isDisplayed(), "login form is displayed");
	 
	  WebElement mrsradiobtn=driver.findElement(By.xpath("//input[@id='id_gender2']"));
	  mrsradiobtn.click();
	  
	  WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	  pass.sendKeys("p@ssw0rd");
	  
	
	  }
/*types of Functional Testing:
1)Functional Testing
2)Unit Testing
3)Integration Testing
4)Smoke Testing
5)Sanity Testing
6)Regression Testing
*/
  
  
}
