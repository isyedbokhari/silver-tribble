package UPackage;


import org.testng.Assert; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.commonMethods;

public class pageTesting extends commonMethods{

	
	@BeforeMethod
	public void openBrowser() {
		Driver.getDriver();
	}
	@Test
	public void loginWithValidUsernameValidPassword() {
		lp.usernameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_username"));
//		driver.findElement(By.name("username")).sendKeys("Admin");
		lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_password"));
//		driver.findElement(By.name("password")).sendKeys("admin123");
		lp.loginButton.click();
//		driver.findElement(By.xpath("//*[text() = ' Login ']")).click();
		
		// verifying that you are logged in
		Assert.assertTrue(dp.dashboardText.isDisplayed());
	}
	@Test
	public void loginWithValidUsernameInValidPassword() {
		lp.usernameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_invalidUsername"));
//		driver.findElement(By.name("username")).sendKeys("Admin");
		lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_invalidPassword"));
//		driver.findElement(By.name("password")).sendKeys("admin123");
		lp.loginButton.click();
		// verify the error code
	}
}
