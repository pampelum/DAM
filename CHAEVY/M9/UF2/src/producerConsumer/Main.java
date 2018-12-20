package producerConsumer;

import java.util.LinkedList;

public class Main {
	
	static LinkedList <Long> list = new LinkedList<Long>();
	
	final static int Capacity = 6;
	
	public static void main(String[] args) throws InterruptedException {
		
		Main obj = new Main();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.Produce();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
						
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.Consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

	public void Produce() throws InterruptedException {
		long dada = 0L;
		
		while(true) {
			synchronized(this) {
				if(list.size() == Capacity) {
					wait();
				}else {
					System.out.println("El productor ha produit " + dada);
					list.add(dada);
					dada++;
					notifyAll();
					
				}
			}Thread.sleep(1000);
		}
		
	}
	
	public void Consumer() throws InterruptedException {
		long valor;
		
		while(true) {
			synchronized(this){
				if(list.isEmpty()) {
					wait();
				}else {
					valor = list.removeFirst();
					System.out.println("S'ha eliminat el valor " + valor);
					notifyAll();
				}
			}Thread.sleep(5000);
		}
	}
}
