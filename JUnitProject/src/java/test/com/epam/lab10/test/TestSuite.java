package com.epam.lab10.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value = { NumberTestAnother.class, NumberTest.class })
public class TestSuite {
}
