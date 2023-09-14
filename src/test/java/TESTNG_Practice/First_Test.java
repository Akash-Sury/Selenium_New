package TESTNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class First_Test {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeTest() {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		
	}
	
	@Test
	public void LaunchUrl() {
		
		
		
	}
	
	@AfterTest
	public void AfterMethod() {
		
		driver.quit();
		
		
	}
	
	

}
