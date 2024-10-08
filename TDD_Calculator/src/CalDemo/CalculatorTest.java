package CalDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator;
	@BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
	}

	@Test
	void testSubtract() {
		assertEquals(1, calculator.subtract(3, 2));
        assertEquals(5, calculator.subtract(2, -3));
	}

	@Test
	void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
	}

	@Test
	void testDivide() {
		 assertEquals(2.0, calculator.divide(6, 3));
	     assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
	}

}
