package generics;

public class MaximumOfThree {
	Integer x, y, z;

	public Integer maximum(Integer x, Integer y, Integer z) {
		Integer value = x;
		if (y.compareTo(value) > 0)
			value = y;
		if (z.compareTo(value) > 0)
			value = z;
		return value;
	}
}