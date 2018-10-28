package com.Automation.Apps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidSampleApp {
	static AndroidDriver<AndroidElement> driver;
	static DesiredCapabilities capabilities = new DesiredCapabilities();

	@BeforeMethod
	public static void SetUp() throws MalformedURLException, InterruptedException {
		File app = new File("App//android-sample-app.apk");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test(priority = 1)
	public static void Addition() {
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").sendKeys("200");
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").sendKeys("100");
		driver.findElementByAndroidUIAutomator("text(\"+\")").click();
	}

	@Test(priority = 2)
	public static void Subtraction() {
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").sendKeys("500");
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").sendKeys("500");
		driver.findElementById("com.vbanthia.androidsampleapp:id/subtractButton").click();
	}

	@Test(priority = 3)
	public static void Multiplication() {
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").sendKeys("90");
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").sendKeys("10");
		driver.findElement(MobileBy.xpath("//android.widget.Button[@index='2']")).click();
	}

	@Test(priority = 4)
	public static void Division() {
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").sendKeys("100");
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").sendKeys("50");
		driver.findElementByXPath("//android.widget.Button[@content-desc='divisionButton']").click();
	}

	@Test(priority = 5)
	public static void ResetButton() {
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldLeft']").sendKeys("999999999");
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc='inputFieldRight']").sendKeys("11111111");
		driver.findElement(MobileBy.id("com.vbanthia.androidsampleapp:id/resetButton")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
