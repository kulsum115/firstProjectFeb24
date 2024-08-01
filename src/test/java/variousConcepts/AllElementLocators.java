package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class AllElementLocators {

	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium_Feb24\\session2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	// WebSite Used - https://objectspy.space/
	@Test
	public void locators() throws InterruptedException {
		
		// locate by id
		//Radio buttons
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-4")).click();
		
		//locate by name
		
		driver.findElement(By.name("firstname")).sendKeys("LK");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("Password")).sendKeys("Learn");
		
		//locate by class
		
		//locate by Linktext
	//	driver.findElement(By.linkText("Link Test : New Page")).click();
	//	Thread.sleep(5000);
	//	driver.navigate().back();
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//Partial link text
		driver.findElement(By.partialLinkText("TF-API Product")).click();
		driver.navigate().back();
		
		
	}
}
