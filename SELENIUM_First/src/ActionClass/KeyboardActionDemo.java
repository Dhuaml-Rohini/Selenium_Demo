package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		Actions action=new Actions(driver);
		
		WebElement fullname=driver.findElement(By.xpath("//input[@id='userName']"));
		action.sendKeys(fullname, "Rohini Dhumal").perform();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		action.sendKeys(email, "rohini.dhumal@gmail.com").perform();
		
		WebElement currentaddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		action.sendKeys(currentaddress, "At post-pargaon Tal-Washi Dist-Osmanabad").perform();
	//	for select text
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.build().perform();
		action.keyDown(Keys.CONTROL).perform();
		
	//  for copy text
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.build().perform();
		action.keyUp(Keys.CONTROL).perform();
		
	//  for cursor going on next line/textbox	
		action.sendKeys(Keys.TAB).perform();
		
	//  for	paste text
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.build().perform();
		action.keyUp(Keys.CONTROL).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.ENTER).perform();								
		
		
		
		
		


	}

}
