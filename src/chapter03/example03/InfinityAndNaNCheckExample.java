package chapter03.example03;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		double y = 0.0;
		double z = x / y;

		System.out.println(z + 2);

		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("error: 값 산출 불가");
		} else {
			System.out.println(z + 2);
		}

	}

}
