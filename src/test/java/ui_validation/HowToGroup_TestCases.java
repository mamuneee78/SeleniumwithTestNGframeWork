package ui_validation;



import org.testng.annotations.Test;

import common.SuiteAnnotation;


@Test (groups = "Sign-up")
public class HowToGroup_TestCases extends SuiteAnnotation 
{

			


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


