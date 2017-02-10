package com.epam.lab10.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.epam.lab10.exceprion.IncorectNumberException;
import com.epam.lab10.simpleclass.Numbers;

public class NumberTest {
	Numbers numbers;

	@BeforeClass
	public static void setUpSum() {
		System.out.println("@BeforeClass - oneTimeSetUp");
	}

	@Before
	public void setUp() {
		numbers = new Numbers();
		System.out.println("@Before - setUp");
	}

	@Test
	public void getSumNumbersTest() {
		try {
			assertEquals(78, Numbers.getSumNumbers(12));

		} catch (IncorectNumberException e) {
			System.out.println(e);
		}
		System.out.println("@Test - testOneItemCalculator");
	}

	@Test(expected = IncorectNumberException.class)
	public void getSumNumbersTestException() throws IncorectNumberException {
		System.out.println("@Test - testOneItemCalculator");
		Numbers.getSumNumbers(-1);
	}

	@After
	public void tearDown() {
		System.out.println("@After - tearDown");
	}

	@AfterClass
	public static void tearDownSum() throws Exception {
		System.out.println("@AfterClass - oneTimeTearDown");
	}
}
