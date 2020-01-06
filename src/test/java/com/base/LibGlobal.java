package com.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LibGlobal {
	public static WebDriver driver;
	public static  Select s;
    String value = null;
	Actions a;
	Alert a2;
	File loc;

	// to launch a browser
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHABEER AHMED\\eclipse-workspace\\CucumberDemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	// to sendkeys
	public String fill(WebElement e, String s) {
		e.sendKeys(s);
		return s;
	}
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}
	// to click
	public void click(WebElement e) {
		e.click();
	}


	// to right click
	public void rightClick(WebElement e) {
		a = new Actions(driver);
		a.contextClick(e).perform();
	}

	// to double click
	public void doubleClick(WebElement e) {
		a = new Actions(driver);
		a.doubleClick(e).perform();
		;
	}

	// to move to element
	public void movetoElement(WebElement e) {
		a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	// to drag and drop
	public void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	// to accept the alert
	public void accept() {
		a2 = driver.switchTo().alert();
		a2.accept();
	}

	// to dismiss the alert
	public void dismiss() {
		a2 = driver.switchTo().alert();
		a2.dismiss();
	}

	// to sendkeys and accept prompt
	public void prompt(String input) {
		a2 = driver.switchTo().alert();
		a2.sendKeys(input);
		a2.accept();
	}

	// to drop down by index
	public void dropDownByIndex(WebElement e, int num) {
		s = new Select(e);
		s.selectByIndex(num);
	}

	// to drop down by value
	public void dropDownByValue(WebElement e, String sum) {
		s = new Select(e);
		s.selectByValue(sum);
	}

	// to drop down by text
	public void dropDownBytext(WebElement e, String sum) {
		s = new Select(e);
		s.selectByVisibleText(sum);

	}

	// to get attribute
	public void attribute(WebElement e) {
		String text = e.getAttribute("value");
		System.out.println(text);
	}

	// to get text
	public void getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
	}

	// to get current url
	public void currentUrl(WebDriver driver) {
		String url = driver.getCurrentUrl();
		System.out.println(url);
      }
	public void printAttribute(WebElement e) {
		String text = e.getAttribute("value");
		System.out.println(text);
		}

	// to get screenshot
	public void screenShot(String name) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc = new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\screenshot\\" + name);
		FileUtils.copyFile(src, desc);
	}
	public void assertForEquals(String exp) {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,exp); 
		}
	
	public void assertForSendKeys(String keys,List<WebElement> e) {
		Assert.assertEquals(keys, getAttribute(e.get(0)));
		

	}

	public void windowHandel(WebDriver driver) {
		String par = driver.getWindowHandle();
		System.out.println(par);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for (String child2 : child) {
			if (!par.equals(child2)) {
				driver.switchTo().window(child2);
			}
		}
	}

}
