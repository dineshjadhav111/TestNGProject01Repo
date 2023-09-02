package TestNGProject01.TestNGProject01;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider2 {

WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qavalidation.com/demo-form/");
		Thread.sleep(3000);
	}
	
	@Test(dataProvider="loginData")
	public void login(String uname,String email,String Mobno) throws InterruptedException{
		WebElement un= driver.findElement(By.id("g4072-fullname"));
		un.clear();
		un.sendKeys(uname);
		Thread.sleep(3000);
		
		WebElement id= driver.findElement(By.id("g4072-email"));
		id.clear();
		id.sendKeys(email);
		Thread.sleep(3000);

		WebElement mb= driver.findElement(By.id("g4072-phonenumber"));
		mb.clear();
		mb.sendKeys(Mobno);
		Thread.sleep(3000);
		

	}	
	
	@DataProvider(name="loginData")
	public Object [][] getData(){
		Object data [][] = {{"Dinesh","d1@gmail.com","1234"},{"Yogesh","y1@gmail.com","2345"},{"Sumit","s1@gmail.com","4567"}};
		return data;
		}
		
	@AfterSuite
	public void tearDown(){
		driver.close();	
	}

}
