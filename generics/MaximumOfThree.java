package generics;

public class MaximumOfThree {
	Float x, y, z;

	public Float maximum(Float x, Float y, Float z) {
		Float value = x;
		if (y.compareTo(value) > 0)
			value = y;
		if (z.compareTo(value) > 0)
			value = z;
		return value;
	}
}