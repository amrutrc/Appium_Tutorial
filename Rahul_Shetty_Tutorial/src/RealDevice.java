import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevice 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		 AndroidDriver<AndroidElement> driver;
		 DesiredCapabilities cap = new DesiredCapabilities();
		 //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		 cap.setCapability(AndroidMobileCapabilityType.VERSION, "9.0");
		 cap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "net.one97.paytm");
		 cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.AJRJarvisSplash");
	     driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
  
		//return driver;
	}
}
