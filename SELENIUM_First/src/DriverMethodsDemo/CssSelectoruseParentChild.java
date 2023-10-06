package DriverMethodsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelectoruseParentChild {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			
		 driver.get("https://www.facebook.com/reg");
	//   select dropdown of day	 
	     WebElement day=driver.findElement(By.id("day"));
	     Select sday=new Select(day);
	     sday.selectByIndex(14);
	     sday.selectByValue("13");
	     sday.selectByVisibleText("13");
	 
	//   select dropdown of month     
	     WebElement month=driver.findElement(By.name("birthday_month"));
	     Select smonth=new Select(month);
	     smonth.selectByIndex(10);
	     smonth.selectByValue("9");
	     smonth.selectByVisibleText("Sep");
	
	//   select dropdown of year 
	     WebElement year=driver.findElement(By.id("year"));
	     Select syear=new Select(year);
	     syear.selectByIndex(14);
	     syear.selectByValue("2009");
	     syear.selectByVisibleText("2009");
	     
	     
			
	//   Css selector using parent child relation--syntax--parent tagname attributesymbol value>child tagname:nth-of-type()
	//	 WebElement day1=driver.findElement(By.cssSelector("select[id='day']>option:nth-of-type(29)"));
	//	 day1.click();
		
	//	 WebElement month=driver.findElement(By.cssSelector("select[id='month']>option:nth-of-type(11)"));
	//	 month.click();
		 
	//	 WebElement year=driver.findElement(By.cssSelector("select[id='year']>option:nth-of-type(30)"));
	//	 year.click();
		 

	}

}
