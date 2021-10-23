package TH_237;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex2 {
	public static String baseUrl= "http://demo.guru99.com/test/newtours/index.php";
	public static String driverPart = "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\chromedriver.exe";
	public static WebDriver driver;
	public static String expected = null;
	public static String actual = null;
	
	@BeforeTest
	public void lauchBrower() {
		System.out.println("Open brower");
		System.setProperty("webdriver.chrome.driver", driverPart);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority = 0)
	public void verifyRegister() {
	    WebElement dr = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    dr.click();
	    List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
	    for(int i = 0; i<childElements.size(); i++) {
	    	childElements.get(0).sendKeys("Tu");
	        childElements.get(1).sendKeys("Tran");
	        childElements.get(2).sendKeys("2931823822");
	        childElements.get(3).sendKeys("trancongtu550@gmail.com");

	        childElements.get(4).sendKeys("546");
	        childElements.get(5).sendKeys("TP.Thu Duc");
	        childElements.get(6).sendKeys("Phuoc Long A");
	        childElements.get(7).sendKeys("2931823822");

	        childElements.get(8).sendKeys("tutran");
	        childElements.get(9).sendKeys("congtu");
	        childElements.get(10).sendKeys("congtu");
	        break;
	    }
	    WebElement sb = driver.findElement(By.xpath("//*[@name='submit']"));
	    sb.click();
	    System.out.print("Passed !");
	    }
	
	@Test(priority = 1)
	public void verifyLogin() {
		WebElement login = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
        login.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size(); i++) {
            childElements1.get(0).sendKeys("baomai");
            childElements1.get(1).sendKeys("quocbao");
            break;
        }
        WebElement lg = driver.findElement(By.xpath("//*[@name='submit']"));
        lg.click();
	}
}