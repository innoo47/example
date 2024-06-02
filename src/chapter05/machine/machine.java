package chapter05.machine;

public class machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 머신러닝

		for (int w1 = 1; w1 <= 6; ++w1) {

			for (int w2 = 1; w2 <= 6; ++w2) {

				for (int w3 = 1; w3 <= 6; ++w3) {

					if (4 * w1 + 5 * w2 + 3 * w3 == 19) {
						System.out.printf("w1 : %s\r\n", w1);
						System.out.printf("w2 : %s\r\n", w2);
						System.out.printf("w3 : %s\r\n", w3);
					}
				}
			}
		}
	}

}
