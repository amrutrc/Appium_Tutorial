package Practice.AppiumFramework;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckOutPage;
import pageObjects.FormPage;
import pageObjects.MiddlePage;


public class GeneralStoreTest extends Base
{	
	@Test
	public void totalValidation() throws IOException
	{	
		 startServer();
		 AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");
		 FormPage formpage = new FormPage(driver);
		 
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 
		 WebElement element = formpage.getCountryDropDown();
		 TouchAction t = new TouchAction(driver);
		 t.tap(tapOptions().withElement(element(element))).perform();
		 Utilities u = new Utilities(driver);
		 u.scrollToText("India");
		 
		 formpage.getNameField().sendKeys("ARC");
		 driver.hideKeyboard();
		 formpage.getFemaleOption().click();
		 
		 formpage.getButton().click();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 
		 MiddlePage midpage = new MiddlePage(driver); 
		 int element1 = driver.findElementsByXPath("//*[@ text = 'ADD TO CART']").size();
		 System.out.println(element1);
		 for(int i = 0;i<element1;i++)
		 {
			 driver.findElementByXPath("//*[@ text = 'ADD TO CART']").click();
		 }
		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		 midpage.cartIcon().click();
		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		 //CheckOut Page 
		 CheckOutPage  checkoutpage = new CheckOutPage(driver);
		 String amt1 = checkoutpage.value1("$160.97").getText();
		 double amt_1_value = getAmt(amt1);
		 String amt2 = checkoutpage.value2("$120.0").getText();
		 double amt_2_value = getAmt(amt2);
		 double sum_value = amt_1_value+amt_2_value;
         String final_amt = checkoutpage.totalAmt().getText();
		 double final_amt_value = getAmt(final_amt);
		 System.out.println(final_amt_value);
		 if(final_amt_value == sum_value)
		 {
		 System.out.println("Both are same");
		 }
		 else
		 {
		 System.out.println("Both are not same"); 
		 }
}

	
public static double getAmt(String value)
{
	 value = value.substring(1);
	 double amt_value = Double.parseDouble(value);
	 //System.out.println(amt_1_value);
	 return amt_value;
}
}
