package excepcio_fora_rang;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String continuar = "";
		int num;
		
		do {
			num = introduirNombre();
			num = 1/num;
			System.out.println(num);
			System.out.println("Vols continuar");
			continuar = sc.next();
			
		}while(continuar.equals("s"));
		
	
	}
	
	public static int introduirNombre() {
		
		int numintro = 0;
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introdueix un nuemero del 0 al 10");
		numintro = sc.nextInt();
		return numintro;
	}
	/*trobar on es divideix el num per posae el try*/
	
	
	
	
	

}
