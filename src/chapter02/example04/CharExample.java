package chapter02.example04;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A'; // 문자 저장
		char c2 = 65; // 유니코드 직접 저장

		char c3 = '가'; // 문자 저장
		char c4 = 44032;// 유니코드 직접 저장

		char c5 = ' '; // 공백으로 초기화

		boolean b1 = 1 < 2 && 3 < 4;
		boolean b2 = 1 > 2 && 3 < 4;
		boolean b3 = 1 > 2 || 3 < 4;
		boolean b4 = 1 > 2 || 3 > 4;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

	}

}
