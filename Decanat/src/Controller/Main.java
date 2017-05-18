package Controller;

import Consumer.BiologyUniversity;
import Consumer.MathUniversity;
import Consumer.PoliUniversity;
import Entity.Specialization;
import Producer.StudentProducer;
import Queue.StudentQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentQueue studentQueue = new StudentQueue();
		StudentProducer biologists = new StudentProducer(Specialization.BIOLOGY, studentQueue, 200);
		StudentProducer mathematics = new StudentProducer(Specialization.MATHS, studentQueue, 250);
		PoliUniversity poliUniversity = new PoliUniversity(studentQueue, 100);
		BiologyUniversity biologyUniversity = new BiologyUniversity(studentQueue, 150);
		MathUniversity mathUniversity = new MathUniversity(studentQueue, 200);

		biologists.start();
		mathematics.start();

		poliUniversity.start();

		biologyUniversity.start();
		mathUniversity.start();
	}

}
