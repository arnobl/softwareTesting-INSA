package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestNumberSetUp {
	  Number nb;

	  @BeforeEach
	  public void setUp() {
	    nb = new Number(6);
	  }

	  @Test
	  void testMultiply() {
	    assertEquals(18., nb.multiply(3.), 0.0001);
	  }

	  @Test
	  void testDivide() {
	    assertEquals(2., nb.divide(3.), 0.0001);
	  }

	  @Test
	  void testDivideByZero() throws NumberFormatException {
		  assertThrows(NumberFormatException.class, () -> nb.divide(0d));
	  }
}
