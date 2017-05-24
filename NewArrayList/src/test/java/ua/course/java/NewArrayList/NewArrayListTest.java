package ua.course.java.NewArrayList;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class NewArrayListTest {
	NewArrayList<Integer> nal;

	@Before
	public void initializing() {
		nal = new NewArrayList();
		for (int i = 0; i < 10; i++) {
			nal.add(i);
		}

	}

	@Test
	public void testAddIsCorrect() {
		assertTrue(!nal.isEmpty());
	}

	@Test
	public void testGetIsCorrect() {
		assertTrue(nal.get(1) == 1);
	}

	@Test
	public void testContainsIsCorrectWithNumbers() {
		assertTrue(nal.contains(1));
	}

	@Test
	public void testContainsIsCorrectWithStrings() {
		NewArrayList<String> nalWithStrings = new NewArrayList();
		nalWithStrings.add("first");
		nalWithStrings.add("second");
		assertTrue(nalWithStrings.contains("second"));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveIsPermitted() {
		nal.remove(3);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveAllIsPermitted() {
		ArrayList<Integer> array = new ArrayList();
		for (int i = 0; i < 10; i++) {
			array.add(i);
		}
		nal.removeAll(array);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testClearIsPermitted() {
		nal.clear();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testSetByIndexIsPermitted() {
		nal.set(0, 5);
	}

}
