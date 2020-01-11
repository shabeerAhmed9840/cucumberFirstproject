package com.stepdefinition;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.base.LibGlobal;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClassForSkate extends LibGlobal {

	@Before
	public void beforeScenario() {
		launch("https://www.sk8clothing.com/");
	}

	@After
	public void afterScenario(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			byte[] failedTest = screenShot.getScreenshotAs(OutputType.BYTES);
			sc.embed(failedTest, "failed/png");

		}
		driver.quit();

	}

}
