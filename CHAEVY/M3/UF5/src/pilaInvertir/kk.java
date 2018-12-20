package pilaInvertir;

public class kk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyPilaString pila = new MyPilaString(3);
		
		pila.empilar("Primer");
		pila.empilar("Segon");
		pila.empilar("Tercer");
		
		pila.llistarInvertit();
	}

}
