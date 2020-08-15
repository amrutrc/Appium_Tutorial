package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 
{
    @Test(groups = {"Smoke"})
	public void demo()
	{
		System.out.println("Hello");
	}
    
    @AfterTest
    public void aaaSecondTest()
    {
    	System.out.println("AfterTest");
    }	
    
    @AfterSuite
    public void tearDown()
    {
    	System.out.println("AfterSuite");
    }
}
