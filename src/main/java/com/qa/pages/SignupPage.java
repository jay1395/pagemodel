package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignupPage extends TestBase {

@FindBy(partialLinkText ="Start here.")
WebElement start;
@FindBy(id ="ap_customer_name")
WebElement name;
@FindBy(id ="ap_phone_number")
WebElement number;
@FindBy(xpath ="//span[@class='a-dropdown-prompt']")
WebElement countrycode;
@FindBy(xpath ="//input[@id='ap_password']")
WebElement password;
@FindBy(xpath ="//input[@id='continue']")
WebElement verifybtn;

public SignupPage() throws IOException {
	PageFactory.initElements(driver, this);
	
	// TODO Auto-generated constructor stub
}
public   SignupPage clickonstart() throws IOException {
	start.click();
	return new SignupPage();
}
public String fillname(String nm) {
	name.sendKeys(nm);
	return new String();
	
}
public String fillnumber(String nu) {
	number.sendKeys(nu);
	return new String();
}
public String fillpassword(String ps) {
	password.sendKeys(ps);
	return new String();
}
public LoginPage verifybtn() {
	verifybtn.click();
	return new LoginPage();
}
}
