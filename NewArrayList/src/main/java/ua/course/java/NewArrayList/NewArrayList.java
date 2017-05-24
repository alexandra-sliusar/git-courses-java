package ua.course.java.NewArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NewArrayList<T> extends AbstractList<T> {

	private List<T> array;

	public NewArrayList() {
		array = new ArrayList<T>();
	}

	public NewArrayList(Collection<? extends T> c) {
		array.addAll(c);
	}

	public T get(int index) {
		return array.get(index);
	}

	public boolean add(T element) {
		return array.add(element);
	}

	public void add(int index, T element) {
		throw new UnsupportedOperationException("Unsupported operation: Add element to ArrayList by index");
	}

	public boolean addAll(Collection<? extends T> c) {
		return array.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends T> c) {
		throw new UnsupportedOperationException("Unsupported operation: Add collection to ArrayList by index");
	}

	public T set(int index, T element) {
		throw new UnsupportedOperationException("Unsupported operation: Change element of ArrayList");
	}

	public int size() {
		return array.size();
	}

	public boolean isEmpty() {
		return array.isEmpty();
	}

	public boolean contains(Object o) {
		return array.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return array.containsAll(c);
	}

	public boolean remove(Object element) {
		throw new UnsupportedOperationException("Unsupported operation: Remove element from ArrayList");
	}

	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("Unsupported operation: Remove collection from ArrayList");
	}

	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException("Unsupported operation: Remove collection from ArrayList");
	}

	public void clear() {
		throw new UnsupportedOperationException("Unsupported operation: Clear ArrayList");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (T el : array) {
			sb.append(el);
			sb.append("\t");
		}
		return sb.append("\n").toString();
	}

}
