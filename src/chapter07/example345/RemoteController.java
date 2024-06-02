package chapter07.example345;

public interface RemoteController {

	int MAX_BATTERY = 100;
	int MIN_BATTERY = 0;

	public abstract void turn_on();

	public void turn_off();

	public boolean power_on(int power_switch);

	public int check_voltage();

}
