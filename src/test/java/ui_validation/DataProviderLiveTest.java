package ui_validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderLiveTest {
	

	@Test(dataProvider = "dataSet1")
	public void test1(String username, String password) 
	{
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);	
	driver.findElement(By.id("login-button")).click();
	
	driver.close();
	}
	
	@DataProvider 
	public Object[][] dataSet1()
	{
		
		return new Object[][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"},
			{"performance_glitch_user", "secret_sauce"}
			};
		
		
		
	}
	
	
}
