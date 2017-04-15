package com.epam.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.epam.util.Constants;

public class DriverManager {

	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>() {

		@Override
		protected WebDriver initialValue() {
			System.setProperty(Constants.DRIVER, Constants.DRIVER_REF);
			WebDriver instance = new ChromeDriver();
			instance.get(Constants.BASE_ADDRESS);
			instance.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			return instance;
		}
	};
	
	private DriverManager() {}

	public static WebDriver getDriver() {
		return webDriver.get();
	}

	public static void load(String url) {
		getDriver().get(url);
	}

	public static void close() {
		getDriver().close();
		getDriver().quit(); 
	}
}
