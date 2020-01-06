package com.screen;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelpojo extends LibGlobal{
	public SearchHotelpojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//select[@name='location']")
	private List<WebElement> location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private List<WebElement> hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private List<WebElement> roomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private List<WebElement> numberOfRoom;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private List<WebElement> adultPerRoom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private List<WebElement> childrenPerRoom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private List<WebElement> btnSearch;

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotel() {
		return hotel;
	}

	public List<WebElement> getRoomType() {
		return roomType;
	}

	public List<WebElement> getNumberOfRoom() {
		return numberOfRoom;
	}

	public List<WebElement> getAdultPerRoom() {
		return adultPerRoom;
	}

	public List<WebElement> getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public List<WebElement> getBtnSearch() {
		return btnSearch;
	}
	
	

}
