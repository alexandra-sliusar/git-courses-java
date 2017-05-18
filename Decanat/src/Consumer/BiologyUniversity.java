package Consumer;

import Entity.Specialization;
import Queue.StudentQueue;

public class BiologyUniversity extends University {

	public BiologyUniversity(StudentQueue studentQueue, int intensity) {
		super(studentQueue, intensity);
	}

	public void executePopping() {
		try {
			Thread.sleep(1000 / intensity);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("BiologyUniversity starts to pop");
		synchronized (studentQueue) {
			while (studentQueue.peek() != null && studentQueue.peek().specialization != Specialization.MATHS) {
				if (studentQueue.pop() == null)
					break;
				System.out.println("BiologyUniversity pops student");
				quantity++;
			}
			System.out.println("BiologyUniversity ends popping");
		}
	}

}
