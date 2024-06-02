package chapter04.rotto;

public class rotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 하드코딩

		int num1 = (int) (Math.random() * 45) + 1;
		int num2 = (int) (Math.random() * 45) + 1;
		int num3 = (int) (Math.random() * 45) + 1;
		int num4 = (int) (Math.random() * 45) + 1;
		int num5 = (int) (Math.random() * 45) + 1;
		int num6 = (int) (Math.random() * 45) + 1;

		if (num2 == num1) {
			return;
		} else if (num3 == num1 || num3 == num2) {
			return;
		} else if (num4 == num1 || num4 == num2 || num4 == num3) {
			return;
		} else if (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4) {
			return;
		} else if (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5) {
			return;
		}

		System.out.printf("%s, %s, %s, %s, %s, %s", num1, num2, num3, num4, num5, num6);
		// 중복을 안보여주면 된다 <<<< return

		// 배열, 반복문 사용

	}

}
