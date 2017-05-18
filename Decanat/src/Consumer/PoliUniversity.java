package Consumer;

import java.util.Random;

import Queue.StudentQueue;

public class PoliUniversity extends University {

	public PoliUniversity(StudentQueue studentQueue, int intensity) {
		super(studentQueue, intensity);
	}

	public void executePopping() {
		try {
			Thread.sleep(1000 / intensity);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		int getStudentsPerStep = random.nextInt(5);
		synchronized (studentQueue) {
			System.out.println("PoliUniversity gets students");
			for (int i = 0; i < getStudentsPerStep + 1; i++) {
				if (studentQueue.pop() == null)
					break;
				System.out.println("PoliUniversity pops student");
				quantity++;
			}
			System.out.println("PoliUniversity ends popping");
		}
	}
}
