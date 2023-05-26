package seleniumDay01;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class openSesameBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/syed/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		//WebDriver driver3 = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techcircleschool.com");
	}

}
