package chapter09.example416;

public class Car {

	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire() {

		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러간다");
		}

	};

	public void run1() {
		tire1.roll();
		tire2.roll();
	}

}
