package practiceTestCases_51;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.commonMethods;

public class TestCase32 {
	
	
	@Test
	public void moveTheSlider() {
		Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-40']/a")).click();
		commonMethods.wait(3);
		WebElement slider = Driver.getDriver().findElement(By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div/span[2]"));
			for (int i = 1; i <=50; i++) {
				slider.sendKeys(Keys.LEFT);
			}
	}
}
