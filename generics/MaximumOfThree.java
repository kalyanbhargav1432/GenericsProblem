package generics;

public class MaximumOfThree<T extends Comparable<T>> {
	T x, y, z;

	public MaximumOfThree(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T testMaximum() {
		return MaximumOfThree.testMaximum(x, y, z);
	}

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T value = x;
		if (y.compareTo(value) > 0)
			value = y;
		if (z.compareTo(value) > 0)
			value = z;
		return value;
	}
}
