package com.zarriacook.innerclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class TestInnerClass {

	@Test
	void testInnerMethod() {
		String data = "test";
		String actual = data;
		String expected = "test";
		assertEquals(actual,expected,("Error"));
	}

}
