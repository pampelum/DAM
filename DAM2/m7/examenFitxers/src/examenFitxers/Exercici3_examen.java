package examenFitxers;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Exercici3_examen {

	public static void main(String[] args) throws IOException {
		final int diferencia = (int)('a') - (int)('A');
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix la ruta: ");
		String ruta = sc.next()+"\\invertirMinMay.txt";
		File file = new File(ruta);		//Instanciar fitxer
		FileWriter fw = new FileWriter(file);
		FileReader fr = new FileReader(file);
		
		String frase = "";
		String fraseReves = "";
		char lletra = '-';
		char[] cFrase;
		
		if(file.canWrite() == false){	//Error de permisos
			System.out.println("No es pot escriure al fitxer");
		}
		
		
		System.out.println("Escriu paraules( escriu sortir per parar)");
		while(frase.equals("sortir") == false) {
			frase = sc.next();
			if(frase.equals("sortir") == false) {
				frase += " ";
				fw.write(frase);
			}
			
		}
		
		fw.flush();
		fw.close();	
		
		while(lletra != (char)-1) {
			lletra = (char) fr.read();
			
			if(lletra != (char)-1) {
				if(lletra >= 'a' && lletra <= 'z') {
					fraseReves += (char)(lletra - diferencia);
				}else if(lletra >= 'A' && lletra <= 'Z') {
					fraseReves += (char)(lletra + diferencia);
				}else {
					fraseReves += (char)(lletra);
				}
			}
		}
		
		System.out.println(fraseReves);
	}

}
//C:\Users\er_Pozo\Desktop
