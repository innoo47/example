package chapter07.example07;

public class Phone_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone smartPhone = new SmartPhone("홍길동");
		Phone phone = new SmartPhone("가나다");

		phone.show_digit();
		phone.turnOn();
		phone.turnOff();
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
