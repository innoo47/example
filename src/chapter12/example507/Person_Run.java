package chapter12.example507;

public class Person_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Jack", "20");

		System.out.println(person1.getAge());
		person1.setAge("40");
		System.out.println(person1.getAge());

	}

}
