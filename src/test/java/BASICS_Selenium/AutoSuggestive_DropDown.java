package BASICS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_DropDown {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.makemytrip.com/"); 
		
		driver.findElement(By.xpath("//a[@class='close']")).click();
		
		//input[@placeholder='From']
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		
	}

}
