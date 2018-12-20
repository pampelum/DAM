package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int iteracions;
		String frase;
		char[] stan = "stanlee".toCharArray();
		int posLletra;
		int qtatLletres;
		int qtatStan;
		
		Scanner sc = new Scanner(System.in);
		iteracions = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < iteracions; i++) {
			frase = sc.nextLine();
			frase = frase.toLowerCase();
			posLletra = 0;
			qtatStan = 0;
			
			char[] charFrase = frase.toCharArray();
			
			for(int y = 0; y < charFrase.length; y++) {

				if(charFrase[y] == stan[posLletra]) {
					posLletra++;
				}
				
				if(posLletra == stan.length-1) {
					qtatStan++;
					posLletra = 0;
				}
			}
			
			System.out.println(qtatStan);
		}
	}

}
