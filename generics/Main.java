package generics;

public class Main {
	public static void main(String[] args) {
		Integer[] arrayInt = { 12, 64, 5,44 };
		Float[] arrayFloat = { 92.94F, 34.55F, 65.64F,74.32F };
		String[] arrayString = { "Apple", "Banana", "Mango","Orange" };

		new MaximumOfThree<Integer>(arrayInt).testMaximum();
		new MaximumOfThree<Float>(arrayFloat).testMaximum();
		new MaximumOfThree<String>(arrayString).testMaximum();

	}
}