package Test1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class practice_1 
{
	@Test
	public void demo1()
	{
	System.out.println("Demo1");
	}
	
	@Test
	public void demo1A()
	{
		System.out.println("Demo1A");
	}
	
	@Test
	public void demo1B()
	{
		System.out.println("Demo1B");
	}
	
	
	@Test(groups = {"Smoke"})
	public void demo2()
	{
	System.out.println("Demo2");
	}	
	
	@BeforeSuite
	public void demo0()
	{
		System.out.println("Before Suite");
	}
}
