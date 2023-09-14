package BASICS_Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrip_Click {

	public static void main(String[] args) {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		JavascriptExecutor js = (JavascriptExecutor)driver;  //go to console type  document.getElementById

		js.executeScript("document.getElementById('checkbox1').click()");





	}

}
