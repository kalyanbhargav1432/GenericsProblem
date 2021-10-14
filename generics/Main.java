package generics;

public class Main {
	public static void main(String[] args) {
		MaximumOfThree maxOfThree = new MaximumOfThree();

		System.out.println("maximum Integer value:" + maxOfThree.maximum(82, 44, 66));
		System.out.println("maximum Float value:" + maxOfThree.maximum(72.55, 44.33, 66.43));
		System.out.println("maximum String value:" + maxOfThree.maximum("Apple", "Mango", "Banana"));
	}
}