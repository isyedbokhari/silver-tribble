package UPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.commonMethods;

public class frameworkTests {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		commonMethods.sendKeys(driver.findElement(By.id("inputBox")), "username");
		commonMethods.wait(3);
		String radioXpath = "//div[@style='margin-left:20px;']/input";
		commonMethods.clickRadioOrCheckbox(driver.findElements(By.xpath(radioXpath)), "Option 2");
	}
}
