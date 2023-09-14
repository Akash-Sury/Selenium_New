package TESTNG_Practice;

import org.testng.annotations.Test;

public class Priority_Demo {
	
	@Test(priority = 0,description = "This is AddAll method")
	public void Add() {
		
		System.out.println("I m in Add method");
		
	}
	@Test(priority = 1)
	public void AddALL() {
		
		System.out.println("I m in Add All method");
		
	}
	@Test(priority = 2)
	public void Delete() {
		
		System.out.println(" I m in Delete method");
		
	}
	@Test
	public void DeleteAll() {
		
		System.out.println(" I m in Delete All method");
		
	}
	
	

}
