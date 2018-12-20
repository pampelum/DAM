package exM6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//C:\Users\Dipard\Desktop
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//C:\Users\Dipard\Desktop\numeros.txt
		Scanner sc = new Scanner(System.in);
		String ruta="";
		System.out.println("Introdueix la ruta del arxiu: ");
		ruta = sc.next();
		
		File file = new File(ruta);
		FileWriter fw = new FileWriter(file);
		
		
		int num = 1;
		do {
			System.out.println("Introdueix numeros: ");
			sc.nextInt(num);
			fw.write(num);
			
		
		}while(num > 0);
		System.out.println(file);
		
	}

}
