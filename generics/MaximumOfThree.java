package generics;

public class MaximumOfThree<T extends Comparable<T>> {
	T x, y, z;

	public T maximum(T x, T y, T z) {
		T value = x;
		if (y.compareTo(value) > 0)
			value = y;
		if (z.compareTo(value) > 0)
			value = z;
		return value;
	}
}
