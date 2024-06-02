package chapter09.example412;

public class Button_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button button_ok = new Button();

		// lanbda 함수
		button_ok.setClickListener(() -> {
			System.out.println("ok 버튼 클릭");
		});

		//////////////////////////////

		Button button_cancel = new Button();

		// 익명 자식 객체
//		new 상위클래스 {
//			임시객체 // 자식클래스
//		}

		class Cancel_Listener implements Button.ClickListener {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("cancel");

			}

		}

		Cancel_Listener cancel = new Cancel_Listener();

		button_cancel.setClickListener(() -> {
			System.out.println("cancel 버튼 클릭");
		});

		OK_Listener ok = new OK_Listener();

		button_ok.click();
		button_ok.setClickListener(ok);
		button_ok.click();
		button_cancel.setClickListener(cancel);
		button_cancel.click();
	}

}
