package exm_proba;

import java.time.Duration;
import java.time.Instant;

public class Main extends Thread {
	final static int Midaarray = 230;
	static double arrayresultats [][] = new double [4][Midaarray];
	
	public void run() {
		int id_thread = Integer.parseInt(Thread.currentThread().getName().toString());
		
		switch(id_thread) {
		case 1://Multipicar
			for(int i = 0; i < Midaarray; i++) {
				arrayresultats[0][i] = 22 * i;
			}
			break;
			
		case 2://Dividir
			for(int i = 0; i < Midaarray; i++) {
				if(i==0) {
					arrayresultats[1][i] = 0;
				}else {
					arrayresultats[1][i] = (double)22 / i;
				}
			}
			break;
			
		case 3://expontent
			for(int i = 0; i < Midaarray; i++) {
				arrayresultats[2][i] = Math.pow(22, i);
			}
			break;
			
		case 4://arrel quadrada
			for(int i = 0; i < Midaarray; i++) {
				arrayresultats[3][i] = Math.sqrt(22 * i);
			}
			break;
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Main obj = new Main();
		
	
		//Creacio dels threads
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj);
		
		t1.setName("1");
		t2.setName("2");
		t3.setName("3");
		t4.setName("4");
		
		Instant start = Instant.now();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		Instant end = Instant.now();
		Duration timeElapsed = Duration .between(start, end);
		imprimirArrays();
		System.out.println("Temps tardart: " + timeElapsed.toMillis() + " miliseconds");
		
	}
	
	
	public static void imprimirArrays() {
		for(int i = 0; i < Midaarray; i++) {
			for(int x = 0; x < 4; x++) {
				System.out.print(arrayresultats[x][i]+"\t"+"\t");
			}
		System.out.println();
		}
	}

}
