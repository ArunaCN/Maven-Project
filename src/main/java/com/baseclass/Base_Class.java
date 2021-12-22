package com.baseclass;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {	
	public static WebDriver driver;
	public static WebDriver getBrowser(String browserName) {
		try {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			//C:/Users/ameea/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59-sources.jar
			//C:\Users\ameea\eclipse-workspace\Base_Class\Driver\chromedriver.exe
			driver = new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	public static void clickOnElement(WebElement element) {
		try {
		element.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void getURL(String url) {
		try {
		driver.get(url);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void inputValueElement(WebElement element, String value) {
		try {
		element.sendKeys(value);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void dropDown(String type, WebElement element, String value) {
		try {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
		else if(type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void sleep(int milliseconds) {
		try {
		Thread.sleep(milliseconds);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void scrollUpandDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	public static void actionsClass(String actionName, WebElement element) {
		try {
			Actions a = new Actions(driver);
			if(actionName.equalsIgnoreCase("moveto")) {
				a.moveToElement(element).build().perform();
			}
			else if(actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
			}
			else if(actionName.equalsIgnoreCase("doubleClick")) {
				a.contextClick(element).build().perform();
			}
			else if(actionName.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeScreenshot(String fileLocation) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(fileLocation);
			FileUtils.copyFile(source, destination);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}

}
