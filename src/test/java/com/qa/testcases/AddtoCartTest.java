package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import com.qa.base.TestBase;
import com.qa.pages.AddToCart;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class AddtoCartTest extends TestBase {
LoginPage loginpage;
HomePage homepage;

    static AddToCart addToCartPage;

    
	@BeforeMethod
    public void setUp() throws InterruptedException, IOException {
        intialization();
        loginpage = new LoginPage();
        loginpage.login(prop.getProperty("username"), prop.getProperty("Password"));
        
        addToCartPage = new AddToCart();
    }

    @Test
    public  void yourTest() throws IOException, InterruptedException {

    	
        AddToCart.addToCartAndProceed();
        // Add assertions or additional steps as needed/
    }

  // @AfterMethod
    @AfterMethod
	public void tearDown() {
        driver.quit();
    }

	
		// TODO Auto-generated method stub
		
	}


