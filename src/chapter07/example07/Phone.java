package chapter07.example07;

public abstract class Phone {
	String owner;

	Phone(String owner) {
		this.owner = owner;
	}

	abstract void show_digit();

	void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}

	void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}
