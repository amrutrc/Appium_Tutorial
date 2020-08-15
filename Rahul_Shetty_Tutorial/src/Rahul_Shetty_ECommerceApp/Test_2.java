package Rahul_Shetty_ECommerceApp;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_2 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver;
//		 File appDir = new File("src");
//		 File app = new File(appDir, "General-Store.apk");
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
		 //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
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
		 driver.findElementByAndroidUIAutomator("text(\"Female\")").click();
		 driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 String text = driver.findElementByXPath("//android.widget.Toast").getAttribute("name");
		 //Name attribute for toast messsage will have the content 
		 System.out.println(text); 
	}
}
