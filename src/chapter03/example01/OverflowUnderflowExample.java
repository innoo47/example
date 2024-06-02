package chapter03.example01;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.printf("var1: %s\n", var1);

		}

		System.out.println("------------------------------");

		byte var2 = -125;
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.printf("var2: %s\n", var2);
		}

	}

}
