package prodcons;

public class ThreadA extends Thread{

	public void run() {
		
		ThreadB t = new ThreadB();
		t.start();
		
		int contador = 0;
		
		while(contador < 10) {
			synchronized(t) {
			System.out.println("Hola txiu");
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t.notify();
			contador++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		
		ta.start();

	}

}

