package generics;

public class Main {
	public static void main(String[] args) {
		MaximumOfThree maxOfThree = new MaximumOfThree();
		Float max = maxOfThree.maximum(3.45F, 63.43F, 44.32F);
		System.out.println("maximum value:" + max);
	}
}