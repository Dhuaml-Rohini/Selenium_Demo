package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SinUpPageofAutomationExercise {
	  public WebDriver driver;
     //To maintain object repository
	 @FindBy(xpath="//div[@class='signup-form']//h2[text()='New User Signup!']")
     WebElement Sinuptext; 
	 
	 @FindBy(xpath="//input[@data-qa='signup-name']")
     WebElement NameTextbox;
	 
	 @FindBy(xpath="//input[@data-qa='signup-email']")
     WebElement Sinupemail; 
	 
	 @FindBy(xpath="//button[@data-qa='signup-button']")
     WebElement Sinupbtn;
	 
	 //call constructor
	  public SinUpPageofAutomationExercise(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	  //method
	
	  public void sinUP(String name,String email) {
		  NameTextbox.sendKeys(name);
		  Sinupemail.sendKeys(email);
     	  Sinupbtn.click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", Sinupbtn);
	}
	
	
	
	}
	 
 
 
	

