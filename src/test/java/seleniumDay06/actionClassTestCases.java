package seleniumDay06;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassTestCases {
	WebDriver driver;

	@Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	@Test
	public void hoverOverAButon() {
		WebElement acctListButton = driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(acctListButton).build().perform();
	}
}
