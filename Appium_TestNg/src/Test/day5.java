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
	
	@Test
	public void AA()
	{
		System.out.println("AA");
	}
	
	@Test
	public void BB()
	{
		System.out.println("BB");
	}
	
	@Test
	public void CC()
	{
		System.out.println("CC");
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
