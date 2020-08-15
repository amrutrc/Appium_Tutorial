package ApiDemos;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrolling_2 extends api_demo_real_device 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		 AndroidDriver<AndroidElement> driver = Capabilities();
		 driver.findElementByXPath("//android.widget.TextView[@content-desc='Auto Complete']").click();	
		 driver.findElementByAndroidUIAutomator("text(\"3. Scroll\")").click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Country:\"))");
		 driver.findElementById("io.appium.android.apis:id/edit").sendKeys("india");
	}
}
