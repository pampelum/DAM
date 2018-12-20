package Pila_Gen;

import java.util.Arrays;

class Array<E> {

	private final Object[] arr;
	public final int length;

	// constructor
	public Array(int length)
	{
		// Creates a new Object array of specified length
		arr = new Object[length];
		this.length = length;
	}

	// Function to get Object present at index i in the array
	E get(int i) {
		@SuppressWarnings("unchecked")
		final E e = (E)arr[i];
		return e;
	}

	// Function to set a value e at index i in the array
	void set(int i, E e) {
		arr[i] = e;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	}