package Consumer;

import Entity.Specialization;
import Queue.StudentQueue;

public class MathUniversity extends University {

	public MathUniversity(StudentQueue studentQueue, int intensity) {
		super(studentQueue, intensity);
	}

	public void executePopping() {
		try {
			Thread.sleep(1000 / intensity);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("MathUniversity starts to pop");
		synchronized (studentQueue) {
			while (studentQueue.peek() != null && studentQueue.peek().specialization != Specialization.BIOLOGY) {
				if (studentQueue.pop() == null)
					break;
				System.out.println("MathUniversity pops student");
				quantity++;
			}
			System.out.println("MathUniversity ends popping");
		}
	}

}
