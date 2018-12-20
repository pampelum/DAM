package Sincronitzacio;

public class Sincro1 implements Runnable{
	
	private int id = 0;
	
	public static void main(String[] args) {
		Sincro1 obj = new Sincro1();
		
		Thread t1 = new Thread(obj);
		t1.setName("Thread 1");
		Thread t2 = new Thread(obj);
		t2.setName("Thread 2");
		Thread t3 = new Thread(obj);
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();	

	}

	@Override
	public void run() {
		//codi no bloquejat no
		//id++;
		//System.out.println(Thread.currentThread().getName() + " te id = " + id);
		
		//codi bloquejat
		synchronized(this){
			id++;
			System.out.println(Thread.currentThread().getName() + " te id = " + id);
		}

	}

}
