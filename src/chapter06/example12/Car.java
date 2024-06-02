package chapter06.example12;

public class Car {

	private int speed;
	private boolean stop;
	private int max_speed;

	public int get_speed() {
		return this.speed;
	}

	public void set_speed(int speed) {

		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

	public int getMax_speed() {
		return this.max_speed;
	}

	public void setMax_speed(int max_speed) {
		if (max_speed > 400) {
			this.max_speed = 400;
		} else {
			this.max_speed = max_speed;
		}
	}

}
