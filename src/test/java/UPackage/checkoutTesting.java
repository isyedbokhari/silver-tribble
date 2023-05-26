package UPackage;

import org.testng.annotations.Test;

import pages.dashboardPage;
import utilities.Driver;

public class checkoutTesting extends Driver{
	
	dashboardPage dp = new dashboardPage();
	@Test
	public void checkout() {
		dp.dashboardText.getAttribute("");
		
	}
	
	
	
	
	
	
}
