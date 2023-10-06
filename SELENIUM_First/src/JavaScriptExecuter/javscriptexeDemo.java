package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javscriptexeDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		/*Sometimes, Selenium webdriver faces problems in interacting with a few web elements,
		 *  For example, the user opens a website and there is an unexpected pop-up window that will 
		 *  prevent the webdriver from performing operations and produce inaccurate results. 
		 *  This is where JavascriptExecutor comes into use.
		 */
	
		
		WebElement remote=driver.findElement(By.xpath("//*[text()='Remote']"));
	//	remote.click();   //by driver click method
		
		Actions action=new Actions(driver);
	//	action.click(remote);   //by actions clas click method
	// 1) for click by using js method	
		js.executeScript("arguments[0].click();", remote); //by javascript executer click()method
	    
		driver.get("https://www.google.com");
		
		WebElement searchbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		action.sendKeys(searchbox, "selenium").perform();
		
		WebElement searchbtn=driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@aria-label='Google Search']"));
		js.executeScript("arguments[0].click();", searchbtn);
		
	//  for generate Alert on window	
		js.executeScript("alert('welcome to google.com')");
		driver.switchTo().alert().accept();
	//  for scrolling page	
	//	js.executeScript("window.scrollBy(0,600)");
		
		WebElement searchelement=driver.findElement(By.xpath("(//span[@jscontroller='msmzHf'])[3]"));
		js.executeScript("arguments[0].srollIntoview(true)", searchelement);
		
	// for refresh browser
		js.executeScript("history.go(0)");
		
	// To get the Title of our webpage

		String titleText =  js.executeScript("return document.title;").toString();
		System.out.println(titleText);
		
		
		

	}

}
