package ui_validation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation {
	
	@BeforeTest       // this method will get execute before test
	public void LoginApplication()
	{
		System.out.println("Login to Application");
	}
	
	
	@AfterTest         // this method will get execute after test
	public void LogoutApplication()
	{
		System.out.println("Logout to Application");
	}
	
	@BeforeMethod        // this method will get execute before every Test
	public void connectDB()
	{
		System.out.println("COnnect with DB");
	}
	
	@AfterMethod          // this method will get execute after every Test
	public void disconnectFromDB()
	{
		System.out.println("Disconnect DB");
	}

	@Test(priority=1, description="This is login Test")  // we can set priority and description as well
	
	public void Test1()
	
	{
		System.out.println("Login Test1");

	}
	
	@Test(priority=2, description="Logout successfully")
	
	public void Test2()
	{
		System.out.println("Logout Test2");
	}

}
