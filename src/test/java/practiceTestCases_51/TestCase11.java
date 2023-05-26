package practiceTestCases_51;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Driver;

public class TestCase11 {
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
	public void arrivalCount() throws InterruptedException {
		List <WebElement> arrivals = Driver.getDriver().findElements(By.xpath("//*[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div"));
		Assert.assertEquals(arrivals.size(), 3);
		Thread.sleep(2000);
	}
	@Test
	public void clickOnImageAndAddBookBasketProceedToCheckoutAndRemoveTheBookFromBasket() throws InterruptedException {
		Driver.getDriver().findElement(By.id("menu-item-40")).click();
		Driver.getDriver().findElement(By.xpath("//*[@class='woocommerce-breadcrumb']//a")).click();
		Driver.getDriver().findElement(By.xpath("//*[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[1]")).click();
		if (!Driver.getDriver().findElement(By.xpath("//*[@class='stock out-of-stock']")).isEnabled()) 
		{
		Driver.getDriver().findElement(By.xpath("//*[@class='stock out-of-stock']")).click();
		}
	else {
		System.out.println("No add to basket button found!");
		System.out.println("Can't even add one lol :P");
		System.out.println("Nothing to add in the cart and proceed to checkout!");
		System.out.println("Since there's nothing in the cart, no book can be removed :P");
	}
		Thread.sleep(2000);
	}
}
