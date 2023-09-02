package TestNGProject01.TestNGProject01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	
	/*  WebDriver driver;
	
	  @BeforeMethod public void setup() { 
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  } */
	 
	
	
	@Test(priority=2)
	public void instagramTitle() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		String ActTitle = "Instagram";
		String ExpTitle = driver.getTitle();
		Assert.assertEquals(ActTitle, ExpTitle);
		// String title = driver.getTitle(); 
		// System.out.println(title);
		Thread.sleep(3000);
	}

	@Test(priority=-1)
	public void AmazonTitle() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		String ActTitle = driver.getTitle();
		String ExpTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(ActTitle, ExpTitle);
		Thread.sleep(3000);
	  }
	  
		@Test(priority=1)
		public void facebookTitle() throws InterruptedException {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize(); 
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			String ActTitle = driver.getTitle();
			String ExpTitle = "Facebook – log in or sign up";
			Assert.assertEquals(ActTitle, ExpTitle);
			// String title = driver.getTitle();
			// System.out.println(Title);
			Thread.sleep(3000);
		} 
		 
			/*
			 * @AfterMethod public void tearDown() { driver.close(); }
			 */
}
