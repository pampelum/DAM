public class Main extends Thread {
	
	//el mètode run() és invocat per Thread.start()
	public void run(){
		System.out.println("Hello! " + this.getId());
	}
	
	public static void main(String[] args) {
		Thread t0 = new Thread(new Main());
		Thread t1 = new Thread(new Main());
		Thread t2 = new Thread(new Main());
		Thread t3 = new Thread(new Main());
		t0.start(); //invocarà el mètode run()
		t1.start();
		t2.start();
		t3.start();
	}
	
}