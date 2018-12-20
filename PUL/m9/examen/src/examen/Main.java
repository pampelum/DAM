package examen;

public class Main extends Thread{

	public void run() {
		int numThread=Integer.parseInt(this.getName().toString());
		
		switch(numThread)
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj);
		
		t1.setName("1");
		t2.setName("2");
		t3.setName("3");
		t4.setName("4");

	}

}
