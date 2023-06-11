package ui_validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationTittleByAssertion {
    
	@Test
	public void titleTest() throws InterruptedException
	{
	  String expectedTitle = "Restaurants - Dashboard";
	  WebDriverManager.firefoxdriver().setup();
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("https://frontend.ussbdpos.com/");
	  String actualTitle =  driver.getTitle();
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[text()=' Logg inn ']")).click();
	  Thread.sleep(2000);
      WebElement b = driver.findElement(By.id("phoneNumber"));
			  b.click();
			  b.sendKeys("01737337078");
			  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Qctesting@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  
//	  Thread.sleep(5000);
//	  driver.close();	  
	  
	}

}
