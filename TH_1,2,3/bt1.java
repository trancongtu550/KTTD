package TH_16_10;


	import org.openqa.selenium.By;

	import org.testng.annotations.Test;

	//import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
	public class bt1 extends Astractclass {

	    public static void main(String[] args) {        
	                        
//	        System.setProperty("webdriver.chrome.driver", "D:\\New_folder\\chromedriver.exe");
//	        WebDriver driver = new ChromeDriver();
//	        String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
//	        driver.get(baseUrl);
	        
	        
	        
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";        
	        actualTitle = driver.getTitle();

	        
	        if (actualTitle.contentEquals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	                
	        //driver.close();
	    }
	    @Test(priority = 1)
	    public static void register() {
	        driver.findElement(By.linkText("REGISTER")).click();
	        String expectedTitle = "Register: Mercury Tours";
	        String actualTitle = "";        
	        actualTitle = driver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	    }
	    @Test(priority = 2)
	    public static void backhome() {
	        driver.findElement(By.linkText("Home")).click();
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";        
	        actualTitle = driver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	    }
	    @Test(priority = 3)
	    public static void support() {
	        driver.findElement(By.linkText("SUPPORT")).click();
	        String expectedTitle = "Under Construction: Mercury Tours";
	        String actualTitle = "";        
	        actualTitle = driver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	    }
	    @Test(priority = 4)
	    public static void backhome1() {
	        driver.findElement(By.linkText("Home")).click();
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";        
	        actualTitle = driver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	    }
	            

	}