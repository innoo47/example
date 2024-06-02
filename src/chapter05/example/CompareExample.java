package chapter05.example;

public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("Park Inho");
		String str2 = "Park Inho";

		if (str1 == str2) {
			System.out.println("같다."); // 같은 주소
		} else {
			System.out.println("같지 않습니다.");
		}

		// 이름을 비교할때는 이 방법을 이용 //메서드 오버라이딩
		if (str1.equals(str2)) {
			System.out.println("같다.");
		} else {
			System.out.println("같지 않습니다.");
		}
	}

}
