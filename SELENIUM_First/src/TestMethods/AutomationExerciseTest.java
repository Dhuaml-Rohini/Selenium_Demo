package TestMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPageofAutomationExercise;
import Pages.SinUpPageofAutomationExercise;

public class AutomationExerciseTest {
	public WebDriver driver;
	public LoginPageofAutomationExercise loginpage;
	public SinUpPageofAutomationExercise sinUppage;
	@BeforeClass
	public void setup() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
	}
  @Test(priority=4)
  public void sinupTest () {
	  sinUppage=new SinUpPageofAutomationExercise(driver);
	  sinUppage.sinUP("Shiv", "shivgadhave@gmail.com");
   }
  
  @Test(priority=2)
  public void validatelogo(){
	  loginpage =new LoginPageofAutomationExercise(driver);
	  loginpage.validateLogo();
	  
  }
  @Test(priority=1)
  public void validateTitle() {
	  loginpage =new LoginPageofAutomationExercise(driver);
	  String actualTitle=driver.getTitle();
	  String ExpectedTitle="Automation Exercise - Signup / Login";
	  Assert.assertEquals(actualTitle, ExpectedTitle);
  }
  @Test(priority=3)
  public void logintoautomationpage() {
  loginpage=new LoginPageofAutomationExercise(driver);
  loginpage.logintopage("dhumalrohini1012@gmail.com", "rohini@1234");//pass=p@ssw0rd
	  
  }
 
}
