package chapter12.example598;

public class ChildThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; ++i) {
			System.out.printf("%s", "-");

			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
