package Flipkartapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase_01 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		 AndroidDriver<AndroidElement> driver;
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
		 cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.flipkart.android");
		 cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.flipkart.android.activity.HomeFragmentHolderActivity");
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);	
		 driver.findElementByAndroidUIAutomator("text(\"English\")").click();
		 driver.findElementById("com.flipkart.android:id/select_btn").click();		
		 driver.findElementsById("com.google.android.gms:id/credential_primary_label").get(0).click();
		 driver.findElementById("com.flipkart.android:id/button").click();
		 MobileElement mobileElement = (MobileElement)driver.findElementByXPath("//android.widget.ImageButton[@ content-desc = 'Open Drawer']");
		 WebDriverWait wait = new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.visibilityOf(mobileElement));
		 mobileElement.click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"My Account\"))").click();
	}
}
