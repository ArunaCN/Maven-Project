package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement login_Button;

	public Home_Page(WebDriver runnerdriver) {
		this.driver = runnerdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin_Button() {
		return login_Button;
	}
}
