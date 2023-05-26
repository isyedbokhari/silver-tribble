package practiceTestCases_51;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Driver;

public class TestCase29 {
	public void openBrowser() {
		Driver.getDriver();
	}
	@Test
	public void accountRegistrationUsingEmptyEmail() {
		Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-50']/a")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id='reg_email']")).sendKeys("");
		Driver.getDriver().findElement(By.xpath("//*[@id='reg_password']")).sendKeys("techcircle123!");
		Driver.getDriver().findElement(By.xpath("//*[@name='register']")).click();
	}
}
