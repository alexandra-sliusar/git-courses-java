package Queue;

import java.util.ArrayDeque;

import Entity.Student;

public class StudentQueue {
	private ArrayDeque<Student> students;

	public StudentQueue() {
		students = new ArrayDeque<Student>();
	}

	public synchronized boolean isEmpty() {
		return students.isEmpty();
	}

	public synchronized int getSize() {
		return students.size();
	}

	public synchronized void push(Student student) {
		students.add(student);
		System.out.println("Push student " + student.specialization + " " + student.id);
	}

	public synchronized Student pop() {
		Student res = students.poll();
		// if (res != null) {
		// System.out.println("Pop student " + res.specialization);
		// }
		return res;
	}

	public synchronized Student peek() {
		Student res = students.peek();
		// if (res != null) {
		// System.out.println("Peek student " + res.specialization);
		// }
		return res;

	}
}
