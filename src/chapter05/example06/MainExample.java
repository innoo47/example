package chapter05.example06;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열
		String arg1 = args[0];
		String arg2 = args[1];

		System.out.println("총합은 : " + arg1 + arg2);

		int value1 = Integer.parseInt(arg1);
		int value2 = Integer.parseInt(arg2);

		System.out.printf("총합은 : %s\r\n", value1 + value2);

	}

}
