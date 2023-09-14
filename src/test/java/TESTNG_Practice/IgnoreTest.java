package TESTNG_Practice;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test(enabled = false)
	public void Test1() {
		
		System.out.println("I m in Test 1");
	}
	
	@Test
	public void Test2() {
		
		System.out.println("I m in the Test 2");
		
	}

}
