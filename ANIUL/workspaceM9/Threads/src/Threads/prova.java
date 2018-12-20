package Threads;

public class prova extends Thread {
	ThreadLocal<Integer> tIndex = new ThreadLocal<Integer>();
	int var = 379;
	int[] var2 = { 1, 2, 3 };

	public void run() {
		System.out.println("var from " + Thread.currentThread().getName() + " is " + var + "  "
				+ Thread.currentThread().getName());
		var++;
		tIndex.set(Integer.parseInt(Thread.currentThread().getName()));
		System.out.println(tIndex.get());
	}

	public static void main(String[] args) {
		prova obj = new prova();

		// prova obj = this;

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
