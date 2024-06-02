package chapter06.example12;

public class Car_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();

		// 프로그램이 실행 될때 100이 들어가는 것이 안전
		car.set_speed(-100);
		car.setMax_speed(500);

		System.out.println(car.get_speed());
		System.out.println(car.getMax_speed());
	}

}
