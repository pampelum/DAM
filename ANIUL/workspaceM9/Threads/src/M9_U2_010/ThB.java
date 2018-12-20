package M9_U2_010;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ThB extends Thread{

	int contador = 0;
	Random rand = new Random();


	public void run()
	{
		while(contador < 11) {
			synchronized(this){
				try
				{
					int  value = rand.nextInt((300 - 100) + 100) + 1;//agar un valor aleatori entre 300 i 100
					
					this.sleep(value);//fer un sleep del temps aleatori
					System.out.println(contador + " " +"Adeu" + " " + time());//mostrar el codi+
					contador++;//sumar contador
					this.notify();//notificar
					this.wait();//esperar
				}
				catch(InterruptedException e1)
				{
					e1.printStackTrace();
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
