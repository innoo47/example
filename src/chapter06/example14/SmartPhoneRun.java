package chapter06.example14;

public class SmartPhoneRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		System.out.println("와이파이 상태 : " + myPhone.wifi);

		System.out.println();

		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕");
		myPhone.sendVoice("ㅎㅇ");
		myPhone.hangUp();

		System.out.println();

		myPhone.setWifi(true);
		myPhone.internet();

		System.out.println();

	}

}
