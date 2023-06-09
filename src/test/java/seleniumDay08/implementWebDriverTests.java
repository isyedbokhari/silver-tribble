package seleniumDay08;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import utilities.Driver;

public class implementWebDriverTests {

	@Before
	public void setUp() {
		Driver.getDriver();
	}
	@After
	public void closeBroswer() {
		Driver.tearDown();
	}
	@Test
	public void verifyLoginForm() {
		Driver.getDriver().findElement(By.name("username")).isDisplayed();
		Driver.getDriver().findElement(By.name("password")).isDisplayed();
		Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).isDisplayed();

		// username webelement that has a tag div where class is equal to message error

		// div[@class='message error']
	}

	@Test
	public void verifyValidLogin() {
		/*
		 * valid Username : Admin valid Password : admin123
		 */
	}

	@Test
	public void verifyinvalidErrorMessage() {
		/*
		 * inValid Username : helloWorld Password : admin123 errorMessage:
		 * "Please enter a valid username"
		 */

	}

	@Test
	public void verifyInvalidEmailFormatValidationMessage() {
		/*
		 * Valid Username : helloWorl.com Password : admin123 validationMessage:
		 * "Please enter a valid email"
		 */
	}

	@Test
	public void verifyEmptyUsernameValidationMessageVerifyEmptyPasswordValidationMessage() {
		/*
		 * Valid Username : helloWorl.com Password : admin123 validationMessage for
		 * username: "Please enter a username" validationMessage for password:
		 * "Please enter a password"
		 * 
		 */
	}
}
