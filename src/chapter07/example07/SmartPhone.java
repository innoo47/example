package chapter07.example07;

public class SmartPhone extends Phone {

	SmartPhone(String owner) {
		super(owner);
	}

	void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}

	@Override
	void show_digit() {
		// TODO Auto-generated method stub
		System.out.println("화면에 번호판을 보인다");

	}
}
