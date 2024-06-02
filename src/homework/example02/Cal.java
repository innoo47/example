package homework.example02;

public class Cal {

	public Cal(int arg1, String logi, int arg2) {
		int result = 0;

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
			break;
		}
		System.out.printf("%d %s %d = %d\r\n", arg1, logi, arg2, result);
	}

}
