package chapter06.example03;

public class Car {

	{ // 초기화 방법에서 제일 빠른 방
		body = null; // 인스턴스 영역에서 순서가 중요하지 않음
	}

	// 고유 데이터를 저장하는 필드 선언
	protected String company; // 초기화를 알아서 해줌
	private String model; // 초기화를 생성자에서 해주느 것이 더 좋을 수 있다
	private String color;
	private int max_Speed;

	public void call_get_company() {
		this.get_company();
	}

	// 상태 데이터를 저장하는 필드 선언
	private int speed;
	private int rpm;

	// 부품 데이터를 저장하는 필드 선언
	Body body;
	Engine engine;
	Tire tire;

	// 위 들은 인스턴스 변수들

	public String get_company() {
		int value = 0; // 로컬 변수
//		value2 = 0; // 절차지향적이라 순서가 중요
		int value2;
		return this.company;
	}
}
