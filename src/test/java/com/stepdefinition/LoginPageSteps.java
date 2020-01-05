package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	WebDriver driver;
	Select s;
	@Given("User is in adactin page.")
	public void user_is_in_adactin_page() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\CucumberDemo\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.adactin.com/HotelApp/index.php");
	}

	@When("User enters {string} and {string}.")
	public void user_enters_and(String email, String pass) {
		WebElement txtEmail = driver.findElement(By.xpath("//input[@name='username']"));
        txtEmail.sendKeys(email);
        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys(pass);
	}

	@Then("useer is clicked login button.")
	public void useer_is_clicked_login_button() {
		WebElement txtLogin = driver.findElement(By.xpath("//input[@name='login']"));
		txtLogin.click();
		WebElement txtlocation = driver.findElement(By.xpath("//select[@name='location']"));
    	s=new Select(txtlocation);
    	s.selectByValue("Sydney");
		}
    @When("user is selecting the location.")
	public void user_is_selecting_the_location() {
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	
    	}

	@When("user is selecting the hotel.")
	public void user_is_selecting_the_hotel() {
      WebElement txthotel = driver.findElement(By.xpath("//select[@name='hotels']"));
  	s=new Select(txthotel);
  	s.selectByVisibleText("Hotel Creek");

	}

	@When("user is selcting roomtype.")
	public void user_is_selcting_roomtype() {
		  WebElement txtroomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		  	s=new Select(txtroomtype);
		  	s.selectByValue("Double");


	}

	@When("user is selecting number of rooms")
	public void user_is_selecting_number_of_rooms() {
		  WebElement txtnoRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		  	s=new Select(txtnoRoom);
		  	s.selectByValue("1");


	}

	@When("user is selecting number room for adults.")
	public void user_is_selecting_number_room_for_adults() {
		  WebElement txtAdultRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		  	s=new Select(txtAdultRoom);
		  	s.selectByValue("2");


	}

	@When("user is selecting number of room for children.")
	public void user_is_selecting_number_of_room_for_children() {
		  WebElement txtroomChildren = driver.findElement(By.xpath("//select[@name='child_room']"));
		  	s=new Select(txtroomChildren);
		  	s.selectByValue("2");


	}

	@Then("user clicking search button")
	public void user_clicking_search_button() {
		  WebElement txtsearch = driver.findElement(By.xpath("//input[@name='Submit']"));
		  txtsearch.click();

	}

	@When("user clicking confirm button.")
	public void user_clicking_confirm_button() {
		  WebElement txtradiobtn = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		  txtradiobtn.click();
		


	}

	@Then("user is clicking continue button.")
	public void user_is_clicking_continue_button() {
		  WebElement txtconti = driver.findElement(By.xpath("//input[@name='continue']"));
		  txtconti.click();
	}
	@When("user is enter his {string} and {string}")
	public void user_is_enter_his_and(String first, String last) {
		  WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		  firstname.sendKeys(first);
		  WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		  lastname.sendKeys(last);
		  }

	@When("user is enter his {string}.")
	public void user_is_enter_his(String address) {
		  WebElement txtaddress = driver.findElement(By.xpath("//textarea[@name='address']"));
		  txtaddress.sendKeys(address);


	}
	@When("user is enter the {string}.")
	public void user_is_enter_the(String cardnum) {
		  WebElement txtcardNum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		  txtcardNum.sendKeys(cardnum);
		
	}
	@When("user is select his card type.")
	public void user_is_select_his_card_type() {
		  WebElement txtcardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		  	s=new Select(txtcardtype);
		  	s.selectByValue("AMEX");



	}

	@When("user is select month and year of his card.")
	public void user_is_select_month_and_year_of_his_card() {
		  WebElement txtcardMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		  	s=new Select(txtcardMonth);
		  	s.selectByValue("1");
			  WebElement txtcardYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));

		  	s=new Select(txtcardYear);
		  	s.selectByValue("2020");



	}

	@When("user is enter {string}")
	public void user_is_enter(String ccv) {
		  WebElement txtCCV = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		  txtCCV.sendKeys("123");


	}

	@Then("user is click book now button.")
	public void user_is_click_book_now_button() {
		  WebElement txtbtnsub = driver.findElement(By.xpath("//input[@name='book_now']"));
		  txtbtnsub.click();


	}

	@When("user is waiting for his order number is get generate")
	public void user_is_waiting_for_his_order_number_is_get_generate() throws InterruptedException {
		  Thread.sleep(7000);


	}

	@When("user is printing his order ID.")
	public void user_is_printing_his_order_ID() {
		  WebElement txtorder = driver.findElement(By.xpath("//input[@name='order_no']"));
		  String text = txtorder.getAttribute("value");
		  System.out.println(text);

	}

	@Then("user is clicking logout.")
	public void user_is_clicking_logout() {
driver.quit();

	}

	

}
