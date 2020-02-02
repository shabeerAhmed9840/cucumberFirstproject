package com.stepdefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.base.LibGlobal;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClassForSkate extends LibGlobal {

	@Before(value="~@smoke", order=1)
	public void beforeScenario() {
		launch("https://www.sk8clothing.com/");
	}
	
	@Before(value="@smoke",order=2)
	public void beforeForAdactin() {
		launch("https://www.adactin.com/HotelApp/");

	}

	@After(order = 2)
	public void afterScenario(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			byte[] failedTest = screenShot.getScreenshotAs(OutputType.BYTES);
			sc.embed(failedTest, "failed/png");

		}
	}
	@After(order =1)
	public void quit() {
		driver.quit();
	}

}
