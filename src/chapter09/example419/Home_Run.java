package chapter09.example419;

public class Home_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Home home = new Home();

		// 익명 구현 객체가 대입된 필드 사용
		home.use1();

		// 익명 구현 객체가 대입된 로컬 변수 사용
		home.use2();

		// 익명 구현 객체가 대입된 매개변수 사용
		home.use3(new RemoteController() {

			@Override
			public void turn_on() {
				// TODO Auto-generated method stub
				System.out.println("use3 켜기");

			}

			@Override
			public void turn_off() {
				// TODO Auto-generated method stub
				System.out.println("use3 끄기");

			}

		});

	}

}
