package chapter12.example613;

public class Synchronized_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();

		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();

		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();

	}

}
