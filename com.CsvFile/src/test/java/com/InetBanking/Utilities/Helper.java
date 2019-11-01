package com.InetBanking.Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static void handlalert(WebDriver driver) {
		if(alertIsPresent(driver)) {
			Alert alert =driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
			
		}
	
	
	public static boolean alertIsPresent(WebDriver driver) {
		
		driver.switchTo().alert();
		return true;
		

}
}
