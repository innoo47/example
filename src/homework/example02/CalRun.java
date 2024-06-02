package homework.example02;

public class CalRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 3) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}

		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[2]);

		if (arg2 == 0) {
			System.out.println("분모가 0이 될 수 없습니다.");
			System.exit(0);
		} else {
			Cal cal = new Cal(arg1, args[1], arg2);
		}
	}

}
