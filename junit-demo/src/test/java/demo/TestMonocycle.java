package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMonocycle {
	Wheel wheel;

	@BeforeEach
	void setUp() {
		wheel = Mockito.mock(Wheel.class);
		Mockito.when(wheel.getWeight()).thenReturn(100);
	}

	@Test
	void testGetWeightWheelNull() {
		final Monocycle c = new Monocycle();
		assertEquals(300, c.getWeight());
	}

	@Test
	void testGetWeightWheelNotNull() {
		final Monocycle c = new Monocycle();
		c.setWheel(wheel);
		assertEquals(400, c.getWeight());
	}
}
