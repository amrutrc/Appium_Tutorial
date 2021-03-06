package Rahul_Shetty_ECommerceApp;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_4 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		 AndroidDriver<AndroidElement> driver;
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
		 cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
		 cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".SplashActivity");
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 WebElement element = driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");
		 TouchAction t = new TouchAction(driver);
		 t.tap(tapOptions().withElement(element(element))).perform();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		 driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("ARC");
		 driver.hideKeyboard();
		 driver.findElementByAndroidUIAutomator("text(\"Female\")").click();
		 driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		 int element1 = driver.findElementsByXPath("//*[@ text = 'ADD TO CART']").size();
		 System.out.println(element1);
		 for(int i = 0;i<element1;i++)
		 {
			 driver.findElementByXPath("//*[@ text = 'ADD TO CART']").click();
		 }
		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		 driver.findElementByClassName("android.widget.FrameLayout").click();
		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		 
		 String amt_1 = driver.findElementByAndroidUIAutomator("text(\"$160.97\")").getText();
		 double amt_1_value = getAmt(amt_1);
		 
		 String amt_2 = driver.findElementByAndroidUIAutomator("text(\"$120.0\")").getText(); 
		 double amt_2_value = getAmt(amt_2);
		 
         double sum_value = amt_1_value+amt_2_value;
         
		 String final_amt = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
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
