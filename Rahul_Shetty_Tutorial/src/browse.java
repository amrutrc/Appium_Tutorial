import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browse extends BaseChrome
{
	public static void main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
//		driver.get("http://facebook.com");
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		driver.findElementByXPath("//a[text() = 'English (UK)']").click();
//		driver.findElementByXPath("//input[@ id = 'm_login_email']").sendKeys("9019388795");
//		driver.findElementByXPath("//input[@ id = 'm_login_password']").sendKeys("Test@1234");
//		driver.findElementByXPath("//button[@ value= 'Log In']").click();
		
		driver.get("http://cricbuzz.com");
		driver.findElementByXPath("//span[text() ='Menu ']").click();
		driver.findElementByCssSelector("a[title = 'Cricbuzz Home']").click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		jsp.executeScript("window.scrollBy(0,480)", "");
		driver.findElement(By.xpath("//h4[text() = 'Top Stories']")).getAttribute("class").contains("header");
		if(driver.findElement(By.xpath("//h4[text() = 'Top Stories']")).getAttribute("class").contains("header"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
