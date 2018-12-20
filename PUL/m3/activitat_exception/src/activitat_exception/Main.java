package activitat_exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcio = "y";
		double nombre;
		
		do {
			try {
				nombre = introduirNombre();
				nombre = 1 / nombre;
				System.out.println(nombre);
				
			} catch (ForaDeRangException e) {
				e.printStackTrace();
				
			} catch (DivisioPerZeroException e) {
				e.printStackTrace();
				
			}
		
			System.out.println("Introduir mes nombres?(y/n)");
			opcio = sc.next();
			
		}while(opcio.equals("y"));
	}
	
	
	public static double introduirNombre() throws ForaDeRangException, DivisioPerZeroException {
		double nombre;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduir nombre: ");
		nombre = sc.nextDouble();
		
		if(nombre > 0 && nombre <= 10) {
			return nombre;
		}else if(nombre == 0){
			throw new DivisioPerZeroException();
		}else {
			throw new ForaDeRangException(nombre);
		}
		
	}

}
