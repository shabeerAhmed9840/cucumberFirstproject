package com.screen;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookHotelPojo extends LibGlobal{
	
	public BookHotelPojo () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	private List<WebElement> lstFirstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private List<WebElement> lstLastName;
	
	@FindBy(xpath="//textarea[@name='address']") 
	private List<WebElement> lstAddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private List<WebElement> lstCreditCardNumber;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private List<WebElement> lstCardType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private List<WebElement> lstMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private List<WebElement> lstYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private List<WebElement> lstCvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private List<WebElement> btnBookNow;

	public List<WebElement> getLstFirstName() {
		return lstFirstName;
	}

	public List<WebElement> getLstLastName() {
		return lstLastName;
	}

	public List<WebElement> getLstAddress() {
		return lstAddress;
	}

	public List<WebElement> getLstCreditCardNumber() {
		return lstCreditCardNumber;
	}

	public List<WebElement> getLstCardType() {
		return lstCardType;
	}

	public List<WebElement> getLstMonth() {
		return lstMonth;
	}

	public List<WebElement> getLstYear() {
		return lstYear;
	}

	public List<WebElement> getLstCvv() {
		return lstCvv;
	}

	public List<WebElement> getBtnBookNow() {
		return btnBookNow;
	}


}
