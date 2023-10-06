package TestMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPageofAutomationExercise;
import Pages.ProductPageofAutomatinExercise;

public class AutomationExerciseApplTest {
	public WebDriver driver;
	public LoginPageofAutomationExercise loginpage;
	public ProductPageofAutomatinExercise productpage;
	
  @BeforeClass
  public void SetUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationexercise.com/login");
  }

	 
  @Test(priority=1)
  public void login(){
	 loginpage=new LoginPageofAutomationExercise(driver);
	 loginpage.logintopage("dhumalrohini1012@gmail.com", "p@ssw0rd");  
  }
  @Test(priority=2)
  public void validateText() {
	  driver.get("https://automationexercise.com/products");
	  productpage=new ProductPageofAutomatinExercise(driver);
	  productpage.validateTitle();
	//  productpage.SearchProduct("T-shirt");
	  
  }
  @Test(priority=3)
  public void Searchtoproduct() {
	  productpage.SearchProduct("T-shirts");
	  
  }
}
