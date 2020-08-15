package ApiDemos;

import java.net.MalformedURLException;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrolling_1 extends api_demo_real_device
{
	public static void main(String[] args) throws MalformedURLException 
	{
		 AndroidDriver<AndroidElement> driver = Capabilities();
		
		 driver.findElementByXPath("//android.widget.TextView[@content-desc='Auto Complete']").click();		 
		 List<AndroidElement> element = driver.findElementsById("android:id/text1");
		 for(AndroidElement e1 : element)
		 {
			System.out.println(e1.getText());
		 }
		 driver.findElementsByClassName("android.widget.TextView").get(1).click();
		 driver.findElementById("io.appium.android.apis:id/edit").sendKeys("india");	
	}
}
