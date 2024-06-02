package chapter06.example04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();

		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("시동여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
		System.out.println("최고속도 : " + myCar.maxSpeed);

		System.out.println();

		myCar.speed = 60;
		myCar.start = true;
		System.out.println("수정된 속도 : " + myCar.speed);
		System.out.println("시동 여부 : " + myCar.start);

		System.out.println("===============");

		Car car = new Car("그랜저", "검정", 2000);

		System.out.println("모델명 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("최고속도2 : " + car.maxSpeed);
		System.out.println("최고속도1 : " + myCar.maxSpeed);

		System.out.println("===============");
	}

}
