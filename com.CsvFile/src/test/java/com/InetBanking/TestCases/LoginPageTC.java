package com.InetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.InetBanking.PageObject.LoginPage;

public class LoginPageTC extends BaseClass{
	
	LoginPage login;
	@BeforeMethod
	public void setup()
	{
		browserSetup(pro.getProperty("browser"), pro.getProperty("baseUrl"));
		login= new LoginPage(driver);
	}
	@Test
	public void loginTest(){
		driver.get(baseUrl);      

	       LoginPage lp=new LoginPage(driver);
	       lp.setUserName(username);

	       lp.setPassword(password);

	     
	      lp.clickSubmit();
	      if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")){
	      Assert.assertTrue(true);
	     
	      }
	      else{
	    	  Assert.assertFalse(false);
	      }
	}

	
	}
