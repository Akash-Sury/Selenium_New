package BASICS_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox1")).isSelected();
		
		Thread.sleep(3000);
		
		
		// for single checkbox
		// driver.findElement(By.id("checkbox1")).click(); 
		
		// for multiple
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='form-group']//div//div//input"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			if("Movies".equals(list.get(i).getText())) {
				
				list.get(i).click();
				
			}
			
		}
		
		
		
		

	}

}
