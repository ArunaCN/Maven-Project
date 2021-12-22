package com.sdp;

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
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args){
		getURL("http://automationpractice.com/index.php");
		clickOnElement(pom.getInstanceHp().getLogin_Button());		
		inputValueElement(pom.getInstanceAcp().getEmail(),"a11@mailinator.com");
		clickOnElement(pom.getInstanceAcp().getSubmitButton());
		sleep(5000);		
		clickOnElement(pom.getInstanceRap().gettitle());
		inputValueElement(pom.getInstanceRap().getCustomerFirstname(), "Amee");
		inputValueElement(pom.getInstanceRap().getCustomerLastname(), "Aruna");
		inputValueElement(pom.getInstanceRap().getPassword(), "AmeeAruna");
		dropDown("byValue", pom.getInstanceRap().getDay(), "19");
		dropDown("byVisibleText", pom.getInstanceRap().getMonth(), "June ");
		dropDown("byIndex", pom.getInstanceRap().getYear(), "26");		
		inputValueElement(pom.getInstanceRap().getFirstname(), "Amee");
		inputValueElement(pom.getInstanceRap().getLastname(), "Aruna");
		inputValueElement(pom.getInstanceRap().getCompany(), "ABC Company");
		inputValueElement(pom.getInstanceRap().getAddress(), "Address1");
		inputValueElement(pom.getInstanceRap().getCity(), "Test City");
		dropDown("byVisibleText", pom.getInstanceRap().getState(), "Wisconsin");		
		inputValueElement(pom.getInstanceRap().getPostCode(), "40000");
		inputValueElement(pom.getInstanceRap().getMobile(), "678934000");
		clear(pom.getInstanceRap().getAliasAddress());
		inputValueElement(pom.getInstanceRap().getAliasAddress(), "Madison");
		clickOnElement(pom.getInstanceRap().getRegisterAccountButton());		
		sleep(3000);
		actionsClass("moveto",pom.getInstanceOp().getCategory());
		actionsClass("click",pom.getInstanceOp().getDress());
		sleep(3000);
		actionsClass("moveto",pom.getInstanceOp().getSelectedDress());
		actionsClass("click",pom.getInstanceOp().getAddToCart());
		sleep(3000);
		clickOnElement(pom.getInstanceOp().getProceedCheckout());
		clickOnElement(pom.getInstanceOp().getSigninCheckout());
		clickOnElement(pom.getInstanceOp().getAddressCheckout());
		clickOnElement(pom.getInstanceOp().getTerms());
		clickOnElement(pom.getInstanceOp().getShippingCheckout());
		sleep(3000);
		clickOnElement(pom.getInstanceOp().getPaymentCheckout());
		sleep(3000);
		clickOnElement(pom.getInstanceOp().getConfirmOrder());
		sleep(3000);
		takeScreenshot("C:\\Users\\ameea\\eclipse-workspace\\Base_Class\\Screenshots\\Order_Completion.png");
		quit();
	}
}
