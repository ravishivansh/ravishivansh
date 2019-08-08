package com.javabykiran.keywordFrmework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyWordExample {

	static WebDriver driver;
	static WebDriverWait wait;

	public void open_Browser(String browserName) {
		System.out.println(1);
		try {
			if (browserName.equalsIgnoreCase("Firefox")) {
				System.out.println(2);
				driver = new FirefoxDriver();
			} /*
				 * else if (browserName.equalsIgnoreCase("chrome")) {
				 * System.out.println(2);
				 * System.setProperty("webdriver.chrome.driver",
				 * "D:/Jars/chromedriver.exe"); driver = new ChromeDriver(); }
				 * else if (browserName.equalsIgnoreCase("IE")) {
				 * System.setProperty("webdriver.ie.driver",
				 * "D:/Jars/IEDriverServer.exe"); driver = new
				 * InternetExplorerDriver(); }
				 */

			// HTMLUNITDRIVER

		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
		// qriting to excel sheet

	}

	public void enter_URL(String URL) {
		driver.navigate().to(URL);
	}

	public By locatorValue(String locatorTpye, String value) {
		int x = 0;
		By by;
		if ("id".equals(locatorTpye)) {
			x = 1;
		}
		if ("name".equals(locatorTpye)) {
			x = 2;
		}
		if ("xpath".equals(locatorTpye)) {
			x = 3;
		}
		if ("css".equals(locatorTpye)) {
			x = 4;
		}
		if ("linkText".equals(locatorTpye)) {
			x = 5;
		}
		if ("partialLinkText".equals(locatorTpye)) {
			x = 6;
		}

		switch (x) {
		case 1:
			by = By.id(value);
			break;
		case 2:
			by = By.name(value);
			break;
		case 3:
			by = By.xpath(value);
			break;
		case 4:
			by = By.cssSelector(value);
			break;
		case 5:
			by = By.linkText(value);
			break;
		case 6:
			by = By.partialLinkText(value);
			break;
		default:
			by = null;
			break;
		}

		return by;
	}
	/*
	 * 
	 * 
	 */
	// id // "ename" // kiran

	public void enter_Text(String locatorType, String value, String text) {
		System.out.println(locatorType);
		System.out.println(value);
		System.out.println(text);
		try {
			if (locatorType.equals("id")) {
				driver.findElement(By.id(value)).sendKeys(text);
			}
			if (locatorType.equals("xpath")) {
				driver.findElement(By.xpath(value)).sendKeys(text);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.format("No Element Found to enter text" + e);
		}

		// calling some method which writes into the excelsheet
		// send row and column
		// write pass or fail

	}

	public void click_On_Link(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void click_On_Button(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}

	public void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close_Browser() {
		driver.quit();
	}
}
