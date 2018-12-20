//package Pila_Gen;
//
//
///*
// * MyPilaString
// * 
// * Pila de cadenes de caràcter (String) implementada amb arrays, on la capacitat inicial s'indica
// * en el moment de la creació.
// * 
// * 
//*/
//public class MyPilaString <T> {
//	private Array<Object> pila = null;
//	private int top;
//	
//	/*
//	 * crear_pila. Utiltiza un array per emmagatzemar les cadenes de caràcter
//	 * 
//	 * Pre:
//	 * Post: la pila té la capacitat indicada. Top -1, ja que no hi ha cap element
//	 * Err: Nombres negatius no acceptats 
//	 */
//	MyPilaString(int capacitat)
//	{
//		//comprova si la capacitat entrada es mes gran que 0
////		try
////		{
////			capcitatMesGran0(capacitat);
////			pila = new Array(capacitat);
////			top = -1;
////		} 
////		catch(Capacitat n)//si es mes petita inicialitza larray amb 0 i surt en error
////		{
////			pila = new Array(0);
////			top = -1;
////			System.err.println("No es pot crear la pila.");
////			System.err.println("La capacitat de la pila ha de ser major de 0.");
////		}
//	}
//	
//	/*
//	 * empilar.
//	 * Pre: comprovar que la pila no estigui plena
//	 * Post: La pila te un valor mes
//	 * Err: 
//	*/
//	public void empilar(T e) 
//	{
//		//comprova si hi ha espai per poder empilar
//		try
//		{
//			pilaPlena();
//			if(top == -1)
//			{
//				top++;
//				pila.set(top, e);
//			}
//			else
//			{
//				T cim = cim();
//				tipus(cim, e);//comprovar si son del mateix tipus
//				top++;
//				pila.set(top, e);
//			}
//		}
//		catch(Empilar n)//si no hi ha espai
//		{
//			System.err.println("Pila Plena");
//		}
//		catch(Tipus n)//si no es del mateix tipus salta un error
//		{
//			System.err.println("No es del mateix tipus");
//		}
//	}
//	
//	/*
//	 * desempilar.
//	 * Pre: comprovar si la pila no esta buida
//	 * Post: la pila te un valor menys
//	 * Err:
//	 */
//	public T desempilar() {
//		T s = null;
//		
//		//comprovar si la pila no esta buida
//		try 
//		{
//			estaBuida();
//			s = (T) pila.get(top);
//			top--;
//			
//		}
//		catch(EstaBuida n)//si esta buida salta un error
//		{
//			System.err.println("LA PILA ESTA BUIDA");
//		}
//		
//		return s;
//	}
//	
//	/*
//	 * cim.
//	 * Pre: Comprovar que la pila no esta buida
//	 * Post: Ens retorna el sim
//	 * Err:
//	 */
//	public T cim() 
//	{
//		//comprovar si la pila no esta buida
//		try
//		{
//			estaBuida();
//			return (T) pila.get(top);
//		}
//		catch(EstaBuida n)//si esta buida salta un error
//		{
//			System.out.println("LA PILA ESTA BUIDA");
//		}
//		
//		return null;
//	}
//	
//	/*
//	 * estaBuida. Retorna cert si no hi ha cap element a la pila
//	 * Pre:
//	 * Post: La pila no ha canviat
//	 */
//	public void estaBuida() throws EstaBuida {
//		
//		if(top == -1) {
//			throw new EstaBuida(true);
//		}
//		
//	}
//	
//	/*
//	 * capacitat
//	 * Pre:
//	 * Post: Ens retorna la capacitat que te
//	 * Err:
//	 */
//	
//	public int capacitat()
//	{
//		return pila.length;
//	}
//	
//	/*
//	 * capacitat
//	 * Pre:
//	 * Post: Ens retorna la capacitat que te
//	 * Err:
//	 */
//	
//	public int capacitatMenys1()
//	{
//		return pila.length-1;
//	}
//	
//	/*
//	 * mostrar
//	 * Pre: 
//	 * Post: ens mostra tot el contingut de la pila
//	 * Err:
//	 */
//	public void mostrar()
//	{
//		System.out.print("[");
//		
//		for(int i = 0; i <= top; i++)
//		{
//			System.out.print("\"" + pila.get(i) + "\"");
//			
//			if(i < top)
//			{
//				System.out.print(", ");
//			}
//		}
//		
//		System.out.print("]");
//	}
//	
//	public void capcitatMesGran0(int n) throws Capacitat
//	{
//		if(n <= 0)
//		{
//			throw new Capacitat(n);
//		}
//	}
//	
//	public void pilaPlena() throws Empilar {
//		if(top >= capacitatMenys1()) {
//			throw new Empilar(top);
//		}
//	}
//	
//	public void tipus(T top, T e) throws Tipus{
//		if(top.getClass() != e.getClass())
//		{
//			throw new Tipus(1);
//		}
//	}
//
//}
