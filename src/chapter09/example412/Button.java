package chapter09.example412;

public class Button {

	// 정적 중첩 인터페이스
	public static interface ClickListener {
		// 추상 메소드
		public abstract void onClick();
	}

	private ClickListener clickListener;

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}

}
