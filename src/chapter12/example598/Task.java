package chapter12.example598;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; ++i) {
			System.out.println("띵");
			try {
				Thread.sleep(1_000);
			} catch (Exception e) {

			}

		}
	}

}
