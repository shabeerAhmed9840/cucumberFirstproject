package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature"},
                 glue= {"com.stepdefinition"},
               plugin= {"json:src\\test\\resources\\UltimateReport\\ultimate.json"})

public class UltimateRunner extends JvmReport{
	@AfterClass
	public static void afterClass() {
		generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\UltimateReport\\ultimate.json");

	}
	

}
