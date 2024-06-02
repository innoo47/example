package chapter05.example04;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = null;

		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; ++i) {
			sum1 += scores[i];

		}
		System.out.println("총합 : " + sum1);

		printItem(new int[] { 83, 90, 87 });
		System.out.println("============================");
		printItem(scores);

	}

	public static void printItem(int[] _scores) {

//		for (int i = 0; i < 3; ++i) {
//			System.out.println("score[" + i + "] : " + scores[i]);
//		}

		for (int item : _scores) { // advenced for 구문
			System.out.println(item);
		}
	}
}
