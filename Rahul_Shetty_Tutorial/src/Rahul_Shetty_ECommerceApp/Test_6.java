package Rahul_Shetty_ECommerceApp;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_6 
{
	//public static AndroidDriver<AndroidElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		 AndroidDriver<AndroidElement> driver;
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "aqjrmjsoaqqkbude");
		 cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability("chromedriverExecutable", "C://Users/amrut/AppData/Roaming/npm/node_modules/appium/node_modules/appium-chromedriver/chromedriver/win/chromedriver.exe");
		 //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		 cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
		 cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".SplashActivity");
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);	
		 driver.findElementByAndroidUIAutomator("text(\"Enter name here\")").sendKeys("Amrut");
		 driver.hideKeyboard();
		 driver.findElementByAndroidUIAutomator("text(\"Let's  Shop\")").click();
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
		 driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		 TouchAction t = new TouchAction(driver);
		 WebElement webStore =  driver.findElementById("com.androidsample.generalstore:id/btnProceed");
		 t.tap(tapOptions().withElement(element(webStore))).perform();
		 Set<String> contexts = driver.getContextHandles();
		 Thread.sleep(4000);
		 for(String contextName : contexts)
		 {
			 System.out.println(contextName);
		 }
		 driver.context("WEBVIEW_com.androidsample.generalstore");
		 driver.findElement(By.xpath("//input[@class = 'gLFyf']")).sendKeys("appium");	
		 driver.findElement(By.xpath("(//button[@ type = 'button'])[3]")).click();
	}
}

