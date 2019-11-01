package com.InetBanking.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	
	public void setUserName(String uname){
		txtUserName.sendKeys(uname);
	}
	
	
	public void setPassword(String upass){
		txtPassword.sendKeys(upass);
	}
	public void clickSubmit(){
		btnLogin.click();
	}
		
	public NewCustomerPage navigateToNewCustomerPage() {
		try {
			Thread.sleep(3000);
			// NewCustLink.click();;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new NewCustomerPage(driver);
	}
	  
	}
	