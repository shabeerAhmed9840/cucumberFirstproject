package com.screen;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookingConfirmPojo extends LibGlobal{
	public BookingConfirmPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='order_no']")
	private List<WebElement> lstOrderNumber;

    @FindBy(xpath="//input[@id='logout']")
    private List<WebElement> btnLogOut;

	public List<WebElement> getLstOrderNumber() {
		return lstOrderNumber;
	}

	public List<WebElement> getBtnLogOut() {
		return btnLogOut;
	}
}
