package BASICS_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.id("datepicker1")).click();
		
		
	List<WebElement> Alldates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	
	for(int i=0;i<Alldates.size();i++) {
		
		System.out.println(Alldates.get(i).getText());
		
		String date =Alldates.get(i).getText();
		
		if("date".equals("26")) {
			
			Alldates.get(i).click();
			Thread.sleep(3000);
			
		}
		
	}
	
	System.out.println("Test Case Passed");
	
		

	}

}
