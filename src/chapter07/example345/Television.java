package chapter07.example345;

public class Television extends Object implements RemoteController {

	private int battery;

	@Override
	public void turn_on() {
		// TODO Auto-generated method stub
		System.out.println("텔레비전 켜기");

	}

	@Override
	public void turn_off() {
		// TODO Auto-generated method stub
		System.out.println("텔레비전 끄기");
	}

	@Override
	public boolean power_on(int power_switch) {
		// TODO Auto-generated method stub
		if (power_switch == 1) {
			System.out.println("파워 온");
			return true;
		} else {
			System.out.println("파워 오프");
			return false;
		}

	}

	@Override
	public static void check_voltage(int battery) {
		// TODO Auto-generated method stub
		System.out.print("현재 배터리 상태 : ");

		switch (battery) {
		case 0:
			System.out.printf("방전\r\n");
			break;
		// 추가예정
		}

	}

}
