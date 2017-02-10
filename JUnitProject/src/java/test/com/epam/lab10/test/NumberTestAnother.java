package com.epam.lab10.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import com.epam.lab10.simpleclass.Numbers;

public class NumberTestAnother {
	public static final String PATH ="src\\java\\resource\\newfile.txt";
	Class<Numbers> classNumber = Numbers.class;
	Numbers number = new Numbers();
	Logger LOG = Logger.getLogger(NumberTestAnother.class);

	static {
		PropertyConfigurator.configure("src\\java\\resource\\log4j.properties.test");
	}	

	@Test
	public void test() {
		try {
			Method method = classNumber.getDeclaredMethod("checkPositiveNumber", int.class);
			method.setAccessible(true);
			assertEquals(2, method.invoke(null, -1));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	@Test
	public void fileCreation() throws IOException {
		number.fileCreation(PATH);
		File file = new File(PATH);
		assertFalse(file.createNewFile());
	}
	
	@Rule
    public TestWatcher watchman = new TestWatcher() {
		protected void failed(Throwable e, org.junit.runner.Description description) {
			 LOG.error("This test is failed");
		};
	};

}
