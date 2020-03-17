package com.base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.manage.PageObjectManager;

public class LibGlobal {
	public static WebDriver driver;
	public static final String USERNAME = "shabeerahmed3";
	public static final String AUTOMATE_KEY = "iYDNPyVeqaKtxzduhepp";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static Select s;
	PageObjectManager page;
	String value = null;
	Actions a;
	Alert a2;
	File loc;

	// to launch a browser

	public WebDriver launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHABEER AHMED\\eclipse-workspace\\CucumberDemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	/*
	 * public void excuteCloud() {
	 * 
	 * DesiredCapabilities caps = new DesiredCapabilities();
	 * caps.setCapability("browser", "Chrome");
	 * caps.setCapability("browser_version", "79.0"); caps.setCapability("os",
	 * "Windows"); caps.setCapability("os_version", "10");
	 * caps.setCapability("resolution", "1024x768"); caps.setCapability("name",
	 * "Bstack-[Java] Sample Test");
	 * 
	 * try { driver = new RemoteWebDriver(new URL(URL), caps); } catch
	 * (MalformedURLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	public void loadUrl(String sum) {
		driver.get(sum);
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

	public void firstSelectedOption(WebElement e) {
		s = new Select(e);
		s.getFirstSelectedOption();

	}

	// to get attribute
	public void attribute(WebElement e) {
		String text = e.getAttribute("value");
		System.out.println(text);
	}

	// to get text
	public static String getText(WebElement e) {
		return e.getText();

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
		Assert.assertEquals(currentUrl, exp);
	}

	public void assertForSendKeys(String keys, List<WebElement> e) {
		Assert.assertEquals(keys, getAttribute(e.get(0)));

	}

	public void assertForSendKeysForInteger(int keys, List<WebElement> e) {
		String a = getAttribute(e.get(0));
		int i = Integer.parseInt(a);
		Assert.assertEquals(keys, i);

	}

	public void isSelected(WebElement e) {
		boolean s = e.isSelected();

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
