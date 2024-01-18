package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.SignupPage;

public class SignUpPageTest extends TestBase{
	LoginPage loginpage;
	SignupPage signup;
	public SignUpPageTest() {
		super();
	}
@Test(priority=1)
public void setup() throws InterruptedException, IOException {
	intialization();
	
	signup = new SignupPage();
	signup.clickonstart();

}
//@Test
public void clickstartTest() throws IOException {
signup.clickonstart();
}
@Test(priority=2)
public void fillnameTest() throws IOException {
	
	signup.fillname(prop.getProperty("name"));
}
	@Test(priority=3)
	public void fillnumberTesr() throws IOException {
		
		signup.fillnumber(prop.getProperty("number"));
		
	}
	@Test(priority=4)
	public void fillpasswordTest() throws IOException {
		
		signup.fillpassword(prop.getProperty("Password"));
		
	}
		
	@Test(priority =5)
	public void verifybtnTest() throws IOException {

		signup.verifybtn();
			
				String expected ="There was a problem\r\n"
						+ "Please enter a valid mobile phone number with area code.";
        String actual = driver.findElement(By.xpath("//div[@id='auth-error-message-box']")).getText();
        AssertJUnit.assertEquals(actual.trim(), expected.trim());
	}
	
	//@AfterMethod
	public void teardown() {
		driver.quit();
	}
		
		
		


}
