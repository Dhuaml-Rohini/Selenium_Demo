package PropertiesfileData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshots {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\workspaceForEclipse\\New Java Class\\SELENIUM_First\\config.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
	//	prop.setProperty("url", "https://www.naukri.com");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File filesrc=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filesrc, new File("C:\\workspaceForEclipse\\New Java Class\\SELENIUM_First\\Screenshots\\"+timestamp()+".png"));
	}
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	

}
