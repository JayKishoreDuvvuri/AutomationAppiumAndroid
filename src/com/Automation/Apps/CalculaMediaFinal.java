package com.Automation.Apps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculaMediaFinal {

	static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) throws MalformedURLException {

		File app = new File("App//CalculaMediaFinal.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys("100");
		driver.findElement(MobileBy.xpath("//android.widget.EditText[@index='3']")).sendKeys("200");
		driver.findElement(MobileBy.id("com.exemplo.calculamediafinal:id/txtNota3")).sendKeys("300");
		driver.findElementByXPath("//android.widget.Button[@index='6']").click();
	}

}
