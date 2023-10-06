package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DEMOQAProfilePage {
     public WebDriver driver;
     
  // object repository
     @FindBy(xpath="//div[@class='main-header']")
     WebElement Profilepagetext;
     
     @FindBy(xpath="//input[@placeholder='Type to search']")
     WebElement Searchbooktext;
     
     //for locate svg tag xpath
     @FindBy(xpath="//*[name()='svg']//*[local-name()='path' and contains(@d,'0113 0z')]")
     WebElement searchicon;
     
     @FindBy(xpath="//label[@id='userName-label']")
     WebElement usernaelabel ;
     
     @FindBy(xpath="//label[@id='userName-value']")
     WebElement usernamevalue;
     
     @FindBy(xpath="//button[text()='Log out']")
     WebElement logoutbtn;
     
     @FindBy(xpath="//button[text()='Previous']")
     WebElement previousbtn;
     
     @FindBy(xpath="//button[text()='Next']")
     WebElement nextbtn;
     
     @FindBy(xpath="//select[@aria-label='rows per page']//option[text()='5 rows']")
     WebElement rowdropdown;
     
     @FindBy(xpath="//button[@id='gotoStore']")
     WebElement gotobookstorebtn;
     
     @FindBy(xpath="//button[text()='Delete Account']")
     WebElement deleteaccbtn;
     
     @FindBy(xpath="//button[text()='Delete All Books']")
     WebElement Deleteallbooksbtn;
   // call constructor
     public DEMOQAProfilePage(WebDriver driver){
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
     }
  // Methods
     public String validatetext() {
		return Profilepagetext.getText();
    	 
    }
     public void validateuservalue() {
    	 String Actualvalue=usernamevalue.getText();
    	 String Expectedvalue="rohini.dhumal";
    	 Assert.assertEquals(Actualvalue, Expectedvalue);
     }
     
     public void searchBook(String booktext) {
    	 Searchbooktext.sendKeys(booktext);
    	 searchicon.click();
     }
     
     
    
  
}
