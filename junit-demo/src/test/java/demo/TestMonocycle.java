package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMonocycle {
	Wheel wheel;
	Monocycle c;

	@BeforeEach
	void setUp() {
		c = new Monocycle();
		wheel = Mockito.mock(Wheel.class);
		Mockito.when(wheel.getWeight()).thenReturn(100);
	}

	@Test
	void testGetWeightWheelNull() {
		assertEquals(300, c.getWeight());
	}

	@Test
	void testGetWeightWheelNotNull() {
		c.setWheel(wheel);
		assertEquals(400, c.getWeight());
		Mockito.verify(wheel, Mockito.atLeastOnce()).getWeight();
	}
}
