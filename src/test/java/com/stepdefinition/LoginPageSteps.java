package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.base.LibGlobal;
import com.screen.BookHotelPojo;
import com.screen.BookingConfirmPojo;
import com.screen.LoginPagePojo;
import com.screen.SearchHotelpojo;
import com.screen.SelectHotelPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends LibGlobal {
	LoginPagePojo login;
	SearchHotelpojo search;
	SelectHotelPojo select;
	BookHotelPojo book;
	BookingConfirmPojo confirm;

	@Given("User is in adactin page.")
	public void user_is_in_adactin_page() {
		launch("https://www.adactin.com/HotelApp/");
	}

	@When("User enters {string} and {string}.")
	public void user_enters_and(String username, String password) {
		login = new LoginPagePojo();
		fill(login.getUser().get(0), username);
		assertForSendKeys(username, login.getUser());
		fill(login.getPass().get(0), password);
		assertForSendKeys(password, login.getPass());

	}

	@Then("useer is clicked login button.")
	public void useer_is_clicked_login_button() {
		login = new LoginPagePojo();
		click(login.getLogin().get(0));
	}

	@When("user is selecting the location {string}")
	public void user_is_selecting_the_location(String location) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertForEquals("https://www.adactin.com/HotelApp/SearchHotel.php");
		search = new SearchHotelpojo();
		dropDownBytext(search.getLocation().get(0), location);
		assertForSendKeys(location, search.getLocation());
	}

	@When("user is selecting the hotel{string}")
	public void user_is_selecting_the_hotel(String hotel) {
		search = new SearchHotelpojo();
		dropDownBytext(search.getHotel().get(0), hotel);
		assertForSendKeys(hotel, search.getHotel());
	}

	@When("user is selcting roomtype{string}.")
	public void user_is_selcting_roomtype(String roomtype) {
		search = new SearchHotelpojo();
		dropDownBytext(search.getRoomType().get(0), roomtype);
		assertForSendKeys(roomtype, search.getRoomType());

	}

	@When("user is selecting number of rooms {string}")
	public void user_is_selecting_number_of_rooms(String noOfRoom) {
		search = new SearchHotelpojo();
		dropDownBytext(search.getNumberOfRoom().get(0), noOfRoom);
		assertForSendKeys(noOfRoom, search.getNumberOfRoom());

	}

	@When("user is selecting number room for adults{string}")
	public void user_is_selecting_number_room_for_adults(String noOfAdults) {
		search = new SearchHotelpojo();
		dropDownBytext(search.getAdultPerRoom().get(0), noOfAdults);
		assertForSendKeys(noOfAdults, search.getAdultPerRoom());

	}

	@When("user is selecting number of room for children{string}.")
	public void user_is_selecting_number_of_room_for_children(String noOfChildren) {
		search = new SearchHotelpojo();
		dropDownBytext(search.getChildrenPerRoom().get(0), noOfChildren);
		assertForSendKeys(noOfChildren, search.getChildrenPerRoom());

	}

	@Then("user clicking search button")
	public void user_clicking_search_button() {
		search = new SearchHotelpojo();
		click(search.getBtnSearch().get(0));

	}

	@When("user clicking confirm button.")
	public void user_clicking_confirm_button() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertForEquals("https://www.adactin.com/HotelApp/SelectHotel.php");
		select = new SelectHotelPojo();
		click(select.getBtnRadio().get(0));
	}

	@Then("user is clicking continue button.")
	public void user_is_clicking_continue_button() {
		select = new SelectHotelPojo();
		click(select.getBtnContinue().get(0));
	}

	@When("user is enter his {string} and {string}")
	public void user_is_enter_his_and(String firstname, String Lastname) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String msg = "User is in filling page";
		assertForEquals("https://www.adactin.com/HotelApp/BookHotel.php");
		book = new BookHotelPojo();
		fill(book.getLstFirstName().get(0), firstname);
		assertForSendKeys(firstname, book.getLstFirstName());
		fill(book.getLstLastName().get(0), Lastname);
		assertForSendKeys(Lastname, book.getLstLastName());
	}

	@When("user is enter his {string}.")
	public void user_is_enter_his(String address) {
		book = new BookHotelPojo();
		fill(book.getLstAddress().get(0), address);
		assertForSendKeys(address, book.getLstAddress());

	}

	@When("user is enter the {string}.")
	public void user_is_enter_the(String cardno) {
		book = new BookHotelPojo();
		fill(book.getLstCreditCardNumber().get(0), cardno);
		assertForSendKeys(cardno, book.getLstCreditCardNumber());
	}

	@When("user is select his card type{string}")
	public void user_is_select_his_card_type(String cardtype) {
		book = new BookHotelPojo();
		dropDownBytext(book.getLstCardType().get(0), cardtype);
		assertForSendKeys(cardtype, book.getLstCardType());

	}

	@When("user is select month {string}and year {string}of his card.")
	public void user_is_select_month_and_year_of_his_card(String month, String year) {
		book = new BookHotelPojo();
		dropDownBytext(book.getLstMonth().get(0), month);
		assertForSendKeys(month, book.getLstMonth());
		dropDownBytext(book.getLstYear().get(0), year);
		assertForSendKeys(year, book.getLstYear());

	}

	@When("user is enter {string}")
	public void user_is_enter(String ccv) {
		book = new BookHotelPojo();
		fill(book.getLstCvv().get(0), ccv);
		assertForSendKeys(ccv, book.getLstCvv());

	}

	@Then("user is click book now button.")
	public void user_is_click_book_now_button() {
		book = new BookHotelPojo();
		click(book.getBtnBookNow().get(0));
	}

	@When("user is waiting for his order number is get generate")
	public void user_is_waiting_for_his_order_number_is_get_generate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user is printing his order ID.")
	public void user_is_printing_his_order_ID() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String msg = "User booked his Hotel";
		assertForEquals("https://www.adactin.com/HotelApp/BookHotel.php");
		confirm = new BookingConfirmPojo();
		printAttribute(confirm.getLstOrderNumber().get(0));
	}

	@Then("user is clicking logout.")
	public void user_is_clicking_logout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String msg = "user is logged his account";
		assertForEquals("https://www.adactin.com/HotelApp/BookingConfirm.php");
		confirm = new BookingConfirmPojo();
		click(confirm.getBtnLogOut().get(0));
		driver.quit();
	}

}
