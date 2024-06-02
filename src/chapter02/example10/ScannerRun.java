package chapter02.example10;

import java.util.Scanner;

public class ScannerRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); // instantiate (HEAP을 올라가있는 상태)

		System.out.print("입력: ");
		String str = scanner.nextLine();
		int result = Integer.parseInt(str);
		System.out.printf("입력문자열 : %s\r\n", str + 10);
		System.out.printf("더한값 : %s\r\n", result + 10);

	}

}
