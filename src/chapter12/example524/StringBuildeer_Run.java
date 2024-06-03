package chapter12.example524;

public class StringBuildeer_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str = new StringBuilder().append("ABC").append("EFG").append("HIJ");
		System.out.println(str.toString());
		String original_str = str.toString();
		System.out.println(original_str);

	}

}
