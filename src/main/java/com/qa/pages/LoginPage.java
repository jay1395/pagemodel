package com.qa.pages;
 import com.qa.base.TestBase;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends  TestBase {
	//pagefactory
	@FindBy(id ="ap_email")
	WebElement  username;
	@FindBy(xpath ="//a[@id='nav-link-accountList']")
	WebElement signin;
	@FindBy(id ="ap_password")
	WebElement password;
	@FindBy(id="continue")
	WebElement continuebtn;
	@FindBy(id ="signInSubmit")
	WebElement Signbtn;
	@FindBy(id ="createAccountSubmit")
	WebElement signup;
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement amazonimg;
	

	public LoginPage() {
	PageFactory.initElements(driver, this);
	
	}
	//actions
	public String validateloginpagetitle() {
 return	driver.getTitle();
	
	}
	public boolean validateimg() {
		amazonimg.isDisplayed();
		return true;
	}
public  HomePage login(String un,String ps) throws InterruptedException, IOException {
	signin.click();
	username.sendKeys(un);
	
	continuebtn.click();
	
	password.sendKeys(ps);
	Signbtn.click();
	
	return new HomePage();
}
	public HomePage newlogin(String un, String ps) throws IOException {
		signin.click();
		username.sendKeys(un);
		continuebtn.click();
		//password.sendKeys(ps);
		return new HomePage();
		
	}
			
			
			
	
	

	
	
		
	

}
	


	

	

