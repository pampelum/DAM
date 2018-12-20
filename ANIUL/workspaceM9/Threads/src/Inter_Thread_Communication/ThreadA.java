package Inter_Thread_Communication;


public class ThreadA {

	
	public static void main(String[] args) {
		ThreadB t = new ThreadB();
		t.start();

		synchronized (t){
			try{
				System.out.println("Waiting for t to complete...");
				t.wait();

				System.out.println("Total is: " + t.total);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}

