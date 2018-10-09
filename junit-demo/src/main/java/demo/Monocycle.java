package demo;

public class Monocycle {
	Wheel wheel;

	public Monocycle() {
		super();
	}

	public void setWheel(final Wheel newWheel) {
		wheel = newWheel;
	}

	/**
	 * @return The weight of the cycle (300g) + the weight of its wheel.
	 */
	public int getWeight() {
		final int weight = 300;
		if(wheel == null || wheel.getWeight() <= 0) {
			return weight;
		}
		return wheel.getWeight() + weight;
	}
}
