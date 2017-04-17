import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = IntStream.range(0, 100).toArray();
		int[] array2 = { 43, 10, 15, 6, 28, 10, 91, 3 };
		Logic.parallelChecksum(array);
		Logic.parallelFilteredCount(array);
		Logic.parallelMin(array);
		Logic.parallelMax(array);
		Logic.parallelSum(array);

		Logic.parallelMax(array2);
		Logic.parallelMin(array2);
	}

}
