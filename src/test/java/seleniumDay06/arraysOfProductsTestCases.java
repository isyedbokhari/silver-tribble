package seleniumDay06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class arraysOfProductsTestCases {
	WebDriver driver;

	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test

	public void printOutListOfMenus() throws InterruptedException {
		selectInterTab("Resizable");
		Thread.sleep(3000);
		selectInterTab("Draggable");
	}

	public void selectInterTab(String tabName) {
		List<WebElement> interactionsTab = driver.findElements(By.xpath("//*[@class=\"widget\"]/ul/li"));

		for (WebElement eachTab : interactionsTab) {
			if (eachTab.getText().contains(tabName)) {
				eachTab.click();
				break;
			}
		}
	}

}
