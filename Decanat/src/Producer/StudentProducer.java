package Producer;

import java.util.Random;

import Entity.Specialization;
import Entity.Student;
import Queue.StudentQueue;

public class StudentProducer extends Thread {
	Specialization specialization;
	StudentQueue studentQueue;
	public int quantityOfStudents;
	int id = 1;

	public StudentProducer(Specialization specialization, StudentQueue studentQueue, int quantity) {
		this.specialization = specialization;
		this.studentQueue = studentQueue;
		this.quantityOfStudents = quantity;
	}

	public void addStudentsToQueue() {
		for (int i = 0; i < randomAndCheckQuantity(); i++) {
			studentQueue.push(new Student(specialization, id++));
			quantityOfStudents--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// System.out.println(specialization + " " + quantityOfStudents);
	}

	public int randomAndCheckQuantity() {

		Random random = new Random();
		int added = random.nextInt(25) + 1;
		if (quantityOfStudents < added)
			added = quantityOfStudents;
		return added;

	}

	public void run() {
		while (quantityOfStudents != 0) {
			if (studentQueue.getSize() <= 25) {
				addStudentsToQueue();
			}
		}

	}
}
