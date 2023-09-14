package BASICS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExceutor_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Akash");

		WebElement element=driver.findElement(By.xpath("//input[@type='email']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='Akash'", element);
		
	}

}
