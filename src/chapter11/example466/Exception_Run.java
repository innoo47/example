package chapter11.example466;

public class Exception_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ary = new int[10];

		try {
			for (int i = 0; i <= 10; ++i) {
				ary[i] = i;
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			System.out.println("산다");
		} finally {
			System.out.println("반드시 실행");
			// 문제가 생겨서 file을 닫을때
			// 리소스 해제
		}

		try {
			Class.forName("Exception_Run.class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
