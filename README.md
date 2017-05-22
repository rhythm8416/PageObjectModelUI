# PageObjectModelUI
I have used Page object model for implementation of the UI automation exercise. 

**Here is the various classes description:**

- TestBaselineSetup Class: This the main class for page object model, where I have  created  Webdriver object based on the browser type passed as a parameter in textng.xml file. I have also passed the webdriver io  URL in testng.xml as parameter
	In this example I have taken only two browsers the default Firefox and chrome browser. I have executed my test using Google Chrome as I have higher versions of Firefox, which is 52 on my system. 

- Page classes:
	- WebdriverioAPIPage : This is the Page created for the API page of Webdriver io after user lands on http://webdriver.io/api.html_ page. I have defined the necessary page objects in this page and also written the required actions as per the requirement

	- WebdriverioMainPage : This is the main page of WebdriverIO site, here also I have provided the necessary actions as per the requirement.

	- Test Class:
TestWebdriverIoApiPage: This is the Test class created for all the verification and validation required .).

Below is the executed test run results with Chrome Browser:


Test Run Testng Report:

![alt text](https://github.com/rhythm8416/PageObjectModelUI/blob/master/readme-images/Test%20run%201.png)

Emailable  report :
 
 ![alt text](https://github.com/rhythm8416/PageObjectModelUI/blob/master/readme-images/Emailable%20report.png)



