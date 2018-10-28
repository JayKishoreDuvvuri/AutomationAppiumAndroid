## Automation Project :- Selenium-Appium-project in Android with Real Device
This project is written in java and will serve an example of implementing a Selenium Appium test project with Selenium 3.0 and Appium v1.9.0

### Steps for Installation :-
----------------------------
1. Java JDK--> Download Java 8 based on your computer 32 or 64 Bit and set the environment variables
-     JAVA_HOME---> C:\Program Files\Java\jdk1.8.0_121
-     PATH     ---> C:\Program Files\Java\jdk1.8.0_121\bin

2. Dowload android Studio from https://developer.android.com/studio/
	By default it comes with 2 packages-- 1) Android SDK  2) Android Studio
	
	* 2.1 By Default SDK will be installed in C:\Users\<<user>>\AppData\Local\Android\Sdk
	      sdk contains the required lib / softwares to run the Android Emulator
	* 2.2 Set ANDROID_HOME -->C:\Users\ahb\AppData\Local\Android\Sdk
	* 2.3 Under Sdk folder, we have several libraries, add those libraries to PATH Environment Variable
	-	PATH-->      C:\Users\ahb\AppData\Local\Android\Sdk\platform-tools
	-		     C:\Users\ahb\AppData\Local\Android\Sdk\tools
	-		     C:\Users\ahb\AppData\Local\Android\Sdk\tools\bin


3. Configure Virtual device:(EMULATOR)
	* 3.1 Open your android Studio from C:\Program Files\Android\Android Studio\bin\Studio64.exe or start->Program Files->Android                 Studio->Android Studio.exe
	* 3.2 from android studio go to Tools->AVD Manager 	
	* 3.3 Click on Create Virtual Device button from AVD Manager Window and create a virtual device and close it
	* 3.4 To open emulator  goto platform-tools, from the address bar copy the address/path/ location 
            (for eg:C:\Users\JAY\AppData\Local\Android\Sdk\platform-tools) and type cmd in start and paste it in cmd prompt
	* 3.5 emulator -avd <<DeviceName>> ex:  In Command prompt--> emulator -avd Pixel 
	                                           (OR) 
	*   You can also launch in Android Studio -->Tools-->AVD Manager-->Device and then Select 'Pixel-->Click Arrow button to launch'
 * Ex:C:\Users\JAY\AppData\Local\Android\Sdk\platform-tools> emulator -avd Pixel (now hit Enter) --->Pixel device emulator will open up.

To open  UI Automator viewer:- C:\Users\JAY\AppData\Local\Android\Sdk\tools\bin>uiautomatorviewer 
{To find/Locate elements}


4. Download Node.js
  * 4.1 https://nodejs.org/en/download/
  *	4.2  Unzip and install the software. by default it will be installed on C:\Program Files\nodejs
  *	4.3 Set Environment Variable -> NODE_HOME-->C:\Program Files\nodejs
  *	4.4 OS should know the location of npm  commands so add the bin dir of npm to PATH Variable
  *	    PATH-->C:\Program Files\nodejs\node_modules\npm\bin


