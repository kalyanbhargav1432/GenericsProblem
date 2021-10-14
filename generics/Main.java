package generics;

public class Main {
	public static void main(String[] args) {
		MaximumOfThree maxOfThree1 = new MaximumOfThree(82, 44, 66);
		MaximumOfThree maxOfThree2 = new MaximumOfThree(82.55, 44.53, 66.35);
		MaximumOfThree maxOfThree3 = new MaximumOfThree("Apple", "Mango", "Banana");

		System.out.println("maximum Integer value:" + maxOfThree1.testMaximum());
		System.out.println("maximum Float value:" + maxOfThree2.testMaximum());
		System.out.println("maximum String value:" + maxOfThree3.testMaximum());
	}
}