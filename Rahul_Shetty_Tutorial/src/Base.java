import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base 
{
	//static AppiumDriver driver;
	//AndroidDriver<AndroidElement> 
	public static AndroidDriver<AndroidElement>  Capabilities() throws MalformedURLException
	{
		 AndroidDriver<AndroidElement> driver;
		
		 File appDir = new File("src");
		File app = new File(appDir,"General-Store.apk");
		
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
		  //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		  cap.setCapability(AndroidMobileCapabilityType.VERSION, "9.0");
		  cap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
		  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//		  cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "net.one97.paytm");
//		  cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.AJRMainActivity");
		  
		  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		  cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		   driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
		  
		  return driver;
	}
}
