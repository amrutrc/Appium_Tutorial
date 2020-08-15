package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan --->");
	}

	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan --->");	
	}
	
	@Test(groups = {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan --->");
	}		
}
