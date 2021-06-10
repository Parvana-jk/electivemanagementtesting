package example;		

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;		
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		
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
    	 
            Assert.assertTrue(title.contains("Admin Dashboard"));
        
        }
		@Test
		public void testEasy6() {
            driver.get("https://auems1.netlify.app/loginform");
            driver.findElement(By.id("back-link")).click();
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            String title = driver.getTitle();
    	 
            Assert.assertTrue(title.contains("Admin Dashboard"));
        
        }
		@Test
		public void testEasy7() {
            driver.get("https://auems1.netlify.app/deptdashboard");
            driver.get("https://auems1.netlify.app/loginform");
            driver.findElement(By.id("back-link")).click();
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            String title = driver.getTitle();
    	 
            Assert.assertTrue(title.contains("Admin Dashboard"));
        
        }
		@Test
		public void testEasy8() {
			driver.findElement(By.id(("dropdown"))).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			driver.findElement(By.id(("logout"))).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 driver.findElement(By.id ("email")).sendKeys("hariharan@cb.amrita.edu");   
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    driver.findElement(By.id ("pwd")).sendKeys("login") ;
	    	    try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    driver.findElement(By.id("Button")).submit();  
	    	    try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    String title = driver.getTitle();
            Assert.assertTrue(title.contains("Department Dashboard"));
        
        }
		
		@Test
		public void testEasy9() {
			driver.findElement(By.id(("dropdown"))).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			driver.findElement(By.id(("logout"))).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 driver.findElement(By.id ("email")).sendKeys("hariharan@cb.amrita.edu");   
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    driver.findElement(By.id ("pwd")).sendKeys("login1") ;
	    	    try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    driver.findElement(By.id("Button")).submit();  
	    	    try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    String title = driver.getTitle();
            Assert.assertTrue(title.contains("Login"));
        
        }
		@Test
		public void testEasy10() {
			
			 driver.findElement(By.id ("email")).sendKeys("john@cb.admin.amrita.edu");   
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    driver.findElement(By.id ("pwd")).sendKeys("login1") ;
	    	    try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    driver.findElement(By.id("Button")).submit();  
	    	    try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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