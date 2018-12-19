package comunicacio;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new ThreadA();
		
		t1.run();
	}

}
