package com.qa.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.qa.base.TestBase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	public LoginPageTest() {
		super();
		
	
	}
	@BeforeMethod
	public void setup() {
		intialization();
		 loginpage = new LoginPage();
		 
	}
	@Test(priority =1)
	public void loginpagetitletest() {
	String title=	loginpage.validateloginpagetitle();
	AssertJUnit.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			
	}
	@Test(priority =2)
	public void loginTest() throws InterruptedException, IOException  {
	//	Thread.sleep(3000);
	loginpage.login(prop.getProperty("username"), prop.getProperty("Password"));
	//loginpage.newlogin();
	}
	@Test
	public void EmptyemailloginTest() throws InterruptedException, IOException  {
		loginpage.newlogin("", prop.getProperty("Password"));
		
		
		
		
		
		
		String expected = "Enter your email or mobile phone number";
		String actual = driver.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText();
				AssertJUnit.assertEquals(expected, actual);
	}
	@Test
	public void emptypasswordloginTest() throws InterruptedException, IOException {
		loginpage.login(prop.getProperty("username"), "");
		String expected =  "Enter your password";
		String actual = driver.findElement(By.xpath("//div[contains(text(),'Enter your password')]")).getText();
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void wrongemailloginTest() throws InterruptedException, IOException {
		loginpage.newlogin("hhisahs", prop.getProperty("Password"));
		String expected ="We cannot find an account with that email address";
		String actual = driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
		AssertJUnit.assertEquals(expected, actual);
		
	}
		
		
		
		
		
		
		
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
