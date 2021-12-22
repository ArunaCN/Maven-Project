package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Account_Creation_Page;
import com.pom.Home_Page;
import com.pom.Order_Page;
import com.pom.Register_Account_Page;

public class Page_Object_Manager {
	public WebDriver driver; //null
	//Collection of Pom class objects and store in private
	private Home_Page hp; //null
	private Account_Creation_Page acp; //null
	private Register_Account_Page rap; //null
	private Order_Page op; //null
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Home_Page getInstanceHp() {
		if(hp==null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	public Account_Creation_Page getInstanceAcp() {
		if(acp==null) {
			acp = new Account_Creation_Page(driver);
		}
		return acp;
	}
	public Register_Account_Page getInstanceRap() {
		if(rap==null) {
			rap = new Register_Account_Page(driver);
		}
		return rap;
	}
	public Order_Page getInstanceOp() {
		if(op==null) {
			op = new Order_Page(driver);
		}
		return op;
	}
}
