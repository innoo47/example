package chapter06.example14;

public class Phone extends Object {
	public String model;
	public String color;

	public void bell() {
		System.out.println("벨이 울립니다");
	}

	public void sendVoice(String message) {
		System.out.printf("자기: %s\r\n", message);
	}

	public void receiveVoice(String message) {
		System.out.printf("상대방: %s\r\n", message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}

}
