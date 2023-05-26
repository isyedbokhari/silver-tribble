package testNG_Topics;

import org.testng.annotations.DataProvider;

public class dataProviderClass {

	@DataProvider(name = "abcDP")
	public Object[][] abcMethod() {
		return new Object[][] {{"Shafkat", 24}, {"Milad", 45}, {"Abdullah", 61}, {"Syed Bokhari", 16}};
	}
	
}
