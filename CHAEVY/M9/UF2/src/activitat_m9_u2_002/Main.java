package activitat_m9_u2_002;

public class Main extends Thread {
	 int threadIndex = 0;
	 
	 public Main(int i){
	 threadIndex = i;
	 }
	
	 public void run(){
		 
		 int inici = threadIndex*10;
		  
		 for(int x = 0; x < 9 ; x++ ) {
			 System.out.print((inici + x )+" ");
		 }
		 System.out.println();
	 }
	 
	 public static void main(String[] args) throws InterruptedException {
		 Thread t0 = new Thread(new Main(0));
		 Thread t1 = new Thread(new Main(1));
		 Thread t2 = new Thread(new Main(2));
		 Thread t3 = new Thread(new Main(3));
		 Thread t4 = new Thread(new Main(4));
		 t0.start(); 
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
		 
		 /**
		  * 
		  * @param "nom parametre" "descripcio param"
		  * 
		  */
		 
		 
		 
		 
	 }
	}