package comunicacio;

public class ThreadA extends Thread{
	   public void run(){
	       ThreadB t2 = new ThreadB();
	       t2.start();

	       synchronized (t2){
	           try{
	               System.out.println("Waiting for t to complete...");
	               t2.wait();

	               System.out.println("Total is: " + t2.total);
	           } catch (InterruptedException e){
	               e.printStackTrace();
	           }
	       }
	   }
}

