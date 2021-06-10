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
		@Test
		
		public void testEasy2() {
            driver.get("https://auems1.netlify.app/");
            String title = driver.getTitle();
            driver.findElement(By.id ("email")).sendKeys("cb.en.u4cse18042@cb.students.amrita.edu");   
    	    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    driver.findElement(By.id ("pwd")).sendKeys("login") ;
    	    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
    	    
    	    driver.findElement(By.id("Button")).submit();  
    	    try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
			}
    	    title = driver.getTitle();
    	    try {
				Thread.sleep(4000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
			}
            Assert.assertTrue(title.contains("Parvana's Homepage"));
        
        }}
		@Test
		public void testEasy3() {
            driver.get("https://auems1.netlify.app/");
            String title = driver.getTitle();
            driver.findElement(By.id ("email")).sendKeys("cb.en.u4cse18042@cb.students.amrita.edu");   
    	    
    	    driver.findElement(By.id ("pwd")).sendKeys("login1") ;
    	    
    	    driver.findElement(By.id("Button")).submit();  
    	    title = driver.getTitle();
            Assert.assertTrue(title.contains("Login"));
        
        }
		@Test 
		public void testEasy4() {
            driver.get("https://auems1.netlify.app/");
            String title = driver.getTitle();
            try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            driver.findElement(By.id ("email")).sendKeys("john@cb.admin.amrita.edu");   
            try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    driver.findElement(By.id ("pwd")).sendKeys("login") ;
    	    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    driver.findElement(By.id("Button")).submit();  
    	    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    title = driver.getTitle();
            Assert.assertTrue(title.contains("Admin Dashboard"));
        
        }
		@Test
		public void testEasy5() {
            driver.get("https://auems1.netlify.app/");
            String title = driver.getTitle();
            driver.findElement(By.id ("email")).sendKeys("hariharan@cb.amrita.edu");   
            try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    driver.findElement(By.id ("pwd")).sendKeys("login") ;
    	    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    
    	    driver.findElement(By.id("Button")).submit();  
    	    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    title = driver.getTitle();
            Assert.assertTrue(title.contains("Department Dashboard"));
        
        }
		@Test
		public void testEasy6() {
            driver.get("https://auems1.netlify.app/");
            String title = driver.getTitle();
            driver.findElement(By.id ("email")).sendKeys("john@cb.admin.amrita.edu");   
    	    
    	    driver.findElement(By.id ("pwd")).sendKeys("login1") ;
    	    
    	    driver.findElement(By.id("Button")).submit();  
    	    title = driver.getTitle();
            Assert.assertTrue(title.contains("Login"));
        
        }
		@Test
		public void testEasy7() {
            driver.get("https://auems1.netlify.app/");
            String title = driver.getTitle();
            driver.findElement(By.id ("email")).sendKeys("hariharan@cb.admin.amrita.edu");   
    	    
    	    driver.findElement(By.id ("pwd")).sendKeys("login1") ;
    	    
    	    driver.findElement(By.id("Button")).submit();  
    	    title = driver.getTitle();
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