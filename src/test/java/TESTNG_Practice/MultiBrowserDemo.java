package TESTNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserDemo {
	
	// testNg.xml4 is applicable
	
	WebDriver driver=null;
	
	@BeforeTest
	@Parameters("browserName")
	public void SetUp(String browserName) {
		
		System.out.println("Browser name is :"+ browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriver driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriver driver = new FirefoxDriver();
			
		}
		
		
	}

	@Test
	public void Test1() throws Exception {
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		
		
	}
	@AfterTest
	public void Teardown() {
		driver.close();
		System.out.println("Test completed");
		
	}
}
