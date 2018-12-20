package ex_Producer_Consumer;

import java.net.SocketTimeoutException;
import java.util.LinkedList;
import java.util.Queue;

public class PC {
	LinkedList<Long> list = new LinkedList<>();
	//cua.add
	//cua.remove
	int capacitat = 0;
	
    final int capacity = 4; 
    
	public void produce() throws InterruptedException {
		//Inicialitzem dades a generar
		
		long dada = 0L;
		
		while( true )
		{	
			synchronized(this)
			{
				while( list.size() >= capacity ) {
					wait();
				}
				
				//si es mes petita
					System.out.println("Producer produced-" + dada);
					dada++;
					list.add(dada); //afegim dada a la cua, i calculem nova dada
					notify();
				
				
			
				//afegir codi
				Thread.sleep(500);
			}
		}
		
	}

	public void consume() throws InterruptedException {
		while( true )
		{
			synchronized(this)
			{
				while( list.size() == 0 ) {
					wait();
				}

				long val = list.removeFirst() ;
				System.out.println("Consumer consumed-" + val + " Arrel: "+ Math.sqrt(val));
				notify();
				Thread.sleep(500);
			}	
		}
	}

}
