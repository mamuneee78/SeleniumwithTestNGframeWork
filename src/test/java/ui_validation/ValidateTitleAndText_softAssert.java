package ui_validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateTitleAndText_softAssert {
   
	@BeforeTest     // this method will get execute before test
	public void runBefore() {
		System.out.println("Run this before Tset");
	}
	
	@AfterTest   // this method will get execute after test
	public void runAFter() {
		System.out.println("Run this after Tset");
	}
    
    
	@Test       //Need to import from library
	public void titleTest() throws InterruptedException
	{
		
	  SoftAssert softassert = new SoftAssert();
	  
	  String expectedTitle = "Amazon.com. Spend less. Smile more.";
	  String expectedText = "Search Amazon";
	  
	  WebDriverManager.firefoxdriver().setup();
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com/");
	  String actualTitle =  driver.getTitle();
	  System.out.println("Title verify");
	  String actualText = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getAttribute("placeholder");
	  
	  softassert.assertEquals(actualTitle, expectedTitle);
	  System.out.println("Title verify done");
	  
	  softassert.assertEquals(actualText, expectedText, "Text validate done");
	  System.out.println("Text verify done");
	  
	  softassert.assertAll();
	  
	  

	  
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//button[text()=' Logg inn ']")).click();
//	  Thread.sleep(2000);
//      WebElement b = driver.findElement(By.id("phoneNumber"));
//			  b.click();
//			  b.sendKeys("01737337078");
//			  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Qctesting@123");
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//	  
	  
//	  Thread.sleep(5000);
//	  driver.close();	  
	  
	}

}
