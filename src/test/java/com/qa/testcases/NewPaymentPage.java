package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddToCart;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PaymentPage;

public class NewPaymentPage extends TestBase {
    LoginPage loginpage;
    HomePage homepage;
    static PaymentPage paymentpage;
    

    @BeforeMethod
    public void setUp() throws InterruptedException, IOException {
        intialization();
        loginpage = new LoginPage();
        loginpage.login(prop.getProperty("username"), prop.getProperty("Password"));
        AddToCart.addToCartAndProceed();

        // Instantiate the obja here
     

        // Call the common functionality from AddtoCartTest class
       

        paymentpage = new PaymentPage();
    }

    @Test
    public void additem() throws IOException, InterruptedException {
    	
        paymentpage.addcard();
        // Add your assertions or verifications here if needed
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
