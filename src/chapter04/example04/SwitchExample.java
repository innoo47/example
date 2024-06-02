package chapter04.example04;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade = "B";
		int score = 0;

		switch (grade) {
		case "A":
			score = 100;
			break;

		case "B":
			int result = 100 - 20;
			score = result;
			break;

		default:
			score = 60;
		}
		System.out.printf("점수는 : %s\r\n", score);

		int score2 = switch (grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.printf("Score2: %s\r\n", score2);

	}

}
