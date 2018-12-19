package m9uf2;

public class Main extends Thread {
	int threadIndex = -1;
	public Main(int i){
	threadIndex = i;
	}
	
	//el m�tode run() �s invocat per Thread.start()
	public void run(){
		int temps = 0;
		try {
			temps=(int) (Math.random () * 1000);
			Thread.sleep (temps);
		} catch (InterruptedException e) {
			 e.printStackTrace();
		}
		System.out.println("Hello! " + threadIndex + "  Temps: " +temps);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t0 = new Thread(new Main(0));
		Thread t1 = new Thread(new Main(1));
		Thread t2 = new Thread(new Main(2));
		Thread t3 = new Thread(new Main(3));
		
		t0.start(); //invocar� el m�tode run()
		t1.start();
		t2.start();
		t3.start();
		
		t0.join();
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("S'han acabat de llen�ar tots els threads");
	}
}