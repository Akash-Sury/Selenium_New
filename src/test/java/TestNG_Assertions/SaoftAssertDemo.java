package TestNG_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SaoftAssertDemo {
	
	@Test
	public void TitleTest() {
		
		SoftAssert soft= new SoftAssert();
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/");
		
		String expected_title= "OrangeHRM HR Software | Free & Open Source HR Software | HRIS | OrangeHRM";
		
		String actual_title=driver.getTitle();
		
		System.out.println(actual_title);
		
		soft.assertEquals(actual_title, expected_title,"Test case Failed");
		
		System.out.println("verifying title");
		
		String Expected_text="Try it for Free";
		String actualtext=driver.findElement(By.xpath("//input[@value='Try it for Free']")).getAttribute("value");
		
		System.out.println(actualtext);
		
		soft.assertEquals(actualtext, Expected_text,"Test case Failed");
		
		System.out.println("verifying Text");
		
		driver.close();
		
		soft.assertAll();
	
	}

}
