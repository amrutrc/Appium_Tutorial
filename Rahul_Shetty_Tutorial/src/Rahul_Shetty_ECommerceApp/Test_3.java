package Rahul_Shetty_ECommerceApp;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_3 
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
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))").click();
		 int count = driver.findElementsByXPath("//*[@ text = 'ADD TO CART']").size();
		 String text = "";
		 System.out.println(count);
		 for(int i = 0 ;i<count;i++)
		 {
			  text = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
			 System.out.println(text);
			 if(text.equalsIgnoreCase("Jordan 6 Rings"))
			 {
				 driver.findElementById("com.androidsample.generalstore:id/productAddCart").click();
				 break;
			 }
		 }
		 driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();	
		 String cart_text = driver.findElementByAndroidUIAutomator("text(\"Jordan 6 Rings\")").getText();
		 System.out.println(cart_text);
		 if(cart_text.equals(text))
		 {
			 System.out.println("Both the elements are matching");
		 }
		 else
		 {
			 System.out.println("Both the elements are not matching");
		 }	 
	}
}

