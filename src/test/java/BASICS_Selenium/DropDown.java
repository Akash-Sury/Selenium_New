package BASICS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.automationtesting.in/Register.html"); 	
		
		WebElement Skills =driver.findElement(By.id("Skills"));
		
		Select sel = new Select(Skills);
		
		sel.selectByValue("Adobe InDesign");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		
		sel.getAllSelectedOptions();
		
		
		
		

	}

}
