package BASICS_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();		
		
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
	//	alert.dismiss();
		
		System.out.println("Test case passed");
		
		driver.close();
		
		
		
				
		
		

	}

}
