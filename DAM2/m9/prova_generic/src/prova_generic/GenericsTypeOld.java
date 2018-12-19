package prova_generic;

public class GenericsTypeOld<T> implements Comparable<T> {

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	public int compareTo(T arg0) {
		return 33;
	}
}