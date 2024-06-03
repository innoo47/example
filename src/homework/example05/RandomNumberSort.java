package homework.example05;

public class RandomNumberSort {

	// 랜덤 숫자 배열 생성
	private int[] randomNumbers;

	// 생성자
	public RandomNumberSort(int ball) {
		super();

		this.randomNumbers = new int[ball];

		for (int i = 0; i < this.randomNumbers.length; ++i) {
			this.randomNumbers[i] = (int) (Math.random() * 1_000);
		}
	}

	// 랜덤 숫자 뽑는 메서드
	public void show_random_numbers() {
		System.out.printf("%s\r\n", "\r\n");
		for (int number : this.randomNumbers) {
			System.out.printf("%d  ", number);
		}
		System.out.printf("%s\r\n", "\r\n");
	}

	// 뽑힌 숫자들 정렬하는 메서드
	public void sorting_random_numbers(boolean ascending) {

		if (ascending) {

			int max_number = 0;

			for (int i = 0; i < this.randomNumbers.length - 1; ++i) {
				for (int j = 1; j < this.randomNumbers.length; ++j) {
					if (this.randomNumbers[j] > this.randomNumbers[j - 1]) {
						continue;
					} else {
						max_number = this.randomNumbers[j - 1];
						this.randomNumbers[j - 1] = this.randomNumbers[j];
						this.randomNumbers[j] = max_number;
					}
				}
			}

		}
	}

}
