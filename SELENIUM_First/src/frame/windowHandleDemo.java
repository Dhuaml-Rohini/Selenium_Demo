package frame;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		String parentWindow=driver.getWindowHandle();
		
		WebElement services=driver.findElement(By.xpath("//div[text()='Services']"));
		
		WebElement Internship=driver.findElement(By.xpath("//span[text()='Internship']"));
		
		WebElement software=driver.findElement(By.xpath("//span[text()='Software & IT']"));
		services.click();
		services.click();
		software.click();
		
		Set<String>childwindows=driver.getWindowHandles();
		
		Iterator<String>itr=childwindows.iterator();
		while(itr.hasNext()) {
			String childwindow=itr.next();
			
			if(!parentWindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
				
				WebElement knowmore=driver.findElement(By.xpath("//div[text()='KNOW MORE']"));
				knowmore.click();
			}
		}
		driver.close();
		//driver.switchTo().window(parentWindow);
	}

}
