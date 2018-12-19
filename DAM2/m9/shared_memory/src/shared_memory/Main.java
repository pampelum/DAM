package shared_memory;

public class Main extends Thread {
	   	int var[] = {1,2,3};
	   	ThreadLocal<Integer> tIndex = new ThreadLocal<Integer>();
	   	
	   	public void run(){
	   		tIndex.set(Integer.parseInt(Thread.currentThread().getName()));
	   		System.out.println(tIndex.get());
	   	}
	
	   	public static void main(String[] args) {
	   		Main obj = new Main();
	
	   		Thread t0 = new Thread(obj);
	   		Thread t1 = new Thread(obj);
	   		Thread t2 = new Thread(obj);
	
	   		t0.setName("0");
	   		t1.setName("1");
	   		t2.setName("2");
	   		
	   		t0.start();
	   		t1.start();
	   		t2.start();
	   }
}

