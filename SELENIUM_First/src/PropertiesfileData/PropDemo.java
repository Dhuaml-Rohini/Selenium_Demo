package PropertiesfileData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\workspaceForEclipse\\New Java Class\\SELENIUM_First\\config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("url", "https://www.naukri.com");
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}

}