5. Download Appium:
*	1) Appium Server -> common for all the clients
*	2) Appium Client ->(java, c#,ruby....)

*	5.1 To Install appium , Open command Prompt and type, 
         -   npm install -g appium (always install the stable version)
	 -   To uninstall appium -> npm uninstall -g appium
*	5.2 To start appium server , just open command prompt and type 'appium' and hit enter, You will see below message 
     -                 [Appium] Welcome to Appium v1.8.1
     -		       [Appium] Appium REST http interface listener started on 0.0.0.0:4723
     
     
6. Download Appium Client:
*   6.1 go to the official website - http://appium.io/downloads.html
*   6.2  go to selenium official website and download selenium jar files


7. Configure your eclipse project, Add the Selenium Jar files from the folder 'Referenced Libraries' and TestNG Jar files from TestNG    folder or download TestNG latest version.Download the Jar files from the GitHub https://github.com/JayKishoreDuvvuri/JarFiles to setup.


8. Click on the 'Projects' Tab and select 'Properties'. Hover to Java Build Path. Here click 'Add External Jars' button and add Jars accordingly. Click 'Apply and close'.


9. Ensure Java-Client Jar file 5.0.4 is added to your Eclipse. 


10. Download the Automation Project from Github https://github.com/JayKishoreDuvvuri/AutomationWunder and save it to your computers Desktop or shared drive. Rename the folder name from "AutomationWunder-master" to "AutomationWunder". Now Import this project into your eclipse as a Java project.


11. Open your Eclipse and hover to the tab 'File' at the Left top corner in Eclipse. Select "Open Projects from File system..." option. Click on the 'Directory' button and Select the Project which you have downloaded from GitHub and saved on your computer.Select the project from your computer and click 'Finish' button


12. Ensure your project 'AutomationWunder' is loaded with all the necessary Libraries. The Libraries are JRE System     
    Library[JavaSE-1.8], Referenced Libraries having all Selenium Jar files including Java-Client 5.0.4 Jar file and TestNG Library.
    
    
### Steps to SetUp 'AutomationWunder' Project in your Eclipse:-
---------------------------------------------------------------
* Check for the test cases in your project under the folder src and under the package com.Automation.Apps
  AutomationWunder--->src--->com.Automation.Apps--->Test cases
  
* Test cases are with names
  - AndroidSampleApp.java
  - Base.java
  - CalculaMediaFinal.java
  - ContactManager.java
  - FasTip.java
  
* The App folder contains all the Apk's

* If you want to run the test case in Emulator then change the test cases below with  "Anroid Device" to "Your Emulator Name"
     - Change  From:    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
     - To :             capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Your Emulator Name"); 
     - To check how to launch Emulator goto 3.3 to 3.5 above.
	      
* I Have run the test cases with Real Device (Samsung Galaxy Prime) with Android Version 5.0.

* Connect your real device(Mobile phone) with your computer with USB cable.

* Ensure the developer options and USB Debugging mode in your mobile phone is ON.
  Go to settings in mobile goto -> About phone/device--> Software info-->Build Number 
  and on Build number Tap 7 times and enable "developer options" and next Select Enable USB Debugging and turn it 'ON' in your Mobile.
  only if debugging opton is 'on' then only we can execute our scripts.

* Ensure Before running the Test case, Start your Appium Server by opening command prompt and type 'appium' and hit enter, Appium server   is started.

* you can open UIAutomatorviewer to locate elements in command prompt like below but to run the tests it is not needed to open.         
  C:\Users\JAY(Username)\AppData\Local\Android\Sdk\tools\bin>uiautomatorviewer 

* Open another command prompt and type 'adb devices' It will show you the list of devices(phone/Emulator) attached to you computer
  If you have problem, then in command Prompt execute these commands
 - c:/> adb kill-server
 - c:/> adb start-server
 - c:/> adb devices
 - Now the list of devices attached will be displayed to you.


### Steps to run the Test Cases in Selenium WebDriver:-
-------------------------------------------------------
* 1.) AndroidSampleApp.java -
  -    Pre-Requisites: Appium Server is on, Mobile connected to Computer via USB cable.
  -    Open the Test case 'AndroidSampleApp.java' in your eclipse.
  -    Click Run As --> TestNG Test 
  -    Apk tested: android-sample-app.apk
  -    To run the test case in Emulator change the line in the test case as below
  -    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device"); --> Change "Android Device" to "Emulator"
  -    Note: The Subtraction functionality '-' is not working in this APK
  
* 2.) CalculaMediaFinal.java -
  -    Pre-Requisites: Appium Server is on, Mobile connected to Computer via USB cable.
  -    Open the Test case 'CalculaMediaFinal.java' in your eclipse.
  -    Click Run As --> Java Application 
  -    Apk tested: CalculaMediaFinal.apk
  -    To run the test case in Emulator change the line in the test case as below
  -    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device"); --> Change "Android Device" to "Emulator"
  
* 3.) ContactManager.java -
  -    Pre-Requisites: Appium Server is on, Mobile connected to Computer via USB cable.
  -    Open the Test case 'ContactManager.java' in your eclipse.
  -    Click Run As --> TestNG Test 
  -    Apk tested: ContactManager.apk
  -    To run the test case in Emulator change the line in the test case as below
  -    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device"); --> Change "Android Device" to "Emulator" 
  
  
* 4.) FasTip.java -
  -    Pre-Requisites: Appium Server is on, Mobile connected to Computer via USB cable.
  -    Open the Test case 'FasTip.java' in your eclipse.
  -    Click Run As --> Java Application 
  -    Apk tested: FasTip.apk
  -    If you want to run this test case in Emulator then change the line in FasTip.java class as below
  -    AndroidDriver<AndroidElement> driver = capabilities("real"); --> Change "real" to "Your Emulator Name" 
  -   Note: Base.java class is used here as a parent class.FasTip.java used the concept of Inheritance by extending the Base.java class.
	
	
