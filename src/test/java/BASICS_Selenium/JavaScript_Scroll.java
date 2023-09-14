package BASICS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Scroll {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)");   // for schroll down 200
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-200)");   // for Scroll up use -200
		

	}

}
