package ui_validation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG_login {
	
	@BeforeTest
	public void LoginApplication()
	{
		System.out.println("Login to Application");
	}
	
	
	@AfterTest
	public void LogoutApplication()
	{
		System.out.println("Logout to Application");
	}
	
	@BeforeMethod
	public void connectDB()
	{
		System.out.println("COnnect with DB");
	}
	
	@AfterMethod
	public void disconnectFromDB()
	{
		System.out.println("Disconnect DB");
	}

	//@Test(priority=1, description="This is login Test", groups= "Regression")
	
	public void Test1()
	
	{
		System.out.println("Login Test1");

	}
	
	//@Test(priority=2, description="Logout successfully", groups= "SmokeTest")
	
	public void Test2()
	{
		System.out.println("Logout Test2");
	}

}
