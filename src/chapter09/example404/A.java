package chapter09.example404;

public class A {
//	private int value = 10;	// o

	void useB(final int param) {
//		private int value = 10;	// x

		final int value = 10; // final 필요했는데 지금은 상관없다

		class B {
			int field = 1;
			static int field2 = 2;

			B() {
				System.out.println("생성자 B");
			}

			void method1() {
				System.out.println("class B method1()");
//				value = 20;	// set x
				System.out.println(value); // get o

				System.out.println(param);
			}

			static void method2() {
				System.out.println("class B method2()");
			}
		}

		B b = new B();

		System.out.println(b.field);
		b.method1();
		System.out.println(B.field2);
		B.method2();
	}

}
