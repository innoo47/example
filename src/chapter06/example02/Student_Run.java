package chapter06.example02;

public class Student_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		Student student2 = new Student();

		if (student == student2) {
			System.out.println("같은주소");
		} else {
			System.out.println("다른주소");
		}
	}

}
