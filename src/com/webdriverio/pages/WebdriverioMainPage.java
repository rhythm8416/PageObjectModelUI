package com.webdriverio.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * This Page Class is created to check for API link on the webdriver io site.
 * After locating it clicking on it.
 */
public class WebdriverioMainPage {

	private WebDriver driver;

	public WebdriverioMainPage(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Verifying the existance of mentioned link on Webdriver IO Web Page and
	 * click of the API Link. We will pass the link as a parameter in the test
	 * class
	 */

	public boolean clickOfLink(String link) {
		//Getting all links in the mainnav
		List<WebElement> allLinks = driver.findElements(By.xpath("//nav[@class='mainnav']/ul/li"));
		
		boolean isValid = false;
		//Verifying if specified link exists
		if (allLinks.size() > 0) {
			for (int i = 0; i < allLinks.size(); i++) {
				if (allLinks.get(i).getText().equals(link)) {
					System.out.println("Clicking on passed link " + link);
					allLinks.get(i).click();
					isValid = true;
					break;
				}
			}
		}
		return isValid;

	}

}
