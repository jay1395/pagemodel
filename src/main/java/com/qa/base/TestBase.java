package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.pages.PaymentPage;
import com.qa.util.WebDriverListner;

 public class TestBase {
	 public  static WebDriver driver;
       public static Properties prop;
       //public static EventFiringWebDriver e_driver;
      // public static WebEventListner eventtlistner;
       
      
      public TestBase() {
    	  try {
    		  prop = new Properties();
    		  FileInputStream ip = new FileInputStream("C:\\QA\\Selenium_WorkSpace\\AutomationProject\\src\\main\\java\\com\\qa\\config\\config.properties");
    				
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	////			
      }


      		
	
      public static void intialization() {
    	  String browsername = prop.getProperty("browser");
    	  if(browsername.equals("Firefox")) {
    	   driver = new FirefoxDriver();
    	  
    	  } else if(browsername.equals("Chrome")){
    		 
    		  driver = new ChromeDriver();
    	  }else{
    		  driver = new EdgeDriver();
    		  
    	  }
    	// e_driver = new EventFiringWebDriver(driver);
    	 //EventListener = new WebEventListner();
    	 //e_driver.register(eventlistner);
    	 //driver=e_driver;
    	 
    	  
    	  
    	  
    	  driver.manage().window().maximize();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    	  
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  driver.get(prop.getProperty("url"));
      }
     
}  
      