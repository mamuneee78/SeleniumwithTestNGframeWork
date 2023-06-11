package ui_validation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLearn {
	
	@Test(priority=2,dataProvider = "dataSet")
	public void test(String username, String password) 
	{
		System.out.println(username + "===" + password);
	}
	
	@Test(priority=1,dataProvider = "dataSet1")
	public void test1(String username, String password, String test) 
	{
		System.out.println(username + "===" + password + "===" + test);
	}
	
	@DataProvider
	public Object[][] dataSet1()
	{
		
		return new Object[][] {
			{"username", "paaword", "test"},
			{"username1", "paaword1", "test1"},
			{"username2", "paaword2", "test2"},
			{"username3", "paaword3", "test3"}};
		
		
	}
	
	
	
	@DataProvider
	public Object[][] dataSet()
	
	{
		Object[][] dataset = new Object[4][2];

		// first data
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";

		// second data
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";

		// third data
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";

		// third data
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";
		
		return dataset;
	}
}
