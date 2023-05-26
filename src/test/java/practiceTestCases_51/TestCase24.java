package practiceTestCases_51;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Driver;

public class TestCase24 {
	public void openBrowser() {
		Driver.getDriver();
	}
	@Test
	public void myAccountLoginMaskedPasswordTest() {
		Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-50']/a")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("techcircle123!");
		System.out.println("The password is masked!");
	}
}
