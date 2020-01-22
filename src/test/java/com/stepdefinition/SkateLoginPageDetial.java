package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SkateLoginPageDetial extends LibGlobal {
	@Given("User is in skateclothing login page")
	public void user_is_in_skateclothing_login_page() {

	}

	@When("user logged in using {string}and {string}")
	public void user_logged_in_using_and(String user, String pass) {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement txtregister = driver.findElement(By.xpath("//a[@title='LOGIN']"));
		txtregister.click();
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys(user);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassword.sendKeys(pass);
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='sign']"));
		btnLogin.click();

	}

	@When("user searching {string} in the search bar")
	public void user_searching_in_the_search_bar(String product) {
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='search_keywords']"));
		txtSearch.sendKeys(product);
		//Assert.assertEquals("shirts", txtSearch.getAttribute("value"));

	}

	@When("clicked search button.")
	public void clicked_search_button() {
		WebElement btnSearch = driver.findElement(By.xpath("//div[@id='context_search_searchbutton']"));
		btnSearch.click();

	}

	@When("user printed all product in the consoul.")
	public void user_printed_all_product_in_the_consoul() {
		List<WebElement> txtproduct = driver.findElements(By.xpath("//div[@class='prod_name']"));
		for (int i = 0; i < txtproduct.size(); i++) {
			WebElement txtwebElement = txtproduct.get(i);
			String text = txtwebElement.getText();
			System.out.println("product printing");
			System.out.println(text);

		}
	}

	@Then("user closing the browser.")
	public void user_closing_the_browser() {

	}

}
