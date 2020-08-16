package Test;

import org.testng.annotations.Test;

public class day5 
{
	@Test(enabled = true)
	public void ADemo()
	{
		System.out.println("ADemo");
	}
	
	@Test(timeOut = 4000)
	public void EDemo()
	{
		System.out.println("EDemo");
	}
	
	@Test(dependsOnMethods = {"ADemo"})
	public void IDemo()
	{
		System.out.println("IDemo");
	}
	
	@Test(dependsOnMethods = {"ADemo","EDemo"})
	public void ODemo()
	{
		System.out.println("ODemo");
	}	
}