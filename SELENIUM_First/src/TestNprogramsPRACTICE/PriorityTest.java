package TestNprogramsPRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityTest {
	public WebDriver driver;
  @BeforeClass
   public void setup() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/login");
  }
	
  @Test(priority=2)
  public void login () {
	 WebElement user= driver.findElement(By.xpath("//input[@id='userName']"));
	 WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
	 WebElement loginbtn= driver.findElement(By.xpath("//button[@id='login']"));
	 user.sendKeys("rohini.dhumal");
	 pass.sendKeys("rohini@1234");
	 loginbtn.click();
  }
  @Test(priority=1)
  public void validateTitle () {
	 String Actualtitle= driver.getTitle();
	 String Expectetitle="DEMOQA";
	 Assert.assertEquals(Actualtitle, Expectetitle);
	 
  }
  @Test(priority=3)
  public void navigatetoProfilepage() {
	  WebElement profiletext=driver.findElement(By.xpath("//div[contains(@class,'body-height')]//div[text()='Profile']"));
	  Assert.assertTrue(profiletext.isDisplayed());
	  WebElement booksearchbox=driver.findElement(By.xpath("//input[@id='searchBox']"));
	  booksearchbox.sendKeys("GIT");
	  WebElement searchbtn=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='path' and contains(@d,'0113 0z')]"));
	  searchbtn.click();
  }
}
