package com.pom;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;
import com.pom.Account_Creation_Page;
import com.pom.Home_Page;
import com.pom.Order_Page;
import com.pom.Register_Account_Page;

public class Runner extends Base_Class{
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Home_Page hp = new Home_Page(driver);
	public static Account_Creation_Page acp = new Account_Creation_Page(driver);	
	public static Register_Account_Page rap = new Register_Account_Page(driver);
	public static Order_Page op = new Order_Page(driver);
	public static void main(String[] args){
		getURL("http://automationpractice.com/index.php");
		clickOnElement(hp.getLogin_Button());		
		inputValueElement(acp.getEmail(),"a11@mailinator.com");
		sleep(3000);
		clickOnElement(acp.getSubmitButton());
		sleep(5000);		
		clickOnElement(rap.gettitle());
		inputValueElement(rap.getCustomerFirstname(), "Amee");
		inputValueElement(rap.getCustomerLastname(), "Aruna");
		inputValueElement(rap.getPassword(), "AmeeAruna");
		dropDown("byValue", rap.getDay(), "19");
		dropDown("byVisibleText", rap.getMonth(), "June ");
		dropDown("byIndex", rap.getYear(), "26");		
		inputValueElement(rap.getFirstname(), "Amee");
		inputValueElement(rap.getLastname(), "Aruna");
		inputValueElement(rap.getCompany(), "ABC Company");
		inputValueElement(rap.getAddress(), "Address1");
		inputValueElement(rap.getCity(), "Test City");
		dropDown("byVisibleText", rap.getState(), "Wisconsin");		
		inputValueElement(rap.getPostCode(), "40000");
		inputValueElement(rap.getMobile(), "678934000");
		clear(rap.getAliasAddress());
		inputValueElement(rap.getAliasAddress(), "Madison");
		clickOnElement(rap.getRegisterAccountButton());		
		sleep(3000);
		actionsClass("moveto",op.getCategory());
		actionsClass("click",op.getDress());
		sleep(3000);
		actionsClass("moveto",op.getSelectedDress());
		actionsClass("click",op.getAddToCart());
		sleep(3000);
		clickOnElement(op.getProceedCheckout());
		clickOnElement(op.getSigninCheckout());
		clickOnElement(op.getAddressCheckout());
		clickOnElement(op.getTerms());
		clickOnElement(op.getShippingCheckout());
		sleep(3000);
		clickOnElement(op.getPaymentCheckout());
		sleep(3000);
		clickOnElement(op.getConfirmOrder());
		sleep(3000);
		takeScreenshot("C:\\Users\\ameea\\eclipse-workspace\\Base_Class\\Screenshots\\Order_Completion.png");
		quit();
	}
}
