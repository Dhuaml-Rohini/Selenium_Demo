package Alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	   WebElement cust_ID=driver.findElement(By.xpath("//input[@name='cusid']"));
	   cust_ID.sendKeys("1234");
	   WebElement submitbtn=driver.findElement(By.xpath("//input[@name='submit']"));
	   submitbtn.click();
	   
	   driver.switchTo().alert().accept();
	   driver.switchTo().alert().accept();
	   
	   driver.get("https://demoqa.com/alerts");
	   driver.manage().window().maximize();
	   
	   WebElement firstbtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
	   firstbtn.click();
	 //System.out.println(firstbtn.getText());
	   
	   driver.switchTo().alert().accept();
	   System.out.println(firstbtn.getText());
	   
	   WebElement timeralert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	   timeralert.click();
	   
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.alertIsPresent());
	   driver.switchTo().alert().accept();
	   
	   WebElement confirm=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	   confirm.click();
	   driver.switchTo().alert().dismiss();
       
	   WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
	   prompt.click();
	   driver.switchTo().alert().sendKeys("rohini");
	   driver.switchTo().alert().accept();
	}

}
