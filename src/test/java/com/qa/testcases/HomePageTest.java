package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	public  HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		intialization();
		loginpage = new LoginPage();
	homepage=	loginpage.login(prop.getProperty("username"), prop.getProperty("Password"));
	}
	@Test(priority =2)
	public  void HomePagetitletest() {
		String homepagetitle = homepage.validateHomePagetitle();
		AssertJUnit.assertEquals(homepagetitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	@Test(priority=3)
	
	public void verifyamazonimgTest() {
		homepage.verifyamazonimg();
		AssertJUnit.assertTrue(true);
	}
	@Test
	public void verifydelivarytabTest() {
		homepage.verifydelivarytab();
		AssertJUnit.assertTrue(true);
	}
	@Test
	public void serchbarTest() {
		homepage.serchbar();
	}
	@Test
	public void languageboxTest() {
		homepage.langaugebox();
		
		
	}
	@Test
	public void accountnameTest() {
		homepage.accountname();
		
	
	}
	@Test
	public void HeaderTest() {
		homepage.Header();
	}
	@Test

		public void footerTest() {
		homepage.footer();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}



	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

