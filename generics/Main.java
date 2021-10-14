package generics;

public class Main {
	public static void main(String[] args) {
		MaximumOfThree maxOfThree = new MaximumOfThree();
		String max = maxOfThree.maximum("Apple","Mango","Banana");
		System.out.println("maximum value:" + max);
	}
}