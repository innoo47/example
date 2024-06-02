package chapter07.example345;

public class TeslaCar implements RemoteController {

	@Override
	public void turn_on() {
		// TODO Auto-generated method stub
		System.out.println("테슬라 켜기");

	}

	@Override
	public void turn_off() {
		// TODO Auto-generated method stub
		System.out.println("테슬라 끄기");

	}

	@Override
	public boolean power_on(int power_switch) {
		// TODO Auto-generated method stub
		if (power_switch == 1) {
			System.out.println("시동 걸기");
			return true;
		} else {
			System.out.println("시동 끄기");
			return false;
		}
	}

	@Override
	public int check_voltage() {
		// TODO Auto-generated method stub
		System.out.println("현재 배터리 상태 : ");
		return 3;
	}

}
