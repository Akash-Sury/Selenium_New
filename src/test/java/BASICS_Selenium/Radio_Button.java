package BASICS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement radio=driver.findElement(By.xpath("//input[@value='Male']"));
		
		radio.click();
		
		System.out.println(radio.isSelected());
		
		Thread.sleep(3000);
		
		
		
		
		
		

	}

}
