package chapter09.example397;

public class A {

	class B {
		int value = 0;

		public void change_value() {
			value2 = 0.0;
		}

	}

	A() {
		B b = new B();
		b.value = 10;
	}

	double value2 = 20.0;

}
