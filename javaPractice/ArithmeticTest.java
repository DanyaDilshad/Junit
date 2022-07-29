package javaPractice;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import source.arithmetic;

class ArithmeticTest {


	@ParameterizedTest
	@CsvSource(value = {"20,2,18", "5, 3, 2", "10, 4, 6", "7, 0, 7", " 6, 5,1", "4, 3, 1"})
	void addtest(int sum, int a, int b) {
		assertEquals(sum,arithmetic.add(a, b));
	}
	
	@ParameterizedTest
	@CsvSource(value = {"2, 4, 2", "3, 6, 3", "5, 18, 13", " 19, 20, 1", "5, 19, 14"})
	void diffrenceTest(int diff, int a, int b) {
		assertEquals(diff,arithmetic.sub(a, b));
	}
	
	@ParameterizedTest
	@CsvSource(value = {"8, 4, 2", "24, 6, 4", "15, 5, 3", " 20, 20, 1", "0, 19, 0"})
	void mulTest(int prod, int a, int b) {
		assertEquals(prod,arithmetic.multiply(a, b));
	}
	
	@ParameterizedTest
	@CsvSource(value = {"2, 4, 2", "1, 6, 4", "1, 5, 3", " 20, 20, 1", "2, 19, 9"})
	void quoTest(int prod, int a, int b) {
		assertEquals(prod,arithmetic.divide(a, b));
	}
	
	@ParameterizedTest
	@CsvSource(value = {"0, 4, 2", "2, 6, 4", "2, 5, 3", " 0, 20, 1", "1, 19, 9"})
	void remTest(int prod, int a, int b) {
		assertEquals(prod,arithmetic.rem(a, b));
	}
	
	@Test
	void exceptionTest() {
		assertThrows(ArithmeticException.class, ()->arithmetic.divide(1, 0));
	}
}
