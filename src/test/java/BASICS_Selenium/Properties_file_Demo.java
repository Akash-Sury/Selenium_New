package BASICS_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_file_Demo {

	public static void main(String[] args) throws IOException {
		
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//	
//		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		Properties prop = new Properties();
		FileInputStream fp = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\SELENIUM_PRACTICE\\Properties\\TestData.properties");
		prop.load(fp);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		

	}

}
