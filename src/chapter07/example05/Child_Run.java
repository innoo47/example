package chapter07.example05;

public class Child_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Child();

		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		// parent.filed2 = "data2";
		// parent.method3(); // 불가능

		if (parent instanceof Child) {
			Child child = (Child) parent;

			child.field2 = "data2";
			child.method3();
		}

	}

}
