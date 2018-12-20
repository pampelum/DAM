package tarta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iteracions = sc.nextInt();
		int tabletaH, tabletaV;
		int necessari;
		int resultat;
		
		for(int i = 0; i < iteracions; i++) {
			tabletaH = sc.nextInt();
			tabletaV = sc.nextInt();
			necessari = sc.nextInt();
			
			resultat = necessari / (tabletaH * tabletaV) ;
			
			if(resultat * (tabletaH * tabletaV) >= necessari) {
				System.out.println(resultat);
			}else {
				System.out.println(resultat+1);
			}
		}
		
		
	}

}
