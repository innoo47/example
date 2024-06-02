package chapter11.example468;

public class Exception_Run2 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()); // 방법 1
//			System.out.println(e.toString());	// 방법 2
//			e.printStackTrace();				// 방법 3
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("[마무리 실행]\n");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[프로그램 시작]\n");
		printLength("ThisISJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
