package generics;

public class MaximumOfThree {
	String x, y, z;

	public String maximum(String x, String y, String z) {
		String value = x;
		if (y.compareTo(value) > 0)
			value = y;
		if (z.compareTo(value) > 0)
			value = z;
		return value;
	}
}