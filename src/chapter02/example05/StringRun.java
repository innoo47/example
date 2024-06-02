package chapter02.example05;

public class StringRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "홍길동";
		// 연산자는 action을 한다는 의미이다.

		String char1 = "A"; // 주소타입
		char char2 = 'A'; // 숫자

		System.out.println(name); // 시작주소로 가서 홍 출력, 증가후 출력, 증가후 출력...
									// ln --> newline

		// (이스케이프 문자)

		String str = "나는 \"자바\"를 배웁니다."; // \"를 해야 "를 출력
		System.out.println(str);

		String str2 = "나는 \t자바를 배웁니다."; // \t를 하면 tab기능
		System.out.println(str2);

		// \r\n --> 캐리지 리턴 (줄바꿈), \r만 가능한 경우도 있음

		double value = 0.0;
		int value2 = 10;
		value = value2; // 가독성을 위해 자동형변환이 되지만 타입을 써주는 것이 좋음
		value2 = (int) value; // 강제 타입 변환 -> 캐스팅

	}

}
