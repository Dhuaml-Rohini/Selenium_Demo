package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		Actions action=new Actions(driver);
		
		WebElement doubleclickbtn=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(doubleclickbtn).perform();
		
		WebElement rightclickbtn=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightclickbtn).perform();
		
		WebElement clickmebtn=driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(clickmebtn).perform();
		
		WebElement bookstore=driver.findElement(By.xpath("//div[text()='Book Store Application']"));
	//	action.scrollToElement(bookstore).perform();
		action.moveToElement(bookstore).perform();
		
		driver.get("https://demoqa.com/menu/");
		
		WebElement maintitem2=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(maintitem2).perform();
		
		WebElement subsublist=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		action.moveToElement(subsublist).perform();
		
		
		

	}

}
