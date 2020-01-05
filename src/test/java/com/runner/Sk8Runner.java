package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\New.feature",glue= {"com.stepdefinition"},plugin= {"usage","json:C:\\Users\\SHABEER AHMED\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Reporting\\hellow.json"})
public class Sk8Runner {

}
