package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MiddlePage 
{
	AndroidDriver<AndroidElement>driver;
	public MiddlePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver= driver;
	}
	
	@AndroidFindBy(xpath  = "//*[@ text = 'ADD TO CART']")
	public WebElement addToCart; 
	
	@AndroidFindBy(className = "android.widget.FrameLayout")
	private WebElement cartIcon;
	
	
	
	public WebElement addToCart()
	{
		return addToCart;
	}
	
	public WebElement cartIcon()
	{
		return cartIcon;
	}

}	
	
	
	
//	 int element1 = driver.findElementsByXPath("//*[@ text = 'ADD TO CART']").size();
//	 System.out.println(element1);
//	 for(int i = 0;i<element1;i++)
//	 {
//		 driver.findElementByXPath("//*[@ text = 'ADD TO CART']").click();
//	 }
//	 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
//	 driver.findElementByClassName("android.widget.FrameLayout").click();
//	 driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	
	
	
	

