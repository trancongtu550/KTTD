package TH_237;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ex1 {
	public static String baseUrl= "http://demo.guru99.com/test/newtours/index.php";
	public static String driverPart = "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\chromedriver.exe";
	public static WebDriver driver;
	public static String expectedTitle = null;
	public static String actualTitle = null;
	
	@BeforeTest
	public void lauchBrower() {
		System.out.println("Open brower");
		System.setProperty("webdriver.chrome.driver", driverPart);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void homepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		  if (actualTitle.contentEquals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	}
	
	@Test(priority = 0)
	public void verifyRegister() {
		driver.findElement(By.linkText("REGISTER")).click();
		expectedTitle = "Register: Mercury Tours";
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
	        System.out.println("Test Passed!");
	    } else {
	        System.out.println("Test Failed");
	    }
	}
	
	@Test(priority = 1)
	public void verifySupport() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expectedTitle = "Under Construction: Mercury Tours";
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	}
	
	@AfterMethod
	public void goHomepage() {
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void endTask() {
		driver.close();
	}
}