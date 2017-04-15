package com.epam.util;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.webdriver.DriverManager;

public class Waiter {
	public static void waitForPage(String pageTitle){
		WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), 20);
		webDriverWait.until(ExpectedConditions.titleContains(pageTitle));
	}
}
