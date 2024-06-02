package homework.example03;

public class CalRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 3) { // 예외 처리
			System.out.println("프로그램 입력값이 부족하거나 많습니다.");
			System.exit(0);
		}

		int arg1 = Integer.parseInt(args[0]);
		String logi = args[1];
		int arg2 = Integer.parseInt(args[2]);

		Calc calc = new Calc();
		calc.set_arg1(arg1);
		calc.set_logi(logi);
		calc.set_arg2(arg2);

		if (arg2 == 0) { // 예외처리
			System.out.println("분모가 0이 될 수 없습니다.");
			System.exit(0);
		} else {
			// 결과 출력
			calc.show_result();
		}
	}

}
