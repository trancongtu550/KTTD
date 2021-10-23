package TH_16_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bt2 extends Astractclass {
	

	@Test(priority = 0)
	public void VerifyRegister() {
	    WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    w.click();

	    List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
	    for(int i = 0; i<childElements.size();i++) {
	    	childElements.get(0).sendKeys("Tu");
	        childElements.get(1).sendKeys("Tran");
	        childElements.get(2).sendKeys("909909909");
	        childElements.get(3).sendKeys("trancongtu550@@gmail.com");

	        childElements.get(4).sendKeys("546");
	        childElements.get(5).sendKeys("Phuoc Long A");
	        childElements.get(6).sendKeys("TP. Thu Duc");
	        childElements.get(7).sendKeys("71208");

	        childElements.get(8).sendKeys("Tu550");
	        childElements.get(9).sendKeys("Tu546");
	        childElements.get(10).sendKeys("Tu550");
	        break;
	    }

	    WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
	    submit.click();

	    System.out.print("tao thanh cong!");
	    }
	@Test(priority = 1)
	public void VerifyLogin() {
		WebElement login = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
        login.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size();i++) {
            childElements1.get(0).sendKeys("Tu550");
            childElements1.get(1).sendKeys("Tu546");
            break;
        }

        WebElement submitlogin = driver.findElement(By.xpath("//*[@name='submit']"));
        submitlogin.click();
	}
	
}