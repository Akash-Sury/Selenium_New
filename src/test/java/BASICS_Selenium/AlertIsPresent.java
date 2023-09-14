package BASICS_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertIsPresent {  

	public static void main(String[] args) {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("alert1")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.alertIsPresent());
		
		//************ .alertIsPresent is used to wait for opening alert before throwing an exception NoSuchAlertPresent
		
		Alert alert=driver.switchTo().alert();		
		
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
	//	alert.dismiss();
		
		System.out.println("Test case passed");
		
		driver.close();
		
		
		
				
		
		
		
		
		

	}

}
