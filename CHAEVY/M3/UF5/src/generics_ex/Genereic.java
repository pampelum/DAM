package generics_ex;

public class Genereic <T> implements Comparable <T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 666;
	}

}

