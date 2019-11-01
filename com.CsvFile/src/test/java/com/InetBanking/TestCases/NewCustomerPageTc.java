package com.InetBanking.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.InetBanking.PageObject.LoginPage;
import com.InetBanking.PageObject.NewCustomerPage;
import com.InetBanking.Utilities.Helper;

public class NewCustomerPageTc extends BaseClass {
	LoginPage login;
	NewCustomerPage newcust;
	
	@BeforeMethod
	public void setup() {
		browserSetup(pro.getProperty("browser"),pro.getProperty("baseUrl"));
		login = new LoginPage(driver);
		newcust= login.navigateToNewCustomerPage();
	}

	@Test
	public void addnewcustomer() throws InterruptedException {
		
		login.setUserName(username);
		login.setPassword(password);
		login.clickSubmit();
		
		Thread.sleep(2000);
		newcust.clicknewcust();
		newcust.customer("Ajinkya");
		newcust.gender("male");
		newcust.custdob("06", "13", "1993");
		Thread.sleep(3000);
		newcust.address("India");
		newcust.cityname("Pune");
		newcust.custstate("maharashtra");
		newcust.custPin("411052");
		newcust.custTelephone("70000011200");
		
		
		String email= randomString()+"@gmail.com";
		newcust.custemail(email);
		newcust.custsubmit();
		
		
		Thread.sleep(3000);
		
		
	}
	public String randomString() {
		
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return(generatedString);
		
	}
	
}
