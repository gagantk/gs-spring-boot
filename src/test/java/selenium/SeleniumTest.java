package selenium;
		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;
public class SeleniumTest {
	private WebDriver driver;
	@Test				
	public void testEasy() {	
		driver.get("http://www.google.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
	    driver = new ChromeDriver(options);  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}