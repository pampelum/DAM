package main;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean fi = false;

		do
		{
			try {
				System.out.println("Entra un numero de 0 a 10:");
				numero = sc.nextInt();
				calcular(numero);
			}
			catch(ForaRang r)
			{
				System.out.println("Fora Rang");
			}
			catch(ArithmeticException e)
			{
				System.out.println("No es pot dividir per 0");
			}
			
			
		}while(fi != true);
	}
	
	public static void calcular(int n) throws ForaRang
	{
		if(n >= 0 && n <=10)
		{
			System.out.println(1/n);
		}
		else
		{
			throw new ForaRang(n);
		}
	}
}
