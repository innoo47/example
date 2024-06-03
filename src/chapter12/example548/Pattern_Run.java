package chapter12.example548;

import java.util.regex.Pattern;

public class Pattern_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String credit_pattern = "\\d{4}-\\d{4}-\\d{8}";
		String input_credit_card = "1111-0000-12345678";

		if (Pattern.matches(credit_pattern, input_credit_card)) {
			System.out.printf("%s\r\n", "정상적인 신용카드입니다.");
		} else {
			System.out.printf("%s\r\n", "잘못된 신용카드입니다.");
		}

	}

}
