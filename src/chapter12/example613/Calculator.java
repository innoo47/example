package chapter12.example613;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2_000);
		} catch (InterruptedException e) {
		}
		// TODO Auto-generated catch block
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);

	}

	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2_000);
			} catch (InterruptedException e) {
			}
			// TODO Auto-generated catch block
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}

}
