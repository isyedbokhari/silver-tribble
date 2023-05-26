package testNG_Topics;

import org.testng.annotations.Test;

public class dependencyTestUsingAnnotation {
	@Test(dependsOnMethods = {"login1" , "login2" , "hellooooo"})
	public void dashboardCheck() {
		
		System.out.println("Dashboard is displayed and "
				+ "there are some assertions here");
	}
	
	@Test
	public void login1() {
		
		System.out.println("This is login1");
		
	}
	@Test
	public void login2() {
		
		System.out.println("This is login2");
		
	}
	@Test
	public void hellooooo() {
		
		System.out.println("This is hellooooo");
		
	}
	
}
