package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilitiesTest {

	@Test
	void testIsPrime() {
		assertTrue(Utilities.isPrime(13)); 
	}

	@Test
	void testIsEven() {
		assertTrue(Utilities.isEven(80)); 
	}

}
