package Pila_Gen;

public class Tipus extends Exception{
	
	private int c;
	
	public Tipus(int n)
	{
		this.c = n;
	}
	
	public int get() {
		return this.c;
	}

}
