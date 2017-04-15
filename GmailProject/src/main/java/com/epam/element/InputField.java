package com.epam.element;

import org.openqa.selenium.WebElement;

public class InputField extends Element {

	public InputField(WebElement webElement) {
		super(webElement);
	}

	public void fillIn(String text) {
		webElement.sendKeys(text);
	}

	public void imitationEnter() {
		webElement.submit();
	}
}
