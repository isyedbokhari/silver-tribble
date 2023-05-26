package seleniumDay02;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumLoginTask {

	WebDriver driver;
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void loginUsingValidData() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("isyedbokhari@gmail.com");
		driver.findElement(By.id("password")).sendKeys("techcircle123!");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void closeBrowser() {
		driver.close();
	}
}
