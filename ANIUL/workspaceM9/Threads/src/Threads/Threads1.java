package Threads;

public class Threads1 extends Thread {
	 int threadIndex = -1;
	 
	 public Threads1(int i){
		 threadIndex = i;
		 
	 }
	 
	 //el mètode run() és invocat per Thread.start()
	 public void run(){
		 double time = Math.random () * 1000; //calcular temps d'espera
		 try {
			 Thread.sleep ((int) (time));
			 } catch (InterruptedException e) {
			 e.printStackTrace();
			 }
		 
		 System.out.println("Hello! " + this.getId() + " " +time);
	 }
	 
	 public static void main(String[] args) throws InterruptedException {
	 Thread t0 = new Thread(new Threads1(0));
	 Thread t1 = new Thread(new Threads1(1));
	 Thread t2 = new Thread(new Threads1(2));
	 Thread t3 = new Thread(new Threads1(3));
	 
	 t0.start(); //invocarà el mètode run()
	 t1.start();
	 t2.start();
	 t3.start();
	 
	 t0.join();
	 t1.join();
	 t2.join();
	 t3.join();
	 
	 System.out.println("S'ha llancat tots els threads");
	 }
	}

