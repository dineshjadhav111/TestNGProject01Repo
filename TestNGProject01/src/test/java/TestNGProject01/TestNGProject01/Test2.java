package TestNGProject01.TestNGProject01;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseClass.BaseClass;

public class Test2 extends BaseClass {

	
	//SoftAssert soft = new SoftAssert();
	
	@Test
	public void facebook() 
	 {
			driver.get("https://www.facebook.com/");
			String ActTitle = driver.getTitle();
			String ExpTitle = "Facebook – log in or sign up";
			Assert.assertEquals(ActTitle, ExpTitle);
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			driver.findElement(By.name("firstnam")).sendKeys("Dinesh");
	 }
	 
	 @Test
	 public void Amazon() 
	 {
			driver.get("https://www.amazon.in/");
			String ActTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String ExpTitle = driver.getTitle();
			Assert.assertEquals(ActTitle, ExpTitle);
	 }
	
	 @Test
	 public void instagram() 
	 {
			driver.get("https://www.instagram.com/");
			String ActTitle = "Instagram";
			String ExpTitle = driver.getTitle();
			Assert.assertEquals(ActTitle, ExpTitle);
	 }
	
	
}
