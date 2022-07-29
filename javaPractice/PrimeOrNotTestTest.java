package javaPractice;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import source.PrimeOrNot;

class PrimeOrNotTest {
	
	PrimeOrNot p = new PrimeOrNot();
	
	@ParameterizedTest
	@CsvSource(value = {"true, 2", "true, 3", "true, 5", "true, 13", "false, 4", "false, 8", "false, 22" })
	void primeTest(Boolean result, int a) {
		assertEquals(result,PrimeOrNot.check(a));
	}

}
