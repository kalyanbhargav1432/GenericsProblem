package generics;

public class MaximumOfThree<T extends Comparable<T>> {
	T[] array;

	public MaximumOfThree(T[] array) {
		this.array = array;
	}

	public T testMaximum() {
		return MaximumOfThree.testMaximum(array);
	}

	public static <T> void printMax(T value) {
		System.out.println("maximum value :" + value);
	}

	public static <T extends Comparable<T>> T testMaximum(T[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i].compareTo(array[j]) < 0) {
					T k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
		}
		MaximumOfThree.printMax(array[0]);
		return array[0];
	}
}