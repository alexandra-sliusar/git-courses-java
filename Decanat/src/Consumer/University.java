package Consumer;

import Queue.StudentQueue;

public abstract class University extends Thread {
	public final StudentQueue studentQueue;
	public int intensity;
	public int quantity = 0;
	public int timeoutRun = 0;

	public University(StudentQueue studentQueue, int intensity) {
		this.studentQueue = studentQueue;
		this.intensity = intensity;
	}

	public void run() {
		while (true) {
			while (!studentQueue.isEmpty()) {
				timeoutRun = 0;
				executePopping();
			}
			if (studentQueue.isEmpty()) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				timeoutRun++;
			}
			if (timeoutRun > 5)
				break;
		}
		System.out.println(this.getClass().getSimpleName() + " " + quantity);
	}

	public abstract void executePopping();

}
