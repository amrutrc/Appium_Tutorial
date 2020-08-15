package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day2 
{
	@BeforeMethod
	public void d1()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test(groups = {"Smoke"})
	public void day2()
	{
		System.out.println("Day2 --->");
	}
	
	@Test
	public void Ddemo()
	{
		System.out.println("Day 2 --> Ddemo");	
	}
	
	@AfterMethod
	public void d2()
	{
		System.out.println("AfterMethod");
	}
	
	
	@BeforeTest
	public void aaaprerequisite()
	{
		System.out.println("BeforeTest");
	}
	
}
