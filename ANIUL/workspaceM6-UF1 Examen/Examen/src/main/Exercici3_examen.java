package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercici3_examen {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String ruta;
		String entrada = "";
		String lectura;
		
		File fitxer;
		
		//demanra la ruta
		System.out.print("Entra el ruta on es creara el fitxer: ");
		ruta = sc.next() + "\\Text.txt";
		
		fitxer = new File(ruta);
		
		//comprovar si el fitxer existeix o no existeis
		if(!fitxer.exists())//si no existeix crearlo
		{
			fitxer.createNewFile();
		}
		else//si existeix borrar i crearlo aixi no hi han dades
		{
			fitxer.delete();
			fitxer.createNewFile();
		}
		
		//inicialitzar el fileWriter
		FileWriter fw = new FileWriter(fitxer, true);
		
		//inicialitzar el bufferedReader
		FileReader fr = new FileReader(fitxer);
		BufferedReader br = new BufferedReader(fr);
		
		//informar de com sortir de bucle
		System.out.println("Entra 0 per deixar de entrar paraules.");
		
		//anar demanant paraules mentres no sigui igual a 0
		while(entrada.compareTo("0") != 0)
		{
			System.out.print("Entra text: ");
			entrada = sc.nextLine();
			//si la entrada es 0 no cirdis la funcio escriure
			if(entrada.compareTo("0") != 0)
				escriure(fw,entrada);
		}
		
		lectura = br.readLine();//fer una primera lectura per treure la primera linia que es buida
		lectura = llegir(br);//fer una primera lectura del text
		
		//anar llegit larxiu fins que no hi ha contingut
		while(lectura != null)
		{
			//cridar la funcio per convertir majuscules a minisucules i de minuscules a majuscules
			convertir(lectura);
			//cridar la funcio llegir i guardar el resultat a una variable
			lectura = llegir(br);
		}
	}
	
	public static void escriure(FileWriter fw, String p) throws IOException
	{
		//escriure la lina
		fw.write(p);
		//fer un salt de linia
		fw.write(System.getProperty("line.separator"));
		//fer un flush
		fw.flush();
	}

	public static String llegir(BufferedReader br) throws IOException
	{
		String lectura;
		
		//llegir i guardar en una variable
		lectura = br.readLine();
		
		//retornar la variable
		return lectura;
	}

	public static void convertir(String s)
	{
		byte num_caracter;
		String new_String = "";
		
		//recore tots els caracters de la frase
		for(int i = 0; i < s.length(); i++)
		{
			//pasar el caracter a byte
			num_caracter = (byte) s.charAt(i);
			
			//comprovar si es minuscula
			if(num_caracter >= 97 && num_caracter <= 122)
			{
				//passar a majuscula
				num_caracter -= 32;
				//guardar la llegra a un string
				new_String += String.valueOf((char)num_caracter);
			}
			else
			{
				//comprovar si es una majusucla
				if(num_caracter >= 65 && num_caracter <= 90)
				{
					//passar a miniuscula
					num_caracter += 32;
					//guardar la lletra a un String
					new_String += String.valueOf((char)num_caracter);
				}
				else//si no es cap lletra escriure el simbol directament
				{
					new_String += String.valueOf((char)num_caracter);
				}
			}
		}
		
		//mostrar String que hem crear amb els nous caracters
		System.out.println(new_String);
	}
}
























