package com.webdriverio.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebdriverioAPIPage {

	private WebDriver driver;

	By searchBox = By.xpath("//input[@type='text' and @name='search']");

	public WebdriverioAPIPage(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Searching the API for "Click"
	 */

	public void searchOfClickApi() {
		WebElement element = driver.findElement(searchBox);
		if (element.isDisplayed()) {
			element.sendKeys("Click");
		} else {
			System.out.println("Search isn't available");

		}
	}
	/* Displaying all links after Search */

	public void allLinksAfterSearch() {
		List<WebElement> searchlinks = driver.findElements(By.xpath("//nav[@class='apinav']"));
		System.out.println("Displaying all the links after Search ");
		for (WebElement link : searchlinks) {
			System.out.println("The links on the page after search are: " + '\n' + link.getText());

		}
	}

	/*
	 * Verifying the result with expected result Verying the click, doubleClick,
	 * leftClick, middleClick, rightClick
	 */
	public boolean verifyAction() {

		boolean testResult = true;

		List<String> expected = Arrays.asList("click", "doubleClick", "leftClick", "middleClick", "rightClick");

		List<WebElement> actual = driver.findElements(By.xpath("//div[@class='commands action active']/a"));
		System.out.println('\n'+"Verifying the click, doubleClick, leftClick, middleClick, rightClick action are returned");
		List<String> actualTexts = new ArrayList<String>();
		for (WebElement link : actual) {
			String searchresults = link.getText();
			actualTexts.add(searchresults);
		}

		for (String expectedText : expected) {
			if (actualTexts.contains(expectedText)) {

				System.out.println('\n' + " Passed :" + expectedText + "link is available on page after search.");
			} else {
				System.out.println('\n' + " failed :" + expectedText + "link is not available on page after search.");
				testResult = false;
			}
		}

		return testResult;
	}

}
