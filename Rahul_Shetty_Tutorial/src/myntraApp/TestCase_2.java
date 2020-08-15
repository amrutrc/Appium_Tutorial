package myntraApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase_2 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		 AndroidDriver<AndroidElement> driver;
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
		 cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.myntra.android");
		 cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.myntra.android.SplashActivity");
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);	
		 driver.findElementByClassName("android.widget.TextView").click();
		 driver.findElementByXPath("//android.widget.TextView[@text = 'Log In   .   Sign Up']").click();
		 driver.findElementByXPath("//android.widget.TextView[@ text = 'Google']").click();
		 driver.findElementById("com.google.android.gms:id/account_name").click();
		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		 String name = driver.findElementByXPath("//android.widget.TextView[@ text = 'Amrut']").getText();
		 System.out.println("Name is :: "+name);
		 driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.view.ViewGroup[@ content-desc = 'leftElement']").click();
		 driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.view.ViewGroup[@ content-desc = 'leftElement']").click();
		 driver.findElementByXPath("//*[@ text = 'Men']").click();
		 driver.findElementByAndroidUIAutomator("text(\"Topwear\")").click();
	}
}
