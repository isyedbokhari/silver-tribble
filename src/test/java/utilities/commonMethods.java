package utilities;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonMethods extends pageInitializer{

	/*
	 * this method is for sending text to the element we have created
	 * 
	 * @param: WebElement element = it is accepting the web element where we are
	 * sending the text String: its the text we are sending
	 */

	public static void sendKeys(String text, WebElement element) {
		element.clear();
		element.sendKeys(text);
	}

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckBox, String value) {
		String actualValue;
		for (WebElement eachElement : radioOrCheckBox) {
			actualValue = eachElement.getAttribute("value").trim();
			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;
			}
		}
	}

	public static void selectDropDownVisibleText(WebElement element, String textToSelect) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	public static void selectDropDownIndex(WebElement element, int indexValue) {
		try {
			Select select = new Select(element);
			int size = select.getOptions().size();
			if (size > indexValue) {
				select.selectByIndex(indexValue);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	public static void dismissAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static void acceptAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static String getAlertText() {
		String alertString = null;
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alertString = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alertString;
	}

	public static void switchToIframeByIndex(int iFrameIndex) {
		try {
		Driver.getDriver().switchTo().frame(iFrameIndex);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
		
	}

	public static void switchToIframeByElement(WebElement iFrameElement) {
		try {
			Driver.getDriver().switchTo().frame(iFrameElement);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	public static void switchToIframeByName(String iframeName) {
		try {
			Driver.getDriver().switchTo().frame(iframeName);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	public static void switchToChildWindow(String parentWindowHandle) {
        try {
            // Get all window handles
            Set<String> windowHandles = Driver.getDriver().getWindowHandles();

            // Switch to the child window
            for (String handle : windowHandles) {
                if (!handle.equals(parentWindowHandle)) {
                    Driver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while switching to child window: " + e.getMessage());
            e.printStackTrace();
        }
    }
	
	public static WebDriverWait getWaitObject() {
	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
		return wait;
	}
	
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void click(WebElement element) {
		waitForVisibility(element).click();
	}
	
	public static void sendKeys(WebElement element, String keys) {
		waitForVisibility(element).sendKeys(keys);
	}
	
	public void hoverOver(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(element).build().perform();
	}
	
	public void dragAndDrop( WebElement fromElement, WebElement toElement) {
		Actions action = new Actions(Driver.getDriver());
		action.dragAndDrop(fromElement, toElement).build().perform();
	}
	
	public void doubleClick(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.doubleClick(element).build().perform();
	}
}
