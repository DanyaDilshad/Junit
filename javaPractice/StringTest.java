package javaPractice;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {

	@BeforeAll
	static void beforeAllTest(){
		System.out.println("Initializing tests...");
	}
	
	@AfterAll
	static void afterAllTest() {
		System.out.println("Ending tests...");
	}
	
	@BeforeEach
	void beforeTest() {
		System.out.println("Before the test...");
	}
	
	@AfterEach
	void afterTest() {
		System.out.println("After the test...");
	}

	
	@Test
	@DisplayName("When string is ABCD")
	void lengthTest() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		assertEquals(expectedLength,actualLength);
	}
	
	@Test
	@DisplayName("When String is AbcdE ")
	void upperCase() {
		String str = "AbcdE";
		String res = str.toUpperCase();
		assertNotNull(res);
		assertEquals("ABCDE",res);
	}
	
	@Test
	@DisplayName("When String is AbcdE and substring is cd")
	void trueTest() {
		String str = "AbcdE";
		boolean res = str.contains("cd");
		assertTrue(res);
	}
	

	@Test
	@DisplayName("When String is AbcdE and substring is bc")
	void falseTest() {
		String str = "AbcdE";
		boolean res = str.contains("bd");
		assertFalse(res);
	}
	
	@SuppressWarnings("null")
	@Test
	@DisplayName("String is null")
	void exceptionTest() {
		String p = null;
		assertThrows(NullPointerException.class,()->{p.length();});
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"abcd", "abc", "def", "cd"})
	void moreThanOneCharecter(String str) {
		assertTrue(str.length()>0);
	}
	
	
}
