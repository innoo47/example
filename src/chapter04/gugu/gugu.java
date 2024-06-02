package chapter04.gugu;

public class gugu {
	public static void main(String[] args) {
		for (int n = 2; n <= 9; ++n) {
			System.out.printf("====%s단====\r\n", n);
			for (int m = 1; m <= 9; ++m) {
				System.out.printf("%s x %s = %s\r\n", n, m, (n * m));
			}
			System.out.println();
		}
	}

}
