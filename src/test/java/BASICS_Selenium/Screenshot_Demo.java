package BASICS_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Demo {

	public static void main(String[] args) throws Exception {
		
		Date currentdate = new Date();
		
		String screenshotFileName= currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotFileName);
		
		

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		TakesScreenshot ts= (TakesScreenshot)driver;
		File file=	ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File(".//screenshot//" + screenshotFileName+".png"));



	}

}
