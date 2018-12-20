package Classes_Genèriques;

public class GenericsTypeOld<T> implements Comparable<T>{

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
	public static <T extends Comparable<T>> T maximun (T x, T y, T z)
	{
		T max = x;
		
		
		
		return max;
	}

	@Override
	public int compareTo(T arg0) {
		
		return 0;
	}
	
}
