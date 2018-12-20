package prova;



public class Main extends Thread {
 
   ThreadLocal<Integer> tIndex = new ThreadLocal<Integer>();

   public void run(){
     
	   tIndex.set(Integer.parseInt(Thread.currentThread().getName()));
       System.out.println(tIndex.get());
   }

   public static void main(String[] args) {
      Main obj = new Main();

      Thread t = new Thread(obj);
      Thread t1 = new Thread(obj);

      t.setName("Thread 0");
      t1.setName("Thread 1");
       
      t.start();
      t1.start();
   }
}
