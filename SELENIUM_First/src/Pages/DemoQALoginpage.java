package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQALoginpage {
	public WebDriver driver;
	
    //object repository
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[@id='newUser']")
	WebElement newuserbtn;
	
	@FindBy(xpath="//title[text()='DEMOQA']")
	WebElement Ttletext;
	//call constructor
	public DemoQALoginpage(WebDriver driver){
		this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	//methods
	public void setusername(String uname) {
	  username.sendKeys(uname);
	}
	public void setpassword(String pwd) {
	  password.sendKeys(pwd);
	}
	public void loginclick() {
	  loginbtn.click();
   }
	public void clicknewuserbtn() {
	  newuserbtn.click();	
	}
	
	
	public void logintoDEMOQA(String uname,String pwd) {
		
		this.setusername(uname);
		this.setpassword(pwd);
		this.loginclick();
	//	this.clicknewuserbtn();
		
	}
}
