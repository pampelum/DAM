package Inter_Thread_Communication;

public class ThreadB extends Thread {
	   int total = 0;

	   @Override
	   public void run() {
	       synchronized (this){
	           for(int i = 0; i<100; i++){
	               total += i;
	           }
	           try {
	               Thread.sleep(5000);
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }

	           notify();
	       }
	   }
	}
