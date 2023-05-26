package practiceTestCases_51;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Driver;

public class TestCase26 {
	public void openBrowser() {
		Driver.getDriver();
	}
	@Test
	public void loginAuthenticityCheck() {
		Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-50']/a")).click();
		Driver.getDriver().findElement(By.xpath("//*[@id='username']")).sendKeys("isyedbokhari@gmail.com");
		Driver.getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("techcircle123!");
		Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-Button button']")).click();
		Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-MyAccount-content']/p/a")).click();
		Driver.getDriver().navigate().back();
	}
}
