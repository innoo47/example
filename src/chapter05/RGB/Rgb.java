package chapter05.RGB;

public class Rgb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] randomNumber = new int[5][5];
		int num = 1;
		int num2 = 0;

		System.out.println("============== default ==============  ============== 좌우반전 ==============");

		for (int i = 0; i < randomNumber.length; ++i) {
			for (int j = 0; j < randomNumber.length; ++j) {
				randomNumber[i][j] = num;
				System.out.print(randomNumber[i][j] + "\t");

				if (j == randomNumber.length - 1) { // 한 줄이 완성되면 num2에 마지막 값을 저장
					num2 = num;
				}

				++num;
			}

			for (int k = 0; k < randomNumber.length; ++k) { // 좌우반전 출력
				System.out.print(num2 + "\t");
				--num2;
			}
			System.out.println();
		}

	}

}
