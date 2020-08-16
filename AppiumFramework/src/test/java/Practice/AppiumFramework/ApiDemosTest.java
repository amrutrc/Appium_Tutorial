package Practice.AppiumFramework;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ApiDemosTest extends Base
{	
	@Test
	public void apiDemo() throws IOException
	{
		AndroidDriver<AndroidElement> driver = Capabilities("apiDemo");
		//Xpath - Core Attributes are :: Index,Text,Resource-Id,Class,Package
		//Class Name can serve as TagName
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);	
		driver.findElementByXPath("//android.widget.TextView[@text ='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text ='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByXPath("//android.widget.TextView[@text ='WiFi settings']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hi");
		driver.findElementByXPath("(//android.widget.Button)[2]").click();
		//driver.findElementsByClassName("//android.widget.Button").get(1).click();	
	}
}