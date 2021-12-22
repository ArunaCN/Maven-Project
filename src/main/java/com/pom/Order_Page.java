package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {
	public WebDriver driver;	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women_Category;
	@FindBy(xpath="(//a[text()='Evening Dresses'])[1]")
	private WebElement evening_Dresses;
	@FindBy(xpath="//img[@title ='Printed Dress']")
	private WebElement selected_Dress;
	@FindBy(xpath="//a[@title ='Add to cart']")
	private WebElement add_To_Cart;
	@FindBy(xpath="//a[@title ='Proceed to checkout']")
	private WebElement proceed_Checkout;
	@FindBy(xpath="(//a[@title ='Proceed to checkout'])[2]")
	private WebElement signin_Checkout;
	@FindBy(xpath="//button[@name ='processAddress']")
	private WebElement address_Checkout;
	@FindBy(id="cgv")
	private WebElement terms;
	@FindBy(xpath="//button[@name ='processCarrier']")
	private WebElement shipping_Checkout;
	@FindBy(xpath="//a[@class ='cheque']")
	private WebElement payment_Checkout;
	@FindBy(xpath="//button[contains(@class,'button btn')]")
	private WebElement confirm_Order;
	
	public Order_Page(WebDriver runnerdriver) {
		this.driver = runnerdriver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCategory() {
		return women_Category;
	}	
	public WebElement getDress() {
		return evening_Dresses;
	}
	public WebElement getSelectedDress() {
		return selected_Dress;
	}	
	public WebElement getAddToCart() {
		return add_To_Cart;
	}
	public WebElement getProceedCheckout() {
		return proceed_Checkout;
	}
	public WebElement getSigninCheckout() {
		return signin_Checkout;
	}
	public WebElement getAddressCheckout() {
		return address_Checkout;
	}
	public WebElement getTerms() {
		return terms;
	}
	public WebElement getShippingCheckout() {
		return shipping_Checkout;
	}
	public WebElement getPaymentCheckout() {
		return payment_Checkout;
	}
	public WebElement getConfirmOrder() {
		return confirm_Order;
	}
}
