package com.qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.base.TestBase;

public class AddToCart extends TestBase {
	

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
 

    public AddToCart() {
        PageFactory.initElements(driver, this);
    }
    public static void addToCartAndProceed() throws InterruptedException {
        // Search for the product
        searchBox.sendKeys(prop.getProperty("Productname"));
        searchButton.click();
    	WebElement productlink= driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='rush-component']//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-declarative']//div[@class='puis-card-container s-card-container s-overflow-hidden aok-relative puis-include-content-margin puis puis-v1z9gq9z4a1fkl2jjcbb6zilkt6 s-latency-cf-section puis-card-border']//div[@class='a-section']//div[@class='puisg-row']//div[@class='puisg-col puisg-col-4-of-12 puisg-col-4-of-16 puisg-col-4-of-20 puisg-col-4-of-24 puis-list-col-left']//div[@class='puisg-col-inner']//div[@class='s-product-image-container aok-relative s-text-center s-image-overlay-grey puis-image-overlay-grey s-padding-left-small s-padding-right-small puis-flex-expand-height puis puis-v1z9gq9z4a1fkl2jjcbb6zilkt6']//div[@class='aok-relative']//span[@class='rush-component']//a[@class='a-link-normal s-no-outline']//div[@class='a-section aok-relative s-image-fixed-height']//img[@class='s-image']"));
    	JavascriptExecutor	jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",productlink);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(productlink)).click();
        // Click on the product link
        productlink.click();
        Set<String> window=driver.getWindowHandles();
    	
    	System.out.println(window.size());
    	Iterator<String> itr =window.iterator();
    	String mainwindow = itr.next();
    	String childWindow = itr.next();
    	driver.switchTo().window(childWindow);
    	WebElement buynow= driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
    	JavascriptExecutor	jse11 = (JavascriptExecutor)driver;
		jse11.executeScript("arguments[0].click();",buynow);
		  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.elementToBeClickable(buynow)).click();
        checkoutButton.click();
      //  buynow.click();
        
        //driver.switchTo().window(mainwindow);
      //  driver.switchTo().frame(buynow);

        // Scroll "Buy Now" button into view
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].scrollIntoView(true);", buynow);

        // Wait for the "Buy Now" button to be clickable
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.elementToBeClickable(buynow)).click();
        
        //driver.switchTo().defaultContent();
    }



    	}

       
     
    


