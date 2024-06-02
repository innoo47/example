package chapter04.example09;

public class skipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3의 배수가 뜨면 skip

		for (int i = 1; i <= 100; ++i) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
