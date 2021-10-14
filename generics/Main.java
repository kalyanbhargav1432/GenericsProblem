package generics;

public class Main {
	public static void main(String[] args) {
		MaximumOfThree maxOfThree = new MaximumOfThree();
		Integer max = maxOfThree.maximum(82, 63, 44);
		System.out.println("maximum value:" + max);
	}
}