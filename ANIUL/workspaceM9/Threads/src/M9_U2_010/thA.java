package M9_U2_010;

import java.net.SocketTimeoutException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class thA extends Thread{
	
	public void run()
	{
		ThB t = new ThB();
        t.start();

        int contador  = 0;
        int value;
        Random rand = new Random();


        while(contador <= 10 )
        {
            synchronized(t){
                try{
                	value = rand.nextInt((3 - 1) + 1) + 1;//temps despera
                	
                    System.out.println(contador + " " + "Hola" + " " + time());//mostrar lhola i el moment en que ho ha dit
                    t.sleep(value * 1000);//fer un sleep del temps
                    t.wait();//esperar
                    contador++;//sumar un al contador
                    t.notify();//notificar
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
	}
	
	private static String time()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now); //2016/11/16 12:08:43
	}
	
}
