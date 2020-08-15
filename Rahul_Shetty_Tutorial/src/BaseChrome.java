import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome 
{	
	public static AndroidDriver<AndroidElement>  Capabilities() throws MalformedURLException
	{
   AndroidDriver<AndroidElement> driver;
   DesiredCapabilities cap = new DesiredCapabilities();
   //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
   cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
   cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
   cap.setCapability("chromedriverExecutable", "C://Users/amrut/AppData/Roaming/npm/node_modules/appium/node_modules/appium-chromedriver/chromedriver/win/chromedriver.exe");
   driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
   return driver;
	}
}
