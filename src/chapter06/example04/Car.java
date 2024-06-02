package chapter06.example04;

public class Car {

	public Car() {
		company = "그랜저";
		model = "현대자동차";
		color = "검정";
		start = false;
		speed = 0;
		maxSpeed = 350;
	}

	public Car(String _model, String _color, int _maxSpeed) {
		model = _model;
		color = _color;
		maxSpeed = _maxSpeed;
		_maxSpeed = 1000;
	}

	String company;
	String model;
	String color;

	boolean start;

	int speed;
	int maxSpeed;
}
