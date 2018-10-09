   import static org.testng.Assert.assertTrue;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
    

public class CARS1 {
	
	      WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "c:\\qaclass\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://www.cargurus.com");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }

	    @Test
	    public void verfiyTitleOfCars() {
	        String actualTitle = driver.getTitle();
	        assertTrue(actualTitle.contains("CarGurus"));
	        
	    }
	    
	    @Test
	    public void SearchCarsForAZipCode() {
	        driver.findElement(By.id("dealFinderZipUsedId")).sendKeys("11554");
	        driver.findElement(By.id("dealFinderForm_0")).click();
	        String actualTitle = driver.getTitle();
	        assertTrue(actualTitle.contains("East Meadow, NY"));
	    }
	    @AfterClass
	    public void tearDown() {
	        driver.quit();        
	    }

	}



	
 

