package interprocesscom;

public class ThreadB extends Thread{

	
	public void run() {
		int contador = 0;
		
		while(contador < 10) {
			synchronized(this) {
			System.out.println("Adeu txiu");
			this.notify();
			try {
				this.wait();
				contador++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}
	}

	public static void main(String[] args) {
		

	}

}
