package holaAdeu;

import java.util.Random;

public class Thread2 extends Thread{
	Thread1 t1;
	
	Thread2(Thread1 t1){
		this.t1 = t1;
	}
	
	public void run() {
		Random rnd = new Random();
		int tempsSleepMillis;
		
		synchronized(t1) {
			try {
				while(true) {
					
					t1.wait();
					
					tempsSleepMillis = rnd.nextInt(400)+100;
					Thread.sleep(tempsSleepMillis);
					System.out.println("Adeu");
					
					t1.notify();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
