package com.Automation.Apps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;

		File app = new File("App//FasTip.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();

		if (device.equals("real")) {
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		} else {
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelEmulator");
		}
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
	}

}