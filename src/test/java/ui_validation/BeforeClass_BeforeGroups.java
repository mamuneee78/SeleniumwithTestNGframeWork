package ui_validation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

import org.testng.annotations.Test;


@Test (groups = "Sign-up")
public class BeforeClass_BeforeGroups {
	
			@BeforeClass  // this method will execute before tests case of this class
			public void beforeClass()
			{
				System.out.println("execute before class");
				
			}
			
			@AfterClass   // this method will execute after tests case of this class
			public void afterClass()
			{
				System.out.println("execute after class");
				
			}
			
			@BeforeGroups("SmokeTest")  // Method will get executed before mentioned groups
			public void beforeGroups()
			{
				System.out.println("execute before Groups");
				
			}
			
			@AfterGroups("SmokeTest")   // Method will get executed after mentioned groups
			public void AfterGroups()
			{
				System.out.println("execute after Groups");
				
			}

			@Test(priority=2, groups= "Regression")
			
			public void Test1()
			
			{
				System.out.println("Test1");

			}
			
			@Test(priority=2, groups= "SmokeTest")
			
			public void Test2()
			{
				System.out.println("Test2");
			}
			
			@Test(groups= {"Regression","SmokeTest"})
			public void Test3()
			{
				System.out.println("Test3");
			}
			
			@Test(groups= {"retest", "Regression"})
			public void Test4()
			{
				System.out.println("Test4");
			}




	}


