package TestNG_Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertdemo {
	
	@Test
	public void TitleTest() {
		
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.orangehrm.com/");
	
	String expected_title= "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | OrangeHRM";
	
	String actual_title=driver.getTitle();
	
	Assert.assertEquals(actual_title, expected_title);
	
	System.out.println("Test case passed");
	
	driver.close();
	
	//System.out.println(driver.getTitle());
	
	
	}
	
}
