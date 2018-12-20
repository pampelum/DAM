package threads;

public class Main extends Thread {
	 int threadIndex = -1;
	 public Main(int i){
	 threadIndex = i;
	 }
	 //el mètode run() és invocat per Thread.start()
	 public void run(){
		
		 int time = 0;
	
		 try {
			 time = (int) (Math.random () * 1000);
		 Thread.sleep (time);
		 
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
	
		 System.out.println("Hello! " + this.getId() +" "+ time);
		}	
	 
	 public static void main(String[] args) throws InterruptedException {
	 Thread t0 = new Thread(new Main(0));
	 Thread t1 = new Thread(new Main(1));
	 Thread t2 = new Thread(new Main(2));
	 Thread t3 = new Thread(new Main(3));
	 t0.start(); //invocarà el mètode run()
	 t1.start();
	 t2.start();
	 t3.start();
	 
	 t0.join();
	 t1.join();
	 t2.join();
	 t3.join();
	 System.out.println("S'han acabat tots els threads");
	 }
	}
