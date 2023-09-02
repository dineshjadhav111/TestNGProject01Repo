package TestNGProject01.TestNGProject01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider1 {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	@Test(dataProvider="loginData")
	public void login(String uname,String pass) throws InterruptedException{
		WebElement un= driver.findElement(By.name("username"));
		un.clear();
		un.sendKeys(uname);
		Thread.sleep(3000);
		
		WebElement pw= driver.findElement(By.name("password"));
		pw.clear();
		pw.sendKeys(pass);
		Thread.sleep(3000);


		WebElement btn= driver.findElement(By.xpath(" //button[text()=' Login '] "));
		btn.click();
		Thread.sleep(3000);

	}	
	
	@DataProvider(name="loginData")
	public Object [][] getData(){
		Object data [][] = {{"Dinesh","123"},{"Yogesh","234"},{"Sumit","456"}};
		return data;
		}
		
	public void tearDown(){
		driver.close();	
	}
		
}
