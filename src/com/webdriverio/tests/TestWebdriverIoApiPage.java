package com.webdriverio.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webdriverio.base.TestBaselineSetup;
import com.webdriverio.pages.WebdriverioAPIPage;
import com.webdriverio.pages.WebdriverioMainPage;

public class TestWebdriverIoApiPage extends TestBaselineSetup {

	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();

	}

	/*
	 * This test method is to i)go to Webdriver io link ii)Click on the 'API'
	 * link in the top navigation bar iii)search the API for text "click"
	 * iv)Collecting and returning the link names in the left nav section that
	 * are returned as a result of the search. v)Verifying 5 action results are
	 * returned (click, doubleClick, leftClick, middleClick, rightClick).
	 */

	@Test
	public void verifyAPIPage() {
		System.out.println("API Page Testing for Webdriver Io ");
		WebdriverioMainPage mainPage = new WebdriverioMainPage(driver);
		WebdriverioAPIPage Apipage = new WebdriverioAPIPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(mainPage.clickOfLink("API"), "API link doesn't exist");
		Apipage.searchOfClickApi();
		Apipage.allLinksAfterSearch();
		Assert.assertTrue(Apipage.verifyAction(), "Search failed");
		driver.close();

	}

}
