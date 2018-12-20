/**
 * 
 */
package Threads;

/**
 * @author usuari
 *
 */
public class m9u2002 extends Thread{

	int threadIndex = -1;
	static int num_thread = 2;
	static int bloc = 3 ;

	public m9u2002(int i){
		threadIndex = i;
	}

	public void run() {
		int inici = threadIndex * bloc;
		for(int i = 0; i < bloc; i++)
		{
			System.out.print(inici + i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {


		Thread threads[] = new Thread[num_thread];
		
		for(int i = 0; i < threads.length; i++)
		{
			threads[i] = new m9u2002(i);
			threads[i].start();
		}
		

	}

}
