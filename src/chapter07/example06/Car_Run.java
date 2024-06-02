package chapter07.example06;

public class Car_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();

		myCar.tire = new Tire();
		myCar.run();

		myCar.tire = new hankookTire();
		myCar.run();

		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
