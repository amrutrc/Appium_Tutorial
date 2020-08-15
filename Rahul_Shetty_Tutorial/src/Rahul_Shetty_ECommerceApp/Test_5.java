package Rahul_Shetty_ECommerceApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Test_5 
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
		 driver.findElementByAndroidUIAutomator("text(\"Enter name here\")").sendKeys("Amrut");
		 driver.hideKeyboard();
		 driver.findElementByAndroidUIAutomator("text(\"Let's  Shop\")").click();
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		 String text = driver.findElementByXPath("//android.widget.Toast").getText();
		 System.out.println(text);
		 driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
		 driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		 WebElement checkbox = driver.findElementByClassName("android.widget.CheckBox");
		 TouchAction t = new TouchAction(driver);
		 t.tap(tapOptions().withElement(element(checkbox))).perform();
		 WebElement terms_and_conditions = driver.findElementByXPath("//*[@ text = 'Please read our terms of conditions']");
		 t.longPress(longPressOptions().withElement(element(terms_and_conditions)).withDuration(ofSeconds(2))).release().perform();
		 driver.findElementById("android:id/button1").click();
		WebElement webStore =  driver.findElementById("com.androidsample.generalstore:id/btnProceed");
		t.tap(tapOptions().withElement(element(webStore))).perform();
	}
}


