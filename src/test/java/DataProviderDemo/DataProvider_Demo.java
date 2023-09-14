package DataProviderDemo;

import org.testng.annotations.DataProvider;

public class DataProvider_Demo {
	
	
//	@org.testng.annotations.Test(dataProvider="dataSet")
//	public void Test(String username,String password) {
//		
//		System.out.println(username+""+password);
//		
//	}
	
	@org.testng.annotations.Test(dataProvider="dataSet")
	public void Test1(String username,String password) {
		
		System.out.println(username+""+password);
		
	}
	
	public Object[][] dataSet() {
		
		return new Object[][] {
			{"username","password"},
			{"username1","password1"},
			{"username","password"}	
			};
		
	}
	
	
	
//	@DataProvider
//	public Object[][] dataSet() {
//		
//		Object [][] dataset=new Object[4][2];    // 4 rows and 2 columns
//		
//		//First row
//		dataset[0][0]="User1";
//		dataset[0][1]="pass1";
//		
//		//Second row
//		dataset[1][0]="User2";
//		dataset[1][1]="pass2";
//		
//		dataset[2][0]="User3";
//		dataset[2][1]="pass3";
//
//		dataset[3][0]="User4";
//		dataset[3][1]="pass4";
//		
//		return dataset;
//		
//	}
//	
//	
	
	
	

}
