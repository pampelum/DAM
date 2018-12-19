package tad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MyPilaGeneric<Integer> pila = new MyPilaGeneric<>(10);
		
		pila.empilar(2);
		pila.empilar(3);
		
		System.out.println(pila.desempilar());
		System.out.println(pila.desempilar());
	}

}
