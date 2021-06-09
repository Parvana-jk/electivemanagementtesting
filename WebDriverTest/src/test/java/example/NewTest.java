package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@Test
		public void testEasy1() {
            driver.get("https://auems1.netlify.app/");
            String title = driver.getTitle();
            Assert.assertTrue(title.contains("Login"));
        }
		@BeforeTest
		public void beforeTest() {	
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setHeadless(true);
			
			//System.setProperty("webdriver.gecko.driver","src/test/java/example/geckodriver.exe");
		   // driver = new FirefoxDriver(); 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		    capabilities.setCapability("marionette", true);
		    
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	