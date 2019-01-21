package com.faisal.GenericsPractice.generics_practice;

import java.util.Arrays;
import java.util.Collection;

public class CustomList<E> {

	// Size of list
	private int size = 10;

	
	private int nextElement;

	
	private Object[] array;

	private final int INCREMENT = 5;

	
	public CustomList() {
		size = 5;
		nextElement = 0;
		array = new Object[size];
	}

	
	public CustomList<E> add(E e) {
		if (nextElement == size) {
			reallocation(INCREMENT);
		}
		array[nextElement] = e;
		nextElement++;
		System.out.println(e);
		return this;
	}

	
	private boolean reallocation(int increment) {
		size += increment;
		array = Arrays.copyOf(array, size);
		return true;
	}

	
	public int find(E object) {
		int pos = -1;
		for (int i = 0; i < nextElement; i++)
			if (array[i].equals(object))
				return i;
		// System.out.println(pos);
		return pos;
	}

	

	public CustomList<E> addAt(int a, E e) {
		nextElement++;
		if (array[a] != null) {
			for (int i = a; i <= nextElement; i++) {
				array[a + 1] = array[a];
			}
			array[a] = e;
		}

		array[a] = e;
		System.out.println(e);
		return this;
	}

	

	public Object remove(E object) {
		int pos = find(object);
		if (pos < 0) {
			return NullPointerException.class;
		} else if (pos > nextElement) {
			return ArrayIndexOutOfBoundsException.class;
		} else if (pos == -1) {

		} else {
			System.arraycopy(array, pos + 1, array, pos, nextElement - pos - 1);
			nextElement--;
			array[nextElement] = null;
		}
		return true;
	}

	public CustomList<E> removeAt(int a) {
		nextElement--;
		if (array[a] != null) {
			for (int i = a; i <= nextElement; i++) {
				array[a] = array[a + 1];
			}
		}
		return this;
	}

	public CustomList<E> replace(int i, E e) {
		array[i] = e;
		return this;
	}

	public boolean contains(E e) {
		for (int i = 0; i < nextElement; i++)
			if (array[i].equals(e))
				return true;
		return false;

	}

	// getting the size of the list
	public int size() {
		return nextElement;
	}

	// getting the position of the book
	public Object get(int pos) {
		/// sending the position of which book want to get
		if (pos < 0) {
			return NullPointerException.class;
		} else if (pos > nextElement) {
			return ArrayIndexOutOfBoundsException.class;
		} else {
			return array[pos];
		}
	}

	public void removeAll() {
		//emptying the array 
		nextElement = 0;
		size = 5;
		array = (E[]) new Object[5];
	}
}
