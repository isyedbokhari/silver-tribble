package seleniumDay05;

import java.util.concurrent.TimeUnit; 

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Driver;
import utilities.commonMethods;

public class DropDownTestCase {
//	WebDriver driver;

	@org.testng.annotations.Test
	public void openBrowser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        // 1) Open the browser
//        // 2) Enter the URL “http://practice.automationtesting.in/”
//        driver.get("https://the-internet.herokuapp.com/dropdown");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Driver.getDriver();
    }
    @org.testng.annotations.Test
    public void statiDropdown() throws InterruptedException {
//    	Select s = new Select(driver.findElement(By.id("dropdown")));
//    	Thread.sleep(2000);
//    	s.selectByIndex(0);
//    	Thread.sleep(2000);
//    	s.selectByValue("2");
//    	Thread.sleep(2000);
//    	s.selectByVisibleText("Option 1");
    	
    	commonMethods.wait(2);
    	commonMethods.selectDropDownIndex(Driver.getDriver().findElement(By.id("dropdown")), 1);
    	commonMethods.wait(2);
    	commonMethods.selectDropDownVisibleText(Driver.getDriver().findElement(By.id("dropdown")), "Option 2");
    	commonMethods.wait(2);
    	
    }
}
