package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckOutPage 
{
	AndroidDriver<AndroidElement>driver;
	public CheckOutPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver= driver;
	}

	
	 //String amt_1 = driver.findElementByAndroidUIAutomator("text(\"$160.97\")").getText();
//	 @AndroidFindBy(uiAutomator = "text(\"$160.97\")")
//	 public WebElement value1 ; 
//	
//	 //String amt_2 = driver.findElementByAndroidUIAutomator("text(\"$120.0\")").getText();
//	 @AndroidFindBy(uiAutomator = "text(\"$160.97\")")
//	 public WebElement value2; 
	 
	 @AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
	 public WebElement totalAmount;
	
	public WebElement value1(String text)
	{
		return (driver.findElementByAndroidUIAutomator("text(\""+text+"\")"));
	}
	
	public WebElement value2(String text)
	{
		return (driver.findElementByAndroidUIAutomator("text(\""+text+"\")"));
	}
	
	public WebElement totalAmt()
	{
		return totalAmount;
	}
}
