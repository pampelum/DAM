package Pila_Gen;

public class EstaBuida extends Exception{
	
	private boolean estaBuida;
	
	public EstaBuida(boolean e)
	{
		estaBuida = e;
	}
	
	public boolean get(){
		return estaBuida;
	}

}
