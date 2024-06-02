package chapter04.example07;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;

		while (i <= 100) {
			sum += i;
			++i;
		}

		System.out.println("1 to 100 : " + sum);
	}

}
