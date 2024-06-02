package chapter07.example345;

public class AirCondition implements RemoteController {

	@Override
	public void turn_on() {
		// TODO Auto-generated method stub
		System.out.println("에어컨 켜기");

	}

	@Override
	public void turn_off() {
		// TODO Auto-generated method stub
		System.out.println("에어컨 끄기");

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
	public int check_voltage() {
		// TODO Auto-generated method stub
		System.out.println("현재 배터리 상태 : ");
		return 2;
	}

}
