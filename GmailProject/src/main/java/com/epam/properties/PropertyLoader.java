package com.epam.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
	private Properties properties;

	public PropertyLoader(String path) {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUserName1() {
		return properties.getProperty("email1");
	}

	public String getUserName2() {
		return properties.getProperty("email2");
	}

	public String getUserName3() {
		return properties.getProperty("email3");
	}

	public String getPassword1() {
		return properties.getProperty("password1");
	}

	public String getPassword2() {
		return properties.getProperty("password2");
	}

	public String getPassword3() {
		return properties.getProperty("password3");
	}

	public String getRecipient() {
		return properties.getProperty("recipient");
	}

	public String getSubjectMessage() {
		return properties.getProperty("subjectMessage");
	}

	public String getBodyMessage() {
		return properties.getProperty("bodyMessage");
	}
}
