package Pila_Gen;

public class Capacitat extends Exception{
	
	private int c;
	
	public Capacitat(int n)
	{
		this.c = n;
	}
	
	public int get() 
	{
		return this.c;
	}
}
