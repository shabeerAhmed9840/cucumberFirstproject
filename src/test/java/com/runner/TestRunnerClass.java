package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Login.feature" ,glue= {"com.stepdefinition"},dryRun=false,plugin={"html:C:\\Users\\SHABEER AHMED\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Reporting\\AdactinReport\\Adacfalse.html"})
public class TestRunnerClass {

}
