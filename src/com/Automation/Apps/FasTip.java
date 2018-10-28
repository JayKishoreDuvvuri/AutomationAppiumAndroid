package com.Automation.Apps;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FasTip extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
		driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("500");
		driver.findElementByAndroidUIAutomator("text(\"Calculate Tip\")").click();
	}
}
