package BASICS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://the-internet.herokuapp.com/tinymce");
		
		WebElement element =driver.findElement(By.tagName("iframe"));
		System.out.println(element.getSize());
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Akash Suryawanshi");
		
		

	}

}
