package seleniumDay05;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.commonMethods;

public class alertTestCases extends commonMethods{
	WebDriver driver;

	@BeforeMethod
    public void openBrowser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.getDriver();
		Driver.getDriver().navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
    }
    
    
    @org.testng.annotations.Test
    public void handleAlertBoxes() {
        
    //first alert
//        driver.findElement(By.id("alertBox")).click();
//        String fistAlertBox = driver.switchTo().alert().getText();
//        System.out.println(fistAlertBox);
//        driver.switchTo().alert().accept();
        ap.alertBoxButton.click();
        acceptAlert();
        
    //second alert    
//        driver.findElement(By.id("confirmBox")).click();
//        String secondAlertBox = driver.switchTo().alert().getText();
//        System.out.println(secondAlertBox);
//        driver.switchTo().alert().accept();
        ap.confirmBoxButton.click();
        acceptAlert();
        
        
    //third alert
        String textTobeSent = ConfigurationReader.getProperty("myName");
        //driver.findElement(By.id("promptBox")).click();
        ap.promptBoxButton.click();
        String thirdAlertBox = getAlertText();
        System.out.println(thirdAlertBox);
        Driver.getDriver().switchTo().alert().sendKeys(textTobeSent);
        acceptAlert();
        String wholeOutputText = ap.promptOutput.getText();
        Assert.assertTrue(wholeOutputText.contains(textTobeSent));
        
    }
}
