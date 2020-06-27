package com.myselenium.selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class FirefoxTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.navigate().to("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest(){	
		    
		    
		   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\rachel\\eclipse-workspace\\com.myselenium.selenium\\drivers\\chromedriver.exe");
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\rachel\\eclipse-workspace\\com.myselenium.selenium\\drivers\\geckodriver.exe");
			 DesiredCapabilities dcap = new DesiredCapabilities();
		        dcap.setCapability("pageLoadStrategy", "normal");
		        FirefoxOptions opt = new FirefoxOptions();
		        opt.merge(dcap);
			 driver =new FirefoxDriver(opt);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	