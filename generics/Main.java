package generics;

public class Main {
	public static void main(String[] args) {
		Integer[] arrayInt = { 12, 34, 5 };
		Float[] arrayFloat = { 22.34F, 34.55F, 65.64F };
		String[] arrayString = { "Apple", "Banana", "Mango" };

		new MaximumOfThree<Integer>(arrayInt).testMaximum();
		new MaximumOfThree<Float>(arrayFloat).testMaximum();
		new MaximumOfThree<String>(arrayString).testMaximum();

	}
}