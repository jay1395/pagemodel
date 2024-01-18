
package com.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class HomePage extends TestBase  {

	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement amazonimg;
	@FindBy(xpath="//div[@id='glow-ingress-block']")
     WebElement delivary;
	@FindBy(xpath ="//span[@id='nav-search-label-id']")
	WebElement Dropdown;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement serchbar;
	@FindBy(xpath="//div[contains(text(),'EN')]")
	WebElement language;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement accountname;
	@FindBy(xpath="//span[contains(text(),'Returns')]")
	WebElement Return;
	@FindBy(xpath="//div[@id='nav-cart-text-container']")
	WebElement cart;
	@FindBy(xpath="//span[contains(@class,'hm-icon-label')]")
	WebElement all;
	@FindBy(xpath="xpath(\"//div[@id='nav-xshop']//a\"))")
	WebElement Header;
	@FindBy(xpath="//div[@class='navFooterVerticalRow navAccessibility']//li")
	WebElement footer;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public String validateHomePagetitle() {
 return	driver.getTitle();
 
}
	public boolean verifyamazonimg() {
		amazonimg.isDisplayed();
		return true;
	}
	public boolean verifydelivarytab() {
		delivary.click();
		return true;
		
	}

public void serchbar() {
	serchbar.click();

}
public Object langaugebox() {
	language.click();
	return new Object();
}
	public void accountname() {
	
	accountname.click();
		}
	public void Return() {
		Return.click();
	}
	public void cart() {
		cart.click();
	}
	public List<WebElement> Header(){
		List<WebElement> headerlink = driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
		System.out.println(headerlink.size());
		for(int i =0; i<headerlink.size(); i++) {
			System.out.println(headerlink.get(i).getText());
		}
		return headerlink;
		
		
	}
		
	
		public List<WebElement> footer() {
			List<WebElement> footerlink = driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//li"));
			System.out.println(footerlink.size());
			for(int i =0;i< footerlink.size(); i++) {
				System.out.println(footerlink.get(i).getText());
		}
			return footerlink;
			

	}
}
	




	
		
	

