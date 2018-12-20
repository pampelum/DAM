package main;

public class Main extends Thread{
	
	private int[] vector = {1,1,1,1,1,1,1,1,1};
	private int thread_n;
	private static int[] resultat_parcial = {0,0,0};
	
	
	public void run()
	{
		int thID = Integer.parseInt(Thread.currentThread().getName());
		int llargada = vector.length;
		int midablock = llargada / thread_n;
		int start = thID * midablock;
		int end = start + midablock;
		int suma = 0;
		
		for(int i = start; i < end; i++)
		{
			suma = suma + vector[i];
		}
		
		resultat_parcial[thID] = suma;
	}
	
	public static void main(String[] args) throws InterruptedException {
		int block_size = 3;
		int thread_number = 3;
		int llargada = block_size * thread_number;
		int sum_temp = 0;
		
		Thread t0 = new Thread();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		t0.setName("0");
		t1.setName("1");
		t2.setName("2");
		
		t0.start();
		t1.start();
		t2.start();
		
		t0.join();
		t1.join();
		t2.join();
		
		for(int i = 0; i < thread_number; i++)
		{
			sum_temp = sum_temp + resultat_parcial[i];
		}
		
		System.out.println(sum_temp);
	}

}
