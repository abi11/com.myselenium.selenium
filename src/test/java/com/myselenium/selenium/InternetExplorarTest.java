package com.myselenium.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class InternetExplorarTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/"); 
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertTrue(title.contains("WebDriver")); 		
		}	
		@BeforeTest
		public void beforeTest(){	
		//public void beforeTest() throws IOException {	
			Properties prop = new Properties();
			//prop.load(new FileInputStream("C:\\Users\\rachel\\neon\\selenium\\com.myselenium.selenium\\src\\test\\resources\\myselenium.properties"));
			//System.setProperty("webdriver.gecko.driver", prop.getProperty("system.webdriver.gecko.driver"));
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\rachel\\neon\\selenium\\com.myselenium.selenium\\drivers\\selenium-firefox-driver-3.9.1.jar");
//		    driver = new FirefoxDriver();  
		    
		    
		   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\rachel\\eclipse-workspace\\com.myselenium.selenium\\drivers\\chromedriver.exe");
			// System.setProperty("webdriver.ie.driver", "\\com.myselenium.selenium\\drivers\\IEDriverServer.exe");
			 System.setProperty("webdriver.ie.driver", "C:\\Users\\rachel\\eclipse-workspace\\com.myselenium.selenium\\drivers\\IEDriverServer.exe");
			 
			
			DesiredCapabilities dcap = new DesiredCapabilities();
	        dcap.setCapability("pageLoadStrategy", "normal");
	        InternetExplorerOptions opt = new InternetExplorerOptions();
	        opt.merge(dcap);
	        driver =new InternetExplorerDriver(opt);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	