package frame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleForEach {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.naukri.com");
		String parentWindow=driver.getWindowHandle();           
		
		WebElement mnc=driver.findElement(By.xpath("//a[@class='ntc__chip-wrapper']//child::span[text()='MNC']"));
		
        WebElement fresher=driver.findElement(By.xpath("//a[@class='ntc__chip-wrapper']//child::span[text()='Fresher']"));
		
		WebElement internship=driver.findElement(By.xpath("//a[@class='ntc__chip-wrapper']//child::span[text()='Internship']"));
		mnc.click();
		fresher.click();
		internship.click();
		
		Set<String>childwindows=driver.getWindowHandles();
		
		for(String window:childwindows) {
			if(!parentWindow.equals(window)) {
			driver.switchTo().window(window);
			wait.until(ExpectedConditions.titleContains("Naukri"));
			String title=driver.getTitle();
			
			  if(title.contains("Mnc")) {
				WebElement startup =driver.findElement(By.xpath("//div[@class='filterOptns']//span[@title='Startup']"));
				startup.click();
			}
			  else if(title.contains("Fresher")) {
				WebElement hybrid =driver.findElement(By.xpath("//p[@class='fleft txtLbl']//child::span[text()='Hybrid']"));
				hybrid.click();
			}
			  else if(title.contains("Internship")) {
			    WebElement business=driver.findElement(By.xpath("//div[@class='chckBoxCont mt-8']//span[text()='Sales & Business Development']"));
				business.click();		
			}
		     System.out.println(driver.getTitle());
		     
	      }
	   }
     
	   driver.switchTo().window(parentWindow);
	  
 }
	
}
