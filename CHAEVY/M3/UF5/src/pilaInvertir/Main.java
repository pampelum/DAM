package pilaInvertir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main  {

		/* Llegir paraules separades per caracters blancs de la entrada estandard
		 * No li importa si hi ha diverses linies en el text d'entrada.
		 */
		public static void main(String[] args) throws FileNotFoundException {
			
			
			MyPilaString pila = new MyPilaString(1000);
			
			//creem arxiu
		//	String ruta="C:\\Users\\Dipard\\Desktop\\hola.txt";
//			File file =new File(ruta);
	//		arxiu(ruta,file);

			Scanner sc = new Scanner(System.in);
			sc.useDelimiter("\\s+"); //qualsevol grup d'espais en blanc (també tabs) 
			
			String w = "";
		
			while(sc.hasNextLine()) {
				w = sc.next();
				if(w.compareTo("FI.") != 0){
					if(w.contains(".") == true){
						pila.empilar(w);
						pila.llistarInvertit();
						for(int x = -1; x < pila.top; x++) {
							pila.desempilar();
						}
					}
					else {
						pila.empilar(w);
					}
				}	
			}
			sc.close();	
		}
		private static void arxiu(String ruta, File file) {
			// TODO Auto-generated method stub
			
		}

}
