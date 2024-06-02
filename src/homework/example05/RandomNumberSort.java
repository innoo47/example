package homework.example05;

public class RandomNumberSort {

	private int[] randomNumbers;

	public RandomNumberSort(int ball) {
		super();
		this.randomNumbers = new int[ball];

		for (int i = 0; i < this.randomNumbers.length; ++i) {
			this.randomNumbers[i] = (int) (Math.random() * 1_000);
		}
	}

	public void show_random_numbers() {
		System.out.printf("%s\r\n", "\r\n");
		for (int number : this.randomNumbers) {
			System.out.printf("%d  ", number);
		}
		System.out.printf("%s\r\n", "\r\n");
	}

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
