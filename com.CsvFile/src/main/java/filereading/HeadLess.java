package filereading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\hp\\Downloads\\Selenium\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("headless");
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.crmpro.com/");
		System.out.println("loginpagetitle  " +driver.getTitle() );
		
		
		driver.findElement(By.name("username")).sendKeys("ajdeshmukh");
		driver.findElement(By.name("password")).sendKeys("crm@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		System.out.println("DashBoardpage  " +driver.getTitle() );
		

	}

}
