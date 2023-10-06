package TestNprogramsPRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupTest1 {
  public WebDriver driver;
  @BeforeClass
  public void Setup() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationexercise.com/login");
  }
  
  @Test
  public void validatelogo() {
  }
}
