package TestMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.DEMOQAProfilePage;
import Pages.DemoQALoginpage;

public class DEMOQATest {
	public WebDriver driver;
	
//  call the testmethods classes	
	public DemoQALoginpage loginpage;   
	public DEMOQAProfilePage profilepage;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
	}
  @Test(priority=3)
  public void NavigatetoProfile() {
	 
	  profilepage=new DEMOQAProfilePage(driver);
	  profilepage.validateuservalue();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type to search']")));
	  profilepage.searchBook("GIT");
	  
	  
  }
  @Test(priority=1)
  public void cheakTitle() {
	  loginpage=new DemoQALoginpage(driver);
	  String ActualTitle=driver.getTitle();
	  String ExpectedTitle="DEMOQA";
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
  }
  
  @Test(priority=2)
  public void loginTest() {
	  loginpage=new DemoQALoginpage(driver);
	  loginpage.logintoDEMOQA("dhumal.rohini", "rohini@1234");
	 
	  
	  
  }
  
}
