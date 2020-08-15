import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class gestures extends Base 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@ text ='Views']").click();
		
		WebElement expandableList = driver.findElementByXPath("//android.widget.TextView[@ text ='Expandable Lists']");
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(expandableList))).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@ text ='1. Custom Adapter']").click();
		
		WebElement pn = driver.findElementByXPath("//android.widget.TextView[@ text ='People Names']");
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		//driver.findElementById("android:id/title").isDisplayed();
		driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").isDisplayed();
		
	}
}
