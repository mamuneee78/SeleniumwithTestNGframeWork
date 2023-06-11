package ui_validation;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestMethod {

	@Test (enabled= false)  // this method for skip this as not complete
	public void skipTest1() 
	{
		System.out.println("Skip it as it is not complete");
	}
	
	
	@Test 
	public void skipTest2() 
	{
		System.out.println("Skip this Test2");
		throw new SkipException("Skip this Test2 forcefully"); // this method for forcefully skip
	}
	
	boolean b = true;
	@Test
	public void skipTest3() 
	{
		System.out.println("Skip this Test3");
		
		if (b==true) {
			System.out.println("Test3 is executed");
		}
		else
		{
			System.out.println("Test3 will not execute");
			throw new SkipException("Test3 will not execute");
		}
	}
	
	
	
}
