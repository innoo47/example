package chapter09.example416;

public class Car_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tire tire = new Tire() {

			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 1이 굴러간다");
			}

		};

	}
}
