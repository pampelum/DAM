import java.util.LinkedList;
import java.util.Queue;

public class PC {
	LinkedList<Long> list = new LinkedList<>();
	//cua.add
	//cua.remove
	
    final int capacity = 4; 
    
	public synchronized void produce() throws InterruptedException {
		//Inicialitzem dades a generar
		long dada = 0L;
		
		while( true ) {
			synchronized(this) {
				while (list.size() == capacity) { //si la llista esta plena esperar
					wait();
				}
				
				System.out.println("Producer produced-" + dada);
				list.add(dada++); //afegim dada a la cua, i calculem nova dada
				notifyAll(); //notificar quan es produeix
				
				Thread.sleep(1000);
			}
		}
		
	}

	public void consume() throws InterruptedException {
		double arrel;
		
		while( true ) {
			synchronized(this) {
				
				while (list.isEmpty()) { //si esta buida esperar
					wait();
				}
				
				long val = list.removeFirst() ;
				arrel = Math.sqrt(val);
				System.out.println("Consumer consumed-" + val + " Square Root: " + arrel);
				notifyAll(); //notificar quan es consimeix un valor	
				
				Thread.sleep(100);
			}
		}
		
	}

}
