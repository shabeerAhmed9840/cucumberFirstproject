package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\New.feature",
                  glue= {"com.stepdefinition"},
                  dryRun=false,
                  tags= {"@fun","not @Reg"},
                  plugin= {"pretty","json:C:\\Users\\SHABEER AHMED\\"
                  		+ "eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Reporting\\ironman.json"})
public class Sk8Runner {
	
	@AfterClass
	public static void afterClass() {
     JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\ironman.json");
	}

}
