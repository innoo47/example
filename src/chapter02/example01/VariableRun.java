package chapter02.example01;

public class VariableRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int value = 20; // 선언과 함께 초기화 
		int result = value + 1; // 20 1 +
		
		// value = 30; // 원본 수정 <= side effect(부작용) ==> final int 으로 수정 불가로 만듦
		
		//int value = 30 //  <<== 변수의 재정의 java에서는 불가(python에서는 가능)
				
		
	}

}
