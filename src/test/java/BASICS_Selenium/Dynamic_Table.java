package BASICS_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		List<WebElement>  list =driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr//td"));
//		
//		System.out.println(list.size());
//	
//		for(int i=0;i<list.size();i++) {
//			
//			
//			System.out.println(list.get(i).getText());
//			
//			if("Centro comercial Moctezuma".equals(list.get(i).getText())) {
//				
//				System.out.println("Test case passed");
//				
//				
//			}
//			else
//			{
//				
//				System.out.println("test case failed");
//				
//			}
//			
//		}
		
		//*[@id="customers"]/tbody/tr
		//*[@id="customers"]/tbody/tr[2]/td
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		System.out.println(rows.size());
		
		
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		System.out.println(columns.size());
		
		for(int i=1;i<=rows.size();i++) {
			
			for(int j=1;j<=columns.size();j++) {
				
			System.out.println(	driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText());
				
			}
			
		}

	}

}
