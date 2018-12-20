package Pila_Gen;

public class Empilar extends Exception{
	
	private int c;
	
	public Empilar(int n) {
		this.c = n;
	}
	
	public int get() {
		return this.c;
	}

}
