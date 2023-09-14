package BASICS_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement Skills =driver.findElement(By.id("Skills"));

		Select sel = new Select(Skills);
		
		sel.getFirstSelectedOption();// it will select first option
		
		sel.selectByIndex(5);
		
		Thread.sleep(3000);
		
		sel.selectByValue("APIs");
		
		List<WebElement> all=sel.getAllSelectedOptions();  //return all selected values
		
		System.out.println(all.size());
		
		
		
		

	}

}
