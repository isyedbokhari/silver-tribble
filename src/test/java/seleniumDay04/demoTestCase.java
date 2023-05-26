package seleniumDay04;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoTestCase {
	WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1) Open the browser
        // 2) Enter the URL “http://practice.automationtesting.in/”
        driver.get("https://practice.automationtesting.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void homePageWithThreeSlidersOnly() {

        /*
         *
         * 
         * 
         * 5) Test whether the Home page has Three Sliders only 6) The Home page must
         * contains only three sliders
         * 
         */

        // 3) Click on Shop Menu
        driver.findElement(By.id("menu-item-40")).click();

        // 4) Now click on Home menu button
        driver.findElement(By.xpath("//a[text() ='Home']")).click();

//        5) Test whether the Home page has Three Sliders only
//        6) The Home page must contains only three sliders
//     

        // COMING BACK TO LAST STEPS after learning List Webelements

    }
    
    
    @Test
    public void HomePageWithThreeArrivalsOnly() {
            // code here
    }
}
