package practiceTestCases_51;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Driver;
import utilities.commonMethods;

public class TestCase33 {
	@Test
	public void clickOnShop() {
		Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-40']/a")).click();
		commonMethods.wait(3);
	}
	
	@Test
	public void clickOnProduct() {
		commonMethods.wait(3);
		Driver.getDriver().findElement(By.xpath("//*[@class='cat-item cat-item-21']")).click();
	}
}
