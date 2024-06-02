package chapter07.example03;

public class ClassB extends ClassA {

	@Override
	public int method() {
		int result = super.method();
		System.out.println("아빠 " + result + "원 만");
		return 100;
	}
}
