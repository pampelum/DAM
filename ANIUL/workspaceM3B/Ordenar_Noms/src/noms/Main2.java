package noms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Llistat_telefon llistat = new Llistat_telefon();
		
		String nom, cognom;
		int telefon;
		
		
		while(sc.hasNext())
		{
			nom = sc.next();
			cognom = sc.next();
			telefon = sc.nextInt();
			llistat.afegir_persona(nom, telefon, cognom);
			System.out.println(nom + cognom + telefon);
		}
		
		
	}

}
