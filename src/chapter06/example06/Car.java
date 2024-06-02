package chapter06.example06;

public class Car {

	public Car(String model) {
		this(model, "블랙", 250);
	}

	public Car(int maxSpeed) {
		this("그랜저", "블랙", maxSpeed);
	}

	public Car(String model, String color) {
		this(model, color, 250);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// 은닉화를 위해 private를 하는 것이 좋다
	private String model;
	private int maxSpeed;
	private String color;

	public void show_car() {
		System.out.println(this.model);
		System.out.println(this.maxSpeed);
		System.out.println(this.color);

	}

}
