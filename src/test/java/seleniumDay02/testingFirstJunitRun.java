package seleniumDay02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testingFirstJunitRun {
	WebDriver driver;
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techcircleschool.com");
	}
	@Test
	public void test1() {
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
	}
	@Test
	public void test2() {
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.google.com/");
	}
	
//	@Test
//	public void test3() {
//		System.out.println(driver.getPageSource());
//	}
	@After
	public void afterMethod() {
		//closes the current browser
		driver.close();
		//closes all the browser windows 
		//currently open with selenium
		driver.quit();
	}
	
}
