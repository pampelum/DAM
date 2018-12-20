package Llegir1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);//inicialitzar Scanner
		int lectura = 1;//inicialitzar variable lectura que guardara el num de caracter
		char lletra;//guardar el caracter un cop llegir
		
		//demanar la ruta del fitxer
		System.out.print("entra la ruta del fitxer:");
		String ruta = sc.next();
		
		//inicialitzar el fitxer
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(fr);
		
		//recorer el fitxer mentres hi hagi caracters
		while((lectura = br.read()) >0)
		{
			lletra = (char)lectura;//passar el numero a caracter
			
			//si el caracter es mes petit de 32 no el mostrara
			if(lectura > 32)
			{
				System.out.print(lletra);//mostrar la lletra
			}
		}
		
		//tencar els readers
		br.close();
		fr.close();
	}
}
