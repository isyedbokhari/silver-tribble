package testNG_Topics;

import org.testng.annotations.DataProvider; 
import org.testng.annotations.Test;

public class dataProviderTestCase {
	@DataProvider(name = "nameDP")
	public Object[][] dpMethod() {
		return new Object[][] {{"Shafkat", "Ali", 24}, {"Milad", "abc ", 45}, {"Abdullah", " abc",  61}, {"Syed", " abc", 16}};
	}
	
	@Test(dataProvider = "abcDP", dataProviderClass = dataProviderClass.class)
	public void myTest(String name, int age) {
		System.out.println("My name is: " + name);
		System.out.println("My age is: " + age);
	}
	
	@Test(dataProvider = "nameDP")
	public void myTest(String name, String lastName, int age) {
		System.out.println("My name is: " + name);
		System.out.println("My last name is: " + lastName);
		System.out.println("My age is: " + age);
	}
}
