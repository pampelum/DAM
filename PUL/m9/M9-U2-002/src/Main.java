public class Main extends Thread {
	
	final static int nombresPerThread=2;
	final static int nombreDeThreads=4;
	int threadIndex = -1;
	
	public Main(int i){
		threadIndex = i;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread arrayThreads[]=new Thread[nombreDeThreads];
		
		inicialitzarThreads(arrayThreads);
		
	}
	
	public void run(){
		int iInici = threadIndex*nombresPerThread;
		int iFinal = (threadIndex+1)*nombresPerThread;
		
		for(int x=iInici; x<iFinal; x++) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}
	
	public static void inicialitzarThreads(Thread[] arrayThreads) {
		for(int i=0;i<nombreDeThreads;i++) {
			arrayThreads[i]=new Thread(new Main(i));
			arrayThreads[i].start();
		}
	}

}