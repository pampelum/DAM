package act_directori;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    int iteracions;
        int posInicial, posPrimera, posSegona, distanciaPrimera, distanciaSegona; 

        Scanner sc = new Scanner(System.in);

        iteracions = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < iteracions; i++) {
            posInicial = sc.nextInt();
            posPrimera = sc.nextInt();
            posSegona = sc.nextInt();

            distanciaPrimera = Math.abs(posInicial - posPrimera);
            distanciaPrimera = Math.abs(distanciaPrimera - posSegona);
            distanciaSegona = Math.abs(posInicial - posSegona);
            distanciaSegona = Math.abs(distanciaPrimera - posPrimera);

            System.out.println(distanciaPrimera);
            System.out.println(distanciaSegona);

            if(distanciaPrimera < distanciaSegona) {
                System.out.println(distanciaPrimera);
            }else {
                System.out.println(distanciaSegona);
            }
        }
    }


	}

