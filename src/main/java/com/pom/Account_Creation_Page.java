package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Creation_Page {
	public WebDriver driver;
	@FindBy(id="email_create")
	private WebElement email_Address;
	@FindBy(id="SubmitCreate")
	private WebElement create_Account_Button;
	
	public Account_Creation_Page(WebDriver runnerdriver) {
		this.driver = runnerdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email_Address;
	}
	
	public WebElement getSubmitButton() {
		return create_Account_Button;
	}
}
