package noms;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Llistat_telefon llistat = new Llistat_telefon();
		
		int opc = 0;;
		String nom;
		String lletra;
		String cognom;
		int tel;
		
		//anar mostrarnt el menu per triar les opcions un cop has fet una accio
		while(opc != 6) {
			//menu
			System.out.println("Opcio:");
			System.out.println("1). Afegir Persona");
			System.out.println("2). Mostrar Contactes(Lletra)");
			System.out.println("3). Borrar Contacte");
			System.out.println("4). Buscar Contacte per nom");
			System.out.println("5). Buscar Contacte per cognom");
			System.out.println("6). Sortir");
			
			opc = sc.nextInt();
			
			//switch on es crida cada opcio del menu
			switch(opc)
			{
			case 1://opcio 1 afegir persona
				System.out.print("Entra el nom:");
				nom = sc.next();
				System.out.print("Entra el cognom:");
				cognom = sc.next();
				System.out.print("Entra el telefon");
				tel = sc.nextInt();
				llistat.afegir_persona(nom, tel, cognom);
				break;
			case 2://opcio 2 mostrar contaces de una lletra
				System.out.println("Entra la lletra");
				lletra = sc.next().toUpperCase();
				llistat.mostrar_contactes_lletra(lletra);
				break;
			case 3://opcio 3 borrar contaces
				System.out.print("Contacte a borrar:");
				nom = sc.next();
				llistat.borrar(nom);
				break;
			case 4://opcio 4 buscar contacte per el nom
				System.out.print("Introduiex la persona a buscar:");
				nom = sc.next();
				llistat.buscar_nom(nom);
				break;
			case 5://opcio 5 buscar contace per el cognom
				System.out.print("Introduiex la persona a buscar:");
				nom = sc.next();
				llistat.buscar_cognom(nom);
			case 6://opcio de sortir no fa res
				break;	
			default://si no es cap de les enteriror mostrar un missatge
				System.out.println("No es una opcio Valida");	
			}
		}
	}
}
