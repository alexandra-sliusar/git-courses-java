package ua.course.java.NewArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		NewArrayList<Integer> nal = new NewArrayList<Integer>();
		System.out.println(nal.isEmpty());
		System.out.println(nal.size());
		nal.add(3);
		nal.add(8);
		nal.add(12);
		System.out.println(nal);
	}
}
