package BASICS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_HiddenElement { //throw an exception ElementNotVisisble,elementNotInteractableException

	public static void main(String[] args) {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.id("hide-textbox")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('hide-textbox').value='Akash';");


	}

}
