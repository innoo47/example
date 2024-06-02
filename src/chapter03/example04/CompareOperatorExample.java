package chapter03.example04;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);

		System.out.printf("result1: %s\r\n", result1);
		System.out.printf("result2: %s\r\n", result2);
		System.out.printf("result3: %s\r\n", result3);

		char char1 = 'A';
		char char2 = 'B';

		boolean result4 = (char1 < char2);
		System.out.printf("result4: %s\r\n", result4);

		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.printf("result5: %s\r\n", result5);

		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float) num6);
		System.out.printf("result6: %s\r\n", result6);
		System.out.printf("result7: %s\r\n", result7);

		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (!str1.equals(str2));
		System.out.printf("result8: %s\r\n", result8);
		System.out.printf("result9: %s\r\n", result9);

	}

}
