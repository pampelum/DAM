package Producer_Consumer;

public class CubbyHole {
	private int contents;
	private boolean available = false;

	public synchronized int get() {
		if (available == false) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		available = false;
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int value) {
	    if (available == true) {
	        try {
	            wait();
	        } catch (InterruptedException e) { }
	    }
	    contents = value;
	    available = true;
	    notifyAll();
	}
}