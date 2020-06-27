package com.myselenium.selenium;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class ChromeTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
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
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rachel\\eclipse-workspace\\com.myselenium.selenium\\drivers\\chromedriver.exe");
			 DesiredCapabilities dcap = new DesiredCapabilities();
		        dcap.setCapability("pageLoadStrategy", "normal");
		        dcap.setCapability( "browserName", "chrome" );
		        ChromeOptions opt = new ChromeOptions();
		        opt.merge(dcap);
			 driver =new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	