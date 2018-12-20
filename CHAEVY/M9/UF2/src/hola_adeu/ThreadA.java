package hola_adeu;
//M9-U2-010: Salutacions Hola-Adéu
import java.util.Random;

public class ThreadA extends Thread {
	
	public void run() {
		
		ThreadB tb = new ThreadB();
		Random rand = new Random();
		int temps_espera;
			for(int i = 0; i < 10; i++) {
				  synchronized (tb){
			           try{
			        	   temps_espera = rand.nextInt(2000) + 1000;
			        	   Thread.sleep(temps_espera);
			        	   System.out.println("Hola");
			        	   tb.run();
			        	   tb.wait();
			           } catch (InterruptedException e){
			               e.printStackTrace();
			           }	
			       }
				
				
				
			}
		
	}

}
