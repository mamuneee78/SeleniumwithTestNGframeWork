package ui_validation;

import org.testng.annotations.Test;

public class DataProviderMove {
	
	@Test(dataProvider = "Create", dataProviderClass = DataProviderStore.class)
	public void test(String username, String password) 
	{
		System.out.println(username + "===" + password);
	}
	
	@Test(dataProvider = "Create", dataProviderClass = DataProviderStore.class)
	public void test1(String username, String password, String test) 
	{
		System.out.println(username + "===" + password + "===" + test);
	}
	
	

}
