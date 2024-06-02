package homework.example03;

public class Calc {

	// default 생성자
	public Calc() {

	}

	// CalRun에서 불러올 수 없도록 private 설정
	private int arg1;
	private String logi;
	private int arg2;
	private int result;

	// Consumer
	// 피연산자 arg1를 저장
	public void set_arg1(int arg1) {
		this.arg1 = arg1;
	}

	// 피연산자 arg2를 저장
	public void set_arg2(int arg2) {
		this.arg2 = arg2;
	}

	// 연산자 logi를 저장
	public void set_logi(String logi) {
		this.logi = logi;
	}

	// functional
	// 연산을 수행하는 메서드
	private int func_logi(int arg1, int arg2, String logi) {
		// 파라미터를 여러개 받을때 뒤에부터 스택에 쌓임
		switch (logi) {
		case "+":
			result = arg1 + arg2;
			break;
		case "-":
			result = arg1 - arg2;
			break;
		case "x":
			result = arg1 * arg2;
			break;
		case "/":
			result = arg1 / arg2;
			break;
		default:
			System.out.println("연산 불가");
			break;
		}

		return result;
	}

	// display
	// 결과를 보여주는 메서드
	public void show_result() {
		this.func_logi(arg1, logi, arg2);
		System.out.printf("%d %s %d = %d\r\n", arg1, logi, arg2, result);
	}

}
