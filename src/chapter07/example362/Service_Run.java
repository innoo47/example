package chapter07.example362;

public class Service_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Servicable service = new ServiceImpl();

		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();

		Servicable.staticMethod1();
		System.out.println();
		Servicable.staticMethod2();
		System.out.println();

	}

}
