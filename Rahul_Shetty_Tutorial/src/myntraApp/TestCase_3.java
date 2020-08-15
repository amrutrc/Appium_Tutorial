package myntraApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase_3 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
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
		 
		 driver.findElementByXPath("//android.widget.Button[@ content-desc = 'tabButton_profile']").click();
		 driver.findElementByAndroidUIAutomator("text(\"LOG IN/SIGN UP\")").click();
		 driver.findElementByXPath("//android.widget.EditText[@ content-desc = 'mobile']").sendKeys("9019388795");
		 driver.findElementByAndroidUIAutomator("text(\"CONTINUE\")").click();
		 driver.findElementByAndroidUIAutomator("text(\"OTP\")").click();
		 Thread.sleep(4000);
		 boolean text_displayed = driver.findElementByXPath("//android.widget.TextView[@ text = 'Amrut']").isDisplayed();
		 if(text_displayed == true )
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
		 
		 Thread.sleep(2000);
		  
		 driver.findElementByXPath("//android.widget.Button[@ content-desc = 'tabButton_home']").click();
		 
		 
		 
		 
		 //AndroidElement element = driver.findElementByXPath("//android.view.ViewGroup[@ content-desc = 'LOG OUT']");
		 
		 
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"LOG OUT\"))");
		 
		 
		 
		 
		 //driver.findElementByClassName("android.widget.TextView").click();
//		 driver.findElementByClassName("android.widget.TextView").click();
//		 driver.findElementByXPath("//android.widget.TextView[@text = 'Log In   .   Sign Up']").click();
//		 driver.findElementByXPath("//android.widget.TextView[@ text = 'Google']").click();
//		 driver.findElementById("com.google.android.gms:id/account_name").click();
//		 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
//		 String name = driver.findElementByXPath("//android.widget.TextView[@ text = 'Amrut']").getText();
//		 driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
//		 driver.findElementByXPath("//android.view.ViewGroup[@ content-desc = 'leftElement']").click();
//		 driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
//		 //driver.findElementByXPath("(//android.widget.ImageView)[2]").click();
//		 driver.findElementByClassName("(android.widget.ImageView)[2]").click();
	}
}
