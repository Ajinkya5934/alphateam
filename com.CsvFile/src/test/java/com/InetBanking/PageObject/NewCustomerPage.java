package com.InetBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {

	//repository
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement newcustomerlnk;
	
	@FindBy(name="name")
	WebElement custname;
	
	@FindBy(name="rad1")
	WebElement radgender;
	
	@FindBy(name="dob")
	WebElement txtdob;
	
	@FindBy(name="addr")
	WebElement add;
	
	@FindBy(name="city")
	WebElement citynam;
	
	@FindBy(name="state")
	WebElement statename;
	
	@FindBy(name="pinno")
	WebElement pincode;
	
	@FindBy(name="telephoneno")
	WebElement telephone;
	
	
	@FindBy(name="emailid")
	WebElement eid;
	
	@FindBy(name="sub")
	WebElement submitbtn;
	
	WebDriver driver;
	public NewCustomerPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clicknewcust() {
		newcustomerlnk.click();
	}
	public void customer(String cname) {
		custname.sendKeys(cname);
	}
	
	public void gender(String cgender) {
		radgender.click();
	}
	
	public void custdob(String mm,String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void address(String addre) {
		add.sendKeys(addre);
	}
	public void cityname(String city) {
		citynam.sendKeys(city);
	}
	
	public void custstate(String state) {
		statename.sendKeys(state);
	}
	public void custPin(String Pin ) {
		pincode.sendKeys(Pin);
	}
	
	public void custTelephone(String tele ) {
		telephone.sendKeys(tele);
	}
	
	public void custemail(String emaild) {
		eid.sendKeys(emaild);
	}
	
	public void custsubmit() {
		submitbtn.click();
	}
}
