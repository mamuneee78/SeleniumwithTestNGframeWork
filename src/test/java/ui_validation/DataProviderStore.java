package ui_validation;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderStore {
	
	
	@DataProvider(name= "Create")
	public Object[][] dataSet1(Method m)
	{
		Object[] [] testdata = null;
		
		if(m.getName().equals("test"))
		{
		testdata = new Object[][] 
			{{"username", "password"},
			{"username1", "password1"},
			{"username2", "password2"},
			{"username3", "password3"}};
			
		}
		else if (m.getName().equals("test1"))
		{
			testdata = new Object[][] 
			{{"username", "password", "test"},
			{"username1", "password1", "test1"},
			{"username2", "password2", "test2"},
			{"username3", "password3", "test3"}};
			
		}
		
		
		return testdata;
			
		
//			return new Object[][] {
//				{"username", "paaword", "test"},
//				{"username1", "paaword1", "test1"},
//				{"username2", "paaword2", "test2"},
//				{"username3", "paaword3", "test3"}};
			
			
	}
	
}
