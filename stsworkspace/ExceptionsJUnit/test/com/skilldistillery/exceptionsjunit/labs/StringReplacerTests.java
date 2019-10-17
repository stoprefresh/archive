package com.skilldistillery.exceptionsjunit.labs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.exceptionsjunit.reference.BadInputException;

public class StringReplacerTests {
	StringReplacer sr;

	@Before
	public void setUp() {
		sr = new StringReplacer();
	}

	@After
	public void tearDown() {
		sr = null;
	}

	@Test
	public void test_null_input_for_BadInputException() {
		try {
			sr.replaceString(null, "String", "String");
			fail("Expected BadInputException at parameter Input");
		} catch (BadInputException e) {
		}

		try {
			sr.replaceString("String", null, "String");
			fail("Expected BadInputException at parameter toReplace");
		} catch (BadInputException e) {
		}

		try {
			sr.replaceString("String", "String", null);
			fail("Expected BadInputException at parameter replaceStr");
		} catch (BadInputException e) {
		}

		try {
			sr.replaceString(null, null, null);
			fail("Expected BadInputException across all parameters");
		} catch (BadInputException e) {
		}

	}

	@Test
	public void test_replaceString_replaces_input() {
		String input = "I am a String and an Object";
		String matchStr = "a ";
		String replacement = "###";
		String expected = "I am ###String and an Object";

		try {
			String output = sr.replaceString(input, matchStr, replacement);
			assertEquals(expected, output);
		} catch (BadInputException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test_replaceChar_replaces_input() {
		String input = "I am a String and an Object";
		char match = 'a';
		char replacement = '#';
		String expected = "I #m # String #nd #n Object";

		try {
			String output = sr.replaceChar(input, match, replacement);
			assertEquals(expected, output);
		} catch (BadInputException e) {
			fail(e.getMessage());
		}
	}
}
