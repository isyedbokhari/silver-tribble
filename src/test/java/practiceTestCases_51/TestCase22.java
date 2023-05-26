package practiceTestCases_51;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Driver;

public class TestCase22 {
	public void openBrowser() {
		Driver.getDriver();
	}
	@Test
	public void myAccountLoginWithEmptyUserNaeAndCorrectPassword() {
		Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-50']/a")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id='username']")).sendKeys("");
		Driver.getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("techcircle123!");
		Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-Button button']")).click();
	}
}
