package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestNumber {
	Number nb;

	@BeforeEach
	void setUp() {
		nb = new Number(2);
	}

	@Test
	void testMultiplyIntWith0() {
		final double res = nb.multiply(0d);
		assertEquals(0d, res, 0.00001);
	}

	@Test
	void testMultiplyTwoNeg() {
		final Number nb = new Number(-2);
		final double res = nb.multiply(-4d);
		assertEquals(8d, res, 0.00001);
	}

	@Test
	void testMultiplyOneNeg() {
		final double res = nb.multiply(-4d);
		assertEquals(-8d, res, 0.00001);
	}

	@Test
	void testDivide2Positive() {
		final double res = nb.divide(4d);
		assertEquals(2d / 4d, res, 0.00001);
	}

	@Test
	void testDivideByZero() {
		assertThrows(NumberFormatException.class, () -> nb.divide(0d));
	}

	@Test
	void testDivideByNaN() {
		assertThrows(NumberFormatException.class, () -> nb.divide(Double.NaN));
	}

	@Test
	void testDivideByInfinite() {
		assertThrows(NumberFormatException.class, () -> nb.divide(Double.POSITIVE_INFINITY));
	}
}