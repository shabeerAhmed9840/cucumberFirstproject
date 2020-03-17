package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.base.LibGlobal;
import com.manage.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends LibGlobal {

	PageObjectManager page;

	@Given("User is in adactin page.")
	public void user_is_in_adactin_page() {

		// loadUrl("https://www.adactin.com/HotelApp/");

	}

	@When("User enters {string} and {string}.")
	public void user_enters_and(String username, String password) {
		page = new PageObjectManager();

		fill(page.getLoginPagePojo().getUser().get(0), username);
		assertForSendKeys(username, page.getLoginPagePojo().getUser());
		fill(page.getLoginPagePojo().getPass().get(0), password);
		assertForSendKeys(password, page.getLoginPagePojo().getPass());

	}

	@Then("useer is clicked login button.")
	public void useer_is_clicked_login_button() {
		click(page.getLoginPagePojo().getLogin().get(0));
	}

	@When("user is selecting the location {string}")
	public void user_is_selecting_the_location(String location) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertForEquals("https://www.adactin.com/HotelApp/SearchHotel.php");
		dropDownBytext(page.getSearchHotelpojo().getLocation().get(0), location);
		assertForSendKeys(location, page.getSearchHotelpojo().getLocation());
	}

	@When("user is selecting the hotel{string}")
	public void user_is_selecting_the_hotel(String hotel) {
		dropDownBytext(page.getSearchHotelpojo().getHotel().get(0), hotel);
		assertForSendKeys(hotel, page.getSearchHotelpojo().getHotel());
	}

	@When("user is selcting roomtype{string}.")
	public void user_is_selcting_roomtype(String roomtype) {
		dropDownBytext(page.getSearchHotelpojo().getRoomType().get(0), roomtype);
		assertForSendKeys(roomtype, page.getSearchHotelpojo().getRoomType());

	}

	@When("user is selecting number of rooms {int}") 
	public void user_is_selecting_number_of_rooms(Integer noOfRoom) {
		dropDownByIndex(page.getSearchHotelpojo().getNumberOfRoom().get(0), noOfRoom);
		assertForSendKeysForInteger(noOfRoom, page.getSearchHotelpojo().getNumberOfRoom());
	}

	@When("user is selecting number room for adults {int}")
	public void user_is_selecting_number_room_for_adults(Integer noOfAdults) {
		dropDownByIndex(page.getSearchHotelpojo().getAdultPerRoom().get(0), noOfAdults);
		assertForSendKeysForInteger(noOfAdults, page.getSearchHotelpojo().getAdultPerRoom());

	}

	@When("user is selecting number of room for children {int}.")
	public void user_is_selecting_number_of_room_for_children(Integer noOfChildren) {
		dropDownByIndex(page.getSearchHotelpojo().getChildrenPerRoom().get(0), noOfChildren);
		assertForSendKeysForInteger(noOfChildren, page.getSearchHotelpojo().getChildrenPerRoom());
	}

	@Then("user clicking search button")
	public void user_clicking_search_button() {
		click(page.getSearchHotelpojo().getBtnSearch().get(0));

	}

	@When("user clicking confirm button.")
	public void user_clicking_confirm_button() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertForEquals("https://www.adactin.com/HotelApp/SelectHotel.php");
		click(page.getSelectHotelPojo().getBtnRadio().get(0));
	}

	@Then("user is clicking continue button.")
	public void user_is_clicking_continue_button() {
		click(page.getSelectHotelPojo().getBtnContinue().get(0));
	}

	@When("user is enter his {string} and {string}")
	public void user_is_enter_his_and(String firstname, String Lastname) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertForEquals("https://www.adactin.com/HotelApp/BookHotel.php");
		fill(page.getBookHotelPojo().getLstFirstName().get(0), firstname);
		assertForSendKeys(firstname, page.getBookHotelPojo().getLstFirstName());
		fill(page.getBookHotelPojo().getLstLastName().get(0), Lastname);
		assertForSendKeys(Lastname, page.getBookHotelPojo().getLstLastName());
	}

	@When("user is enter his {string}.")
	public void user_is_enter_his(String address) {
		fill(page.getBookHotelPojo().getLstAddress().get(0), address);
		assertForSendKeys(address, page.getBookHotelPojo().getLstAddress());

	}

	@When("user is enter the {string}.")
	public void user_is_enter_the(String cardno) {
		fill(page.getBookHotelPojo().getLstCreditCardNumber().get(0), cardno);
		assertForSendKeys(cardno, page.getBookHotelPojo().getLstCreditCardNumber());
	}

	@When("user is select his card type{string}")
	public void user_is_select_his_card_type(String cardtype) {
		dropDownBytext(page.getBookHotelPojo().getLstCardType().get(0), cardtype);
		assertForSendKeys(cardtype, page.getBookHotelPojo().getLstCardType());

	}

	@When("user is select month {string}and year {string}of his card.")
	public void user_is_select_month_and_year_of_his_card(String month, String year) {
		dropDownBytext(page.getBookHotelPojo().getLstMonth().get(0), month);
		// assertForSendKeys(month, page.getBookHotelPojo().getLstMonth());
		dropDownBytext(page.getBookHotelPojo().getLstYear().get(0), year);
		// assertForSendKeys(year, page.getBookHotelPojo().getLstYear());

	}

	@When("user is enter {string}")
	public void user_is_enter(String ccv) {
		fill(page.getBookHotelPojo().getLstCvv().get(0), ccv);
		// assertForSendKeys(ccv, page.getBookHotelPojo().getLstCvv());

	}

	@Then("user is click book now button.")
	public void user_is_click_book_now_button() {
		click(page.getBookHotelPojo().getBtnBookNow().get(0));
	}

	@When("user is waiting for his order number is get generate")
	public void user_is_waiting_for_his_order_number_is_get_generate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user is printing his order ID.")
	public void user_is_printing_his_order_ID() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertForEquals("https://www.adactin.com/HotelApp/BookHotel.php");
		printAttribute(page.getBookingConfirmPojo().getLstOrderNumber().get(0));
	}

	@Then("user is clicking logout.")
	public void user_is_clicking_logout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertForEquals("https://www.adactin.com/HotelApp/BookingConfirm.php");
		click(page.getBookingConfirmPojo().getBtnLogOut().get(0));
		driver.quit();
		System.out.println("cool");
		System.out.println("closed");

	}

}
