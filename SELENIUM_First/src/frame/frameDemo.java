package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");// by id or name values in the bracket
		
		WebElement sampleheading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(sampleheading.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");// by id or name values in the bracket
		WebElement sampleheading1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(sampleheading1.getText());
	}

}
