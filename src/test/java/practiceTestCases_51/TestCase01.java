package practiceTestCases_51;


import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import utilities.Driver;

public class TestCase01 {
	@BeforeMethod(alwaysRun = true)
	public void openBrowser() {
		Driver.getDriver();
	}
	@Test
	public void clickShop() throws InterruptedException {
		Driver.getDriver().findElement(By.id("menu-item-40")).click();
		Thread.sleep(2000);
	}
	@Test 
	public void clickHome() throws InterruptedException {
		Driver.getDriver().findElement(By.id("menu-item-40")).click();
		Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-breadcrumb']//a")).click();
		Thread.sleep(2000);
	}
	@Test
	public void sliderCount() throws InterruptedException {
		List <WebElement> sliders = Driver.getDriver().findElements(By.xpath("//*[@class='n2-ss-slider-3']/div"));
		Assert.assertEquals(sliders.size(), 3);
		Thread.sleep(2000);
	}
	
	
}
