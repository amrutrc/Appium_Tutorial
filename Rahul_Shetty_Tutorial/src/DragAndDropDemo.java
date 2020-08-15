import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class DragAndDropDemo extends Base
{
	public static void main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@ text ='Views']").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		TouchAction t = new TouchAction(driver);
		//Long press on the source circle and move and release to the destination circle
		//WebElement source = driver.findElementsByClassName("android.view.View").get(0);	
		//WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
		WebElement source = driver.findElementsByXPath("(//android.view.View)").get(0);	
		WebElement destination = driver.findElementsByXPath("(//android.view.View)").get(1);
		//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		t.longPress(element(source)).moveTo(element(destination)).release().perform();
	}
}
