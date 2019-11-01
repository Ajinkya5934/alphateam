package com.InetBanking.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.InetBanking.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	Properties pro=new Properties();
	public  String baseUrl=readconfig.getApplicationUrl();
	public  String username=readconfig.getUserName();
	public  String password=readconfig.getPassword();
	public static WebDriver driver;
	
     public static Logger logger;
	
    {
    		
 		try {

 		
 			File fs = new File(".//Configuration//Config.properties");

 			FileInputStream fis = new FileInputStream(fs);
 			
 			pro = new Properties();
 			
 			pro.load(fis);

 		} catch (Exception e) {

 			e.printStackTrace();
 		}
 	

 	}
	
     public static void browserSetup(String browserName, String Url) {
 		
 		if (browserName.equalsIgnoreCase("chrome")) {
 			
 			
 			System.setProperty("webdriver.chrome.driver",
 					".//Drivers//chromedriver1.exe");
 			driver = new ChromeDriver();
 		}
 		
 		else if(browserName.equals("Firefox"))
 		{
 			System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
 			driver=new FirefoxDriver();
 			
 		}
 		
 		else 
 		{
 			System.out.println("driver not able to found..!!!");
 		}
 		
 		driver.get(Url);
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 	}

 	
	/*@AfterClass
	public void teardown(){
		driver.quit();
	}*/
}

