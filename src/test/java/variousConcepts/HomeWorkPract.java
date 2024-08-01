package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkPract {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium_Feb24\\session2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void addCompanyTest() throws InterruptedException {
		Thread.sleep(5000);
		// Login Page
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/form/div[1]/input"))
				.sendKeys("demo@codefios.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@id='login_submit']")).click();

		// codefios dashboard Company button
		driver.findElement(By.xpath("/html/body/div[1]/aside[1]/div/nav/ul[2]/li[5]/a")).click();
		Thread.sleep(4000);

		// Company List page Add Company button
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/div/div[1]/header/div/div/div/button")).click();

		// Add Company Page
		driver.findElement(By.cssSelector("input#company_name")).sendKeys("LKMCompany");
		driver.findElement(By.cssSelector("input#company_email")).sendKeys("llkkmm@lkm.com");
		driver.findElement(By.cssSelector("input#company_phone")).sendKeys("8178882525");
	//	driver.findElement(By.xpath("//button[@id='companyformsubmit']")).click();
		driver.findElement(By.id("companyformsubmit")).click();
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
