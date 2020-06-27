package com.myselenium.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class EdgeTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest(){	
		   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\rachel\\eclipse-workspace\\com.myselenium.selenium\\drivers\\chromedriver.exe");
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rachel\\eclipse-workspace\\\\com.myselenium.selenium\\drivers\\msedgedriver.exe");
			// System.setProperty("webdriver.edge.driver", "C:\\Users\\rachel\\eclipse-workspace\\\\com.myselenium.selenium\\drivers\\MicrosoftEdge.exe");
		//	System.setProperty("webdriver.edge.driver", "C:\\Users\\rachel\\eclipse-workspace\\\\com.myselenium.selenium\\drivers\\MicrosoftWebDriver.exe");
			DesiredCapabilities dcap = new DesiredCapabilities();
	        dcap.setCapability("pageLoadStrategy", "normal");
	        dcap.setCapability( "browserName", "chrome" );
	        InternetExplorerOptions opt = new InternetExplorerOptions();
	        opt.merge(dcap); 
			driver =new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	