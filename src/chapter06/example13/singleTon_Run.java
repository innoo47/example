package chapter06.example13;

public class singleTon_Run extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon single1 = SingleTon.SingleTon_getInstance();
		SingleTon single2 = SingleTon.SingleTon_getInstance();
		SingleTon single3 = SingleTon.SingleTon_getInstance();

		if (single1 == single2 && single2 == single3) {
			System.out.println("같은 주소 (싱글톤)");
		} else {
			System.out.println("다른 주소");
		}
	}

}
