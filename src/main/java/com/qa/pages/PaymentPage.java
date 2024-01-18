package com.qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class PaymentPage extends TestBase {
	  @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	    public static WebElement searchBox;

	    @FindBy(id = "nav-search-submit-button")
	   
	    public static WebElement searchButton;
	@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='rush-component']//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-declarative']//div[@class='puis-card-container s-card-container s-overflow-hidden aok-relative puis-include-content-margin puis puis-v1sbs6puudm3ke1y3ir67nn0k6e s-latency-cf-section puis-card-border']//div[@class='a-section']//div[@class='puisg-row']//div[@class='puisg-col puisg-col-4-of-12 puisg-col-4-of-16 puisg-col-4-of-20 puisg-col-4-of-24 puis-list-col-left']//div[@class='puisg-col-inner']//div[@class='s-product-image-container aok-relative s-text-center s-image-overlay-grey puis-image-overlay-grey s-padding-left-small s-padding-right-small puis-flex-expand-height puis puis-v1sbs6puudm3ke1y3ir67nn0k6e']//div[@class='aok-relative']//span[@class='rush-component']//a[@class='a-link-normal s-no-outline']//div[@class='a-section aok-relative s-image-fixed-height']//img[@class='s-image']")
	public static WebElement productlink;
	   @ FindBy(xpath = "//input[@id='add-to-cart-button']")
	   		
	   public static  WebElement buynow ;
	    		

	    @FindBy(xpath = "//ul[@class='a-nostyle a-list-link']//li")
	    public WebElement quantity;

	    @FindBy(name = "proceedToRetailCheckout")
	    public static WebElement checkoutButton;

	@FindBy(xpath ="//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")
	WebElement addcredicard;
	@FindBy(xpath= ("//input[@name='ppw-widgetEvent:AddCreditCardEvent' and @class='a-button-input']\r\n"))
			WebElement number;
				@FindBy(name ="ppw-accountHolderName")
	WebElement name;
	@FindBy(xpath="//span[@id   ='pp-Ctn44g-23']")
	WebElement date;
	@FindBy(xpath="//span[@id = 'pp-Ctn44g-24']")
	WebElement year;
	@FindBy(xpath="//input[@id ='pp-Ctn44g-26']")
	WebElement cvv;
	@FindBy(xpath="//input[@name ='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement cardadd;
	@FindBy(xpath ="//span[@id='shipToThisAddressButton']//span[@class='a-button-inner']//input[@type='submit']")
	WebElement Address;
	@FindBy(name ="ppw-instrumentRowSelection")
	WebElement cardradio;
	@FindBy(name ="continue-bottom")
	WebElement qtyy;	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public void addcard() {
		  searchBox.sendKeys(prop.getProperty("Productname"));
	        searchButton.click();

	        // Click on the product link
	        productlink.click();
	        Set<String> window=driver.getWindowHandles();
	    	
	    	System.out.println(window.size());
	    	Iterator<String> itr =window.iterator();
	    	String mainwindow = itr.next();
	    	String childWindow = itr.next();
	    	driver.switchTo().window(childWindow);
	    	WebElement buynow= driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	    	JavascriptExecutor	jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();",buynow);
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(buynow)).click();
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait1.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
	      //  checkoutButton.click();
	      Address.click();
	    //  qtyy.click();
	   	WebElement cardradio= driver.findElement(By.name("ppw-instrumentRowSelection"));
    	JavascriptExecutor	jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click();",cardradio);
		
     
        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitt.until(ExpectedConditions.elementToBeClickable(cardradio)).click();
		cardradio.click();


	        addcredicard.click();
driver.switchTo().frame("ApxSecureIframe");

	WebElement number= driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent' and @class='a-button-input']\r\n"
			+ ""));
	JavascriptExecutor	jse11 = (JavascriptExecutor)driver;
	jse11.executeScript("arguments[0].click();",number);
WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
wait11.until(ExpectedConditions.elementToBeClickable(number)).click();
		 
		/* name.sendKeys(prop.getProperty("cardname"));
		 WebElement date= driver.findElement(By.xpath("//span[@id   ='pp-Ctn44g-23']"));
		 Select s = new Select(date);
		 s.selectByValue(prop.getProperty("Date"));
		 WebElement year = driver.findElement(By.xpath("//span[@id = 'pp-Ctn44g-24']"));
		 Select m = new Select(year);
		 m.selectByValue(prop.getProperty("Year"));
		 cvv.sendKeys(prop.getProperty("Cvv"));
		 cardadd.click();*/
		 
		 
		 
	
	}
}
