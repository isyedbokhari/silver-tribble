package seleniumDay04;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxesAndRadioButtons {
	WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    
    @Test
    public void checkboxes() {
        
        WebElement checkbox1 = 
                driver.findElement(By.xpath("//*[@id = 'checkboxes']/input[1]"));

        Boolean wasItSelected = checkbox1.isSelected();
        
        if(wasItSelected) {
            System.out.println("it is selected");
        }else{
            checkbox1.click();
        }
    
    
    }
    
    
}
