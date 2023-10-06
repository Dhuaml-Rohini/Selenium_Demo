package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPageofAutomatinExercise {
     public WebDriver driver;
     
	//maintain object repository
	   @FindBy(xpath ="//input[@id='search_product']")
	   WebElement searchbox;
	   
	   @FindBy(xpath ="//button[@id='submit_search']" )
	   WebElement searchbtn;
	   
	   @FindBy(xpath ="//h2[text()='Category']" )
	   WebElement categorytext;
	   
	   @FindBy(xpath ="//a[@data-toggle='collapse']" )
       WebElement Women;
	   
	   @FindBy(xpath ="//i[@class='fa fa-plus']")
	   WebElement womenicon;
	   
	   @FindBy(xpath ="//div[@class='product-overlay']//p[text()='Blue Top']")
	   WebElement bluetop;
	   
	   @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
	   WebElement womenAddToCartBtn;
	   
	   @FindBy(xpath ="//a[text()='Dress ']")
	   WebElement Dress;
	   
	   @FindBy(xpath ="//img[@alt='ecommerce website products']")
	   WebElement Allproductimg;
	
	   //call constructor
	   public ProductPageofAutomatinExercise(WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
	   //method
	   public void validateTitle() {
		   String ActualTitle=driver.getTitle();
		   String ExpectedTitle="Automation Exercise - All Products";
		   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   }
	   public void SearchProduct(String text) {
		   searchbox.sendKeys(text);
		   searchbtn.click();
	   }
}
