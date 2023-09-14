package BASICS_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Handle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com/");
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(AllLinks.size());
		
		for(int i=0;i<AllLinks.size();i++) {
			
			System.out.println(AllLinks.get(i).getAttribute("href"));  //Links Stored in Attribute href
			System.out.println(AllLinks.get(i).getText());
			
		}

	}

}
