package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageofAutomationExercise {
      public WebDriver driver;
      
   // maintain repository
      @FindBy(xpath="//div[@class='logo pull-left']//img[contains(@src,'logo')]")
      WebElement logo;
     
      @FindBy(xpath="//div[@class='login-form']//h2[text()='Login to your account']")
      WebElement LoginText;  
     
      @FindBy(xpath="//input[@data-qa='login-email']")
      WebElement LoginEmail;
      
      @FindBy(xpath="//input[@data-qa='login-password']")
      WebElement LoginPass;
      
      @FindBy(xpath="//button[@data-qa='login-button']")
      WebElement LoginBtn; 
      
      @FindBy(xpath="//h2[text()='Subscription']")
      WebElement subscription;
      
      @FindBy(xpath="//input[@id='susbscribe_email']")
      WebElement subemailtextbox;
      
      @FindBy(xpath="(//button[@class='btn btn-default'])[3]")
      WebElement subcribebtn;
     //call constructor with page factory 
    public LoginPageofAutomationExercise(WebDriver driver) {
	 this.driver=driver;	
	 PageFactory.initElements(driver,this);
  }
    //Methods
    public void validateLogo() {
	  Assert.assertTrue(logo.isDisplayed());
	  
   }
    
    public void logintopage(String Email,String pwd) {
	   LoginEmail.sendKeys(Email);
	   LoginPass.sendKeys(pwd);
	   LoginBtn.click();
	// JavascriptExecutor js=(JavascriptExecutor)driver;
	// js.executeScript("arguments[0].click();", Sinupbtn);
   }
  
	   
   }
  
   
  
  
  
  
  
  
  
  
  
  

