/*
 * MyPilaString
 * 
 * Pila de cadenes de caràcter (String) implementada amb arrays, on la capacitat inicial s'indica
 * en el moment de la creació.
 * 
 * 
*/
public class MyPilaString {
	private String[] pila = null;
	private int top;
	
	/*
	 * crear_pila. Utiltiza un array per emmagatzemar les cadenes de caràcter
	 * 
	 * Pre:
	 * Post: la pila té la capacitat indicada. Top -1, ja que no hi ha cap element
	 * Err: Nombres negatius no acceptats 
	 */
	MyPilaString(int capacitat)
	{
		if(capacitat > 0) {
			pila = new String[capacitat];
			top = -1;
		} else {
			System.err.println("No es pot crear la pila.");
			System.err.println("La capacitat de la pila ha de ser major de 0.");
		}
	}
	
	/*
	 * empilar.
	 * Pre: comprovar que la pila no estigui plena
	 * Post: La pila te un valor mes
	 * Err: 
	*/
	public void empilar(String e) {
		
		if(top < capacitatMenys1())
		{
			top++;
			pila[top] = e;
		}
		else
		{
			System.err.println("Pila Plena");
		}
	}
	
	/*
	 * desempilar.
	 * Pre: comprovar si la pila no esta buida
	 * Post: la pila te un valor menys
	 * Err:
	 */
	public String desempilar() {
		String s = "";
		
		if(!estaBuida())
		{
			s = pila[top];
			pila[top] = null;
			top--;
			
		}
		else
		{
			System.err.println("Pila buida");
		}
		
		return new String(s);
		
	}
	
	/*
	 * cim.
	 * Pre: Comprovar que la pila no esta buida
	 * Post: Ens retorna el sim
	 * Err:
	 */
	public String cim() {
		
		if(!estaBuida())
		{
			return new String(pila[top]);
		}
		
		return null;
	}
	
	/*
	 * estaBuida. Retorna cert si no hi ha cap element a la pila
	 * Pre:
	 * Post: La pila no ha canviat
	 */
	public boolean estaBuida() {
		
		if(top == -1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/*
	 * capacitat
	 * Pre:
	 * Post: Ens retorna la capacitat que te
	 * Err:
	 */
	
	public int capacitat()
	{
		return pila.length;
	}
	
	/*
	 * capacitat
	 * Pre:
	 * Post: Ens retorna la capacitat que te
	 * Err:
	 */
	
	public int capacitatMenys1()
	{
		return pila.length-1;
	}
	
	/*
	 * mostrar
	 * Pre: 
	 * Post: ens mostra tot el contingut de la pila
	 * Err:
	 */
	public void mostrar()
	{
		System.out.print("[");
		
		for(int i = 0; i <= top; i++)
		{
			System.out.print("\"" + pila[i] + "\"");
			
			if(i < top)
			{
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
	}

}
