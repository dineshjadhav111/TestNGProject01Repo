package TestNGProject01.TestNGProject01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test(retryAnalyzer=rerunFailTestcase.class)
	public void facebookTitle() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		String ActTitle = driver.getTitle();
		String ExpTitle = "acebook – log in or sign up";
		Assert.assertEquals(ActTitle, ExpTitle);
		// String title = driver.getTitle();
		// System.out.println(Title);
		Thread.sleep(3000);
	}
	
	
	
	
}
