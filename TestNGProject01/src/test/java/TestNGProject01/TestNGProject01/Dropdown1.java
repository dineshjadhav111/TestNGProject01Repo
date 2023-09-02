package TestNGProject01.TestNGProject01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
	     //****************************************** 1st Website *****************************************************************//
	     //************************************************************************************************************************//
		driver.get("https://www.facebook.com");	
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select s = new Select(day);
		s.selectByVisibleText("21");     //Day
		//s.selectByIndex(20);
		//s.selectByValue("21");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Dec");   //Month
		Thread.sleep(2000);
		
        WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
        Select y = new Select(year);
        y.selectByVisibleText("1994");    //Year
        Thread.sleep(5000);
        driver.close();  
        
       /* List<WebElement> alloption = s.getOptions();
        
        for(WebElement opt : alloption)
        {
        	if(opt.getText().equals("21"))
        	{
        		opt.click();
        		break;
        	}
        }  */
        
   	 //************************************************************************************************************************//
     //****************************************** 2nd Website *****************************************************************//
	 //************************************************************************************************************************//
	    
   /*     driver.get("https://qavalidation.com/demo-form/");
       WebElement w1 = driver.findElement(By.xpath("//select[@id='g4072-gender']"));
       Select f = new Select(w1);
       f.selectByValue("Female");
       Thread.sleep(3000);
       */
    /*   WebElement Male = driver.findElement(By.xpath("//*[@name='sgender']"));
       Select m = new Select(Male);
       m.selectByVisibleText("Male");   
     */   
     //****************************************** 3rd Website *****************************************************************//
	//************************************************************************************************************************//

       /* driver.get("https://www.amazon.com/");
       WebElement w1 =  driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select s = new Select(w1);
        s.selectByVisibleText("Automotive");
        Thread.sleep(3000);
        512
*/
	}

}
