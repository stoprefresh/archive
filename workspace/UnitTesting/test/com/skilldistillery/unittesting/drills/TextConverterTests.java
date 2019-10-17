package com.skilldistillery.unittesting.drills;

import static org.junit.Assert.*;

import org.junit.*;

public class TextConverterTests {
	
	private TextConverter tc;
	
	@Before
	public void setUp() {
		tc = new TextConverter();
	}
	@After
	public void tearDown() {
		tc = null;
	}
	// returns null for a null input String.
	@Test
	public void test_toCaps_returns_null_for_null_input() {
		String expected = null;
		assertEquals(expected, tc.toCaps(null));
	}

	@Test
	public void test_toCaps_returns_all_caps_version_of_inputString() {
		String expected = "HELLO";
		assertEquals(expected, tc.toCaps("hello"));
	}

	@Test
	public void test_removeOuterWhitespace_returns_null_for_a_null_inputString() {
		String expected = "";
	}

	@Test
	public void test_removeOuterWhitespace_returns_String_with_outer_whitespace_removed() {

	}

	@Test
	public void test_removeOuterWhitespace_returns_String_with_inner_whitespace_intact() {

	}

	@Test
	public void test_concatStrings_returns_null_for_a_null_inputString() {

	}

	@Test
	public void test_concatStrings_returns_empty_String_for_no_input() {

	}

	@Test
	public void test_concatStrings_returns_empty_String_for_empty_String_input() {

	}

	@Test
	public void test_concatStrings_returns_single_String_same_length_as_input_String() {

	}

	@Test
	public void test_concatStrings_returns_two_Strings_concatenated_without_extra_whitespace() {

	}

	@Test
	public void test_concatStrings_returns_two_Strings_concatenated_with_whitespace_intact() {

	}

}
