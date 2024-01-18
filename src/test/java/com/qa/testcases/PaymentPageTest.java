package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddToCart;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PaymentPage;



public class PaymentPageTest extends TestBase {
    LoginPage loginpage;
    HomePage homepage;
   static PaymentPage paymentpage;
    AddtoCartTest obja = new AddtoCartTest();
    
	@BeforeMethod
    public void setUp() throws InterruptedException, IOException {
        intialization();
        loginpage = new LoginPage();
        loginpage.login(prop.getProperty("username"), prop.getProperty("Password"));

        // Call the common functionality from AddtoCartTest class
       

        paymentpage = new PaymentPage();
    }
@Test(priority=1)
public  void yourTest() throws IOException, InterruptedException {

	
    paymentpage.addcard();
    String excepted = "Card number is required.";
	String actual = driver.findElement(By.xpath("//span[@class ='a-list-item']")).getText();
	
	AssertJUnit.assertEquals(actual,excepted );
    // Add assertions or additional steps as needed/
}

	

  

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
