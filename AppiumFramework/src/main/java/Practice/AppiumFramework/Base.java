
package Practice.AppiumFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base 
{
	public static AppiumDriverLocalService service;
	
	public void startServer()
	{
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	public static AndroidDriver<AndroidElement>  Capabilities(String appName) throws IOException
	{
		  FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Practice\\AppiumFramework\\global.properties");  
		  Properties prop = new Properties();
		  prop.load(fis);
		  AndroidDriver<AndroidElement> driver;
		
		  File appDir = new File("src");
		  File app = new File(appDir,(String) prop.get(appName));
		
		  DesiredCapabilities cap = new DesiredCapabilities();
		  String device = (String) prop.get("Device");
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		  cap.setCapability(AndroidMobileCapabilityType.VERSION, "9.0");
		  cap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
//		  cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
//		  cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".SplashActivity");
		  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		  cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
		  
		  return driver;
	}
	
	
	
	
}
