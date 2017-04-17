import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Logic {
	public static void parallelSum(int[] array) {

		AtomicInteger counter = new AtomicInteger();
		Arrays.stream(array).parallel().forEach(elem -> {
			while (true) {
				int val = counter.get();
				if (counter.compareAndSet(val, val + elem)) {
					break;
				}
			}
		});

		System.out.println("Sum: " + counter.get());
	}

	public static void parallelFilteredCount(int[] array) {
		AtomicInteger counter = new AtomicInteger();
		Arrays.stream(array).parallel().forEach(elem -> {
			if (elem < 10) {
				while (true) {
					int val = counter.get();
					if (counter.compareAndSet(val, val + 1)) {
						break;
					}
				}
			}
		});

		System.out.println("Quantity: " + counter.get());
	}

	public static void parallelMin(int[] array) {
		AtomicInteger minIndex = new AtomicInteger();
		IntStream.range(0, array.length).parallel().forEach(elem -> {
			while (true) {
				int index = minIndex.get();
				int val = array[index];
				if (val > array[elem]) {
					if (minIndex.compareAndSet(index, elem))
						break;
				} else {
					break;
				}
			}
		});
		System.out.println("Min: array[ " + minIndex.get() + " ] = " + array[minIndex.get()]);
	}

	public static void parallelMax(int[] array) {
		AtomicInteger maxIndex = new AtomicInteger();
		IntStream.range(0, array.length).parallel().forEach(elem -> {
			while (true) {
				int index = maxIndex.get();
				int val = array[index];
				if (val < array[elem]) {
					if (maxIndex.compareAndSet(index, elem))
						break;
				} else {
					break;
				}
			}
		});
		System.out.println("Max: array[ " + maxIndex.get() + " ] = " + array[maxIndex.get()]);
	}

	public static void parallelChecksum(int[] array) {
		AtomicInteger counter = new AtomicInteger();
		Arrays.stream(array).parallel().forEach(elem -> {
			while (true) {
				int val = counter.get();
				if (counter.compareAndSet(val, val ^ elem)) {
					break;
				}
			}
		});
		System.out.println("Checksum: " + counter.get());
	}
}
