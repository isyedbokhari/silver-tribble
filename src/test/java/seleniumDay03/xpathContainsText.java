package seleniumDay03;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathContainsText {
	WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void dynamicXPath() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        
        // exact text match XPath
        driver.findElement(By.xpath("//*[text()=' Login ']")).click();
        
        // getting all the items from the menu
        List <WebElement> listOfElements = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[contains(text(), '')]"));
        for (WebElement eachElement : listOfElements) {
        	System.out.println(eachElement.getText());
        }

        //clicking on Directory menu
        driver.findElement(By.xpath("//li[9]/a/span[contains(text(), '')]")).click();
        
        
        //click open JobTitle dropdown
        driver.findElement(By.xpath("//div[@class='oxd-grid-3']/div[2]")).click();


        
        //contains text XPath
        
        WebElement JobTitle = driver.findElement(By.xpath("//*[@class='oxd-select-dropdown --positon-bottom']/div/span[contains(text(), 'Success')]"));
        
        String textOfJobTitle  = JobTitle.getText();
        
        System.out.println(textOfJobTitle);
        
        JobTitle.click();
        
            
    }
	
	
}