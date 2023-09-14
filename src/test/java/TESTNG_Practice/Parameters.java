package TESTNG_Practice;

public class Parameters {
	
	//testng.xml 7 is applicable
	
	@org.testng.annotations.Parameters("MyName")
	@org.testng.annotations.Test
	public void Test(String name) {
		
		System.out.println("My name is :" + name);
		
	}

}
