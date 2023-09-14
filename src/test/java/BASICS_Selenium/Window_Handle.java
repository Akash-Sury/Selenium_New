package BASICS_Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow =driver.getWindowHandle();
		System.out.println("Parent window is " + parentWindow);
		
			driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
			
			Thread.sleep(3000);
			
			
			
			Set<String> child_Windows =driver.getWindowHandles();
			
			System.out.println(child_Windows);
			
			for(String Child:child_Windows) {
				
				System.out.println(Child);
				
				if(!Child.equals(parentWindow)) {
					
					driver.switchTo().window(Child);
					driver.close();
				}
				
			}
		
          driver.switchTo().window(parentWindow);
	}

}
