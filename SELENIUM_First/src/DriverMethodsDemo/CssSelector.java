package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	//  locator--By cssSelector using id--syntax-tagname atributesymbol and attribute value
		WebElement emailorPhon=driver.findElement(By.cssSelector("input#email"));
		emailorPhon.sendKeys("rohini@gmail.com");
		
	//  locator--By cssSelector using class--syntax-tagname atributesymbol and attribute value
	//  space in class value removed by replacing(.) 	
	//    WebElement pass=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
	//    pass.sendKeys("p@ssw0rd");
	
    // cssSelector--using combine Atrribute--syntax-tagname symbol of atrribute value symbol of atribute value
	    
	   WebElement pass1=driver.findElement(By.cssSelector("input#email[class='inputtext._55r1._6luy']"));
	   pass1.sendKeys("pass@123");
	}

}
