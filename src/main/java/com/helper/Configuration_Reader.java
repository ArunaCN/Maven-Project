package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
//To read data from .properties
	public static Properties p;//Null
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\ameea\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();//Null
		p.load(fis);
	}
	public String getURL()throws Throwable{		
		String url = p.getProperty("url");
		return url;
	}
	public String getEmail() {
		String username = p.getProperty("username");
		return username;
	}
	public String getCustfirstname() {
		String custfirstname = p.getProperty("custfirstname");
		return custfirstname;
	}
	public String getCustlastname() {
		String custlastname = p.getProperty("custlastname");
		return custlastname;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getDay() {
		String day = p.getProperty("day");
		return day;
	}
	public String getMonth() {
		String month = p.getProperty("month");
		return month;
	}
	public String getYear() {
		String year = p.getProperty("year");
		return year;
	}
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String getCompany() {
		String company = p.getProperty("company");
		return company;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getCity() {
		String city = p.getProperty("city");
		return city;
	}
	public String getState() {
		String state = p.getProperty("state");
		return state;
	}
	public String getPincode() {
		String pincode = p.getProperty("pincode");
		return pincode;
	}
	public String getMobilenum() {
		String mobilenum = p.getProperty("mobilenum");
		return mobilenum;
	}
	public String getAliasaddress() {
		String aliasaddress = p.getProperty("aliasaddress");
		return aliasaddress;
	}
}
