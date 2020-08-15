package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLogincarLoan --->");
	}

	@Parameters({"URL", "APIKey/userName"})
	@Test
	public void MobileSignInCarLoan(String urlname, String key)
	{
		System.out.println("MobileSignInCarLoan --->");	
		System.out.println(urlname);
		System.out.println(key);
		
	}
	
	@Test(dataProvider = "getData")
	public void MobileSignOutCarLoan(String userName, String passWord)
	{
		System.out.println("MobileSignOutCarLoan --->");
		System.out.println(userName);
		System.out.println(passWord);
	}
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Before Suite");	
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st -username and password --- good credit history 
	   //2nd - username and password --- no credit history 
	  //3rd  - fraudelent - credit history
		
		//1st set
	  Object[][] data = new Object[3][2];
	  data[0][0] = "firstsetusername";
	  data[0][1] = "firstpassword";
	  //columns in the row are nothing but values for that particular comnbination(row)
	  
	  //2nd set 
	  data[1][0] = "secondusername";
	  data[1][1] = "secondpassword";
	  
	  //3rd set 
	  data[2][0] = "thirdusername";
	  data[2][1] = "thirdpassword";
	  return data;
	}
}
