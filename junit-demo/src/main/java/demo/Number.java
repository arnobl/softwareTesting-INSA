package demo;

public class Number {
	final double value;

	public Number(final int val) {
		super();
		value = val;
	}

	public double multiply(final double val) {
		return value * val;
	}

	public double divide(final double val) throws NumberFormatException {
		if(Double.compare(val, 0d) == 0 || Double.isNaN(val) || Double.isInfinite(val)) {
			throw new NumberFormatException();
		}
		return value / val;
	}
}