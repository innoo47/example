package chapter11.example468;

public class Exception_Run {

	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[프로그램 시작]\n");
		printLength("ThisISJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
