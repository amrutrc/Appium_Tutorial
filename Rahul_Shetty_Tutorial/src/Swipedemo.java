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

public class Swipedemo extends Base
{
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement element = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(element))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		driver.findElementByAndroidUIAutomator("content-desc(\"9\")").click();
		//driver.findElementByXPath("//*[@content-desc='9']").click();
		TouchAction t1 = new TouchAction(driver);
		//longpress on element 
		WebElement element_15 = driver.findElementByXPath("//*[@ content-desc = '15']");
		WebElement element_45 = driver.findElementByXPath("//*[@ content-desc = '45']");
		t1.longPress(longPressOptions().withElement(element(element_15)).withDuration(ofSeconds(2))).moveTo(element(element_45)).release().perform();
	}
}
