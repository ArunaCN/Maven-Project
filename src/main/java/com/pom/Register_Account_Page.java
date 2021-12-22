package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Account_Page {
	public WebDriver driver;
	@FindBy(id="uniform-id_gender2")
	private WebElement title;
	@FindBy(id="customer_firstname")
	private WebElement cust_First_Name;
	@FindBy(id="customer_lastname")
	private WebElement cust_Last_Name;
	@FindBy(id="passwd")
	private WebElement pwd;
	@FindBy(id="days")
	private WebElement day;
	@FindBy(id="months")
	private WebElement month;
	@FindBy(id="years")
	private WebElement year;
	@FindBy(id="firstname")
	private WebElement first_Name;
	@FindBy(id="lastname")
	private WebElement last_Name;
	@FindBy(id="company")
	private WebElement company;
	@FindBy(id="address1")
	private WebElement address1;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="id_state")
	private WebElement state;
	@FindBy(id="postcode")
	private WebElement post_Code;
	@FindBy(id="phone_mobile")
	private WebElement mobile;
	@FindBy(id="alias")
	private WebElement alias_Address;
	@FindBy(id="submitAccount")
	private WebElement register_Account_Button;
	
	public Register_Account_Page(WebDriver runnerdriver) {
		this.driver = runnerdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement gettitle() {
		return title;
	}
	
	public WebElement getCustomerFirstname() {
		return cust_First_Name;
	}

	public WebElement getCustomerLastname() {
		return cust_Last_Name;
	}
	
	public WebElement getPassword() {
		return pwd;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFirstname() {
		return first_Name;
	}

	public WebElement getLastname() {
		return last_Name;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress() {
		return address1;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostCode() {
		return post_Code;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAliasAddress() {
		return alias_Address;
	}

	public WebElement getRegisterAccountButton() {
		return register_Account_Button;
	}
}
