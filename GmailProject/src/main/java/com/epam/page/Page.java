package com.epam.page;

import org.openqa.selenium.support.PageFactory;

import com.epam.decorator.CustomFieldDecorator;
import com.epam.webdriver.DriverManager;

public abstract class Page {

	public Page() {
		PageFactory.initElements(new CustomFieldDecorator(DriverManager.getDriver()), this);
	}

}
