package BASICS_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsStrap_DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class='dropdown-menu test']//li//a"));
	
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++) {
		
		System.out.println(list.get(i).getText());
		
		if("HTML".equals(list.get(i).getText())) {
			
			list.get(i).click();
			
		}
		
	}
		
		

	}

}
