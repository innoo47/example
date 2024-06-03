package chapter12.example598;

import java.awt.Toolkit;

public class BeepRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Task());
		Thread thread2 = new Thread(new Task2());
		ChildThread thread3 = new ChildThread();

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		thread.start(); // 아래 코드와 Task()를 시작
		thread2.start();
		thread3.start();
		for (int i = 0; i < 5; ++i) {
			toolkit.beep();
			try {
				Thread.sleep(1_000);
			} catch (Exception e) {

			}
		}

	}

}
