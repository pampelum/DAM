
package tad;

public class MyPilaGeneric<T> {
	private Object[] pila = null;
	private int top;
	
	/*
	 * crear_pila. Utiltiza un array per emmagatzemar les cadenes de caràcter
	 * 
	 * Pre:
	 * Post: la pila té la capacitat indicada. Top -1, ja que no hi ha cap element
	 * Err: Nombres negatius no acceptats 
	 */
	MyPilaGeneric(int capacitat){
		if(capacitat > 0) {
			pila = new Object[capacitat];
			top = -1;
		} else {
			System.err.println("No es pot crear la pila.");
			System.err.println("La capacitat de la pila ha de ser major de 0.");
		}
	}
	
	/*
	 * empilar.
	 * Pre: La pila no esta plena
	 * Post: L'element del cim �s l'element empilat
	 * Err: La pila esta plena
	*/
	public void empilar(T e) {
		
		if(top < capacitatMenysU()) {
			top++;
			pila[top] = e;
		}else {
			System.err.println("Error: pila plena");
		}
	}
	
	/*
	 * desempilar.
	 * Pre: La pila no esta buida
	 * Post: la pila te els valors anteriors menys el desempilat
	 * Err: la pila ja esta buida
	 */
	@SuppressWarnings("unchecked")
	public T desempilar() {
		T desempilat;
		
		if(estaBuida()) {
			System.err.println("Error: la pila ja esta buida");
		}else {
			desempilat=(T)pila[top];
			pila[top]="null";
			top--;
			return desempilat;
		}
		
		return null;

	}
	
	/*
	 * cim.
	 * Pre: La pila no esta buida
	 * Post: La pila es queda igual
	 * Err: La pila esta buida
	 */
	public T cim() {
		
		if(estaBuida()) {
			System.err.println("Error: la pila esta buida");
		}else {
			return (T)pila[top];
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
		}else {
			return false;
		}
		
	}
	
	public int capacitat() {
		return pila.length;
	}
	
	public int capacitatMenysU() {
		return capacitat()-1;
	}
	
	public int grandaria() {
		return top+1;
		
	}
	
	public void llistarPila() {
		
		for(int x=0;x<=top;x++) {
			
			if(x != top) {
				System.out.print("\""+pila[x]+"\", ");
			}else {
				System.out.print("\""+pila[x]+"\"");
			}
			
		}

	}
}
