package chapter06.example13;

public class SingleTon {

	private SingleTon() {

	}

	private static SingleTon single = new SingleTon();

	public static SingleTon SingleTon_getInstance() {
//		SingleTon single = new SingleTon();
//		single.show_values();

		return single;
	}

	private int speed = 10;
	private String color = "RED";
	private String model = "EQUUS";

	private void show_values() {
		System.out.println(this.speed);
		System.out.println(this.color);
		System.out.println(this.model);
	}

}
