package common;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteAnnotation{
	
	@BeforeSuite
	public void DataProvider()
	{
		System.out.println("Print Befoer Suite");
	}
	
	@AfterSuite
	public void DataCleaner()
	{
		System.out.println("Print after Suite");
	}
	
}