package chapter09.example419;

public class Home {

	// 익명 구현 객체 대입
	private RemoteController tv = new RemoteController() {

		@Override
		public void turn_on() {
			// TODO Auto-generated method stub
			System.out.println("TV를 켭니다");

		}

		@Override
		public void turn_off() {
			// TODO Auto-generated method stub
			System.out.println("TV를 끕니다");
		}

	};

	public void use1() {
		tv.turn_on();
		tv.turn_off();
	}

	public void use2() {
		RemoteController air = new RemoteController() {

			@Override
			public void turn_on() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 켭니다");

			}

			@Override
			public void turn_off() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 끕니다");
			}

		};

		air.turn_on();
		air.turn_off();
	}

	// callback method
	public void use3(RemoteController rc) {
		// method 안에서 밖의 method를 호출
		rc.turn_on();
		rc.turn_off();
	}

}
