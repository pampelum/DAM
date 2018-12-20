public class Main {

	public static void main(String[] args) {
		MyPilaString pila = new MyPilaString(4);
		
		pila.empilar("Primer");
		pila.empilar("Segon");
		pila.empilar("Tercer");

		
		System.out.println("Cim de la pila:" + pila.cim());
		
		pila.desempilar();
		System.out.println("Cim de la pila:" + pila.cim());
		
		pila.desempilar();
		pila.desempilar();
		pila.desempilar();
		pila.desempilar();
		
		System.out.println("Esta† buida la pila? " + pila.estaBuida());
		
		pila.empilar("First");
		pila.empilar("Second");
		pila.empilar("Third");
		pila.empilar("Fourth");
		pila.empilar("Fith"); //Hauria de donar error i no penjar el programna
		pila.empilar("Sixth"); // Hauria de doanr error i no penjar el programa
		
		pila.mostrar();
		
		/* Tasca:
		 * Acaba d'implementar la pila
		 * Afegeix els m√®todes de: llistar el contingut sense que canvi el contingut de la pila
		 * Afegeix controls d'errors en les operacions per a que no es quedi el programa penjat i
		 *   es mostrin missatges adequats
		 */
		
	}

}
