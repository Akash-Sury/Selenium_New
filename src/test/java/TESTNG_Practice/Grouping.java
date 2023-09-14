package TESTNG_Practice;

import org.testng.annotations.Test;

public class Grouping {
	
	//testng6 is applicable
	
	@Test(groups = "Sanity")
	public void Test1() {
		
		System.out.println("This is Test 1");
		
	}
	
	@Test(groups = "Smoke")
	public void Test2() {
		
		System.out.println("This is Test 2");
		
	}
	@Test(groups = "Regression")
	public void Test3() {
		
		System.out.println("This is Test 3");
		
	}
	

}
