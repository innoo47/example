package chapter09.example397;

public class A_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();

		A.B b = a.new B();
		A.B b2 = new A().new B();

	}

}
