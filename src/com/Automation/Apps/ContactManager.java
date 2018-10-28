package com.Automation.Apps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ContactManager {
	static AndroidDriver<AndroidElement> driver;
	static DesiredCapabilities capabilities = new DesiredCapabilities();

	@BeforeTest
	public static void SetUp() throws MalformedURLException, InterruptedException {
		File app = new File("App//ContactManager.apk");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test
	public static void AppLogin() throws InterruptedException {
		driver.findElementByAndroidUIAutomator("text(\"Add Contact\")").click();
		driver.findElementById("com.example.android.contactmanager:id/contactNameEditText").sendKeys("Will Smith");
		driver.findElementById("com.example.android.contactmanager:id/contactPhoneEditText").sendKeys("7898767865");
		driver.findElementById("com.example.android.contactmanager:id/contactPhoneTypeSpinner").click();
		driver.findElementByXPath("//android.widget.CheckedTextView[@index='2']").click();
		driver.findElement(MobileBy.id("com.example.android.contactmanager:id/contactEmailEditText"))
				.sendKeys("Willsmith@gmail.com");
		driver.findElementById("com.example.android.contactmanager:id/contactEmailTypeSpinner").click();
		driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@index='3']")).click();
		driver.findElementByAndroidUIAutomator("text(\"Save\")").click();
		driver.findElementById("com.example.android.contactmanager:id/showInvisible").click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
