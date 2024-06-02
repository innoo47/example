package chapter07.example345;

public class RemoteController_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController remote;

		remote = new Television();
		remote.power_on(1);
		remote.turn_on();
		remote.turn_off();

		System.out.println();

		remote = new AirCondition();
		remote.power_on(1);
		remote.turn_on();
		remote.turn_off();

		System.out.println();

		remote = new TeslaCar();
		remote.power_on(1);
		remote.turn_on();
		remote.turn_off();

	}

}
