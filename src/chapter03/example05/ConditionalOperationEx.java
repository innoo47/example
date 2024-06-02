package chapter03.example05;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;

		char result = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';

		System.out.printf("result: %s", result);

	}

}
