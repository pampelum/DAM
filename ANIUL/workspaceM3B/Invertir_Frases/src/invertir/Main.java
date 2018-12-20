package invertir;

import java.util.Scanner;

public class Main {

	static MyPilaString pila = new MyPilaString(100);
	
	public static void main(String[] args) {
		boolean fi = false;
		Scanner sc = new Scanner(System.in);
		
		sc.useDelimiter("\\s+"); //qualsevol grup d'espais en blanc (també tabs) 
		
		String w;
	
		
		while(sc.hasNextLine() && fi != true) {
			boolean hasPunt = false;
			boolean first = true;
			
			w = sc.next();
			
			if(w.equals("FI."))
			{
				fi = true;
			}
			
			if(!fi)
			{
				int punt = w.indexOf(".");
				
				if(punt >= 0)
				{
					w = treurePunt(w,punt);
					hasPunt = true;
				}
				
				pila.empilar(w);
				
				if(hasPunt)
				{
					mostrarPilaBuidanla();
					first = true;
				}
			}
			else
			{
				fi = true;
			}
		}
		
		sc.close();

	}
	
	private static String treurePunt(String s, int p)
	{
		StringBuilder sb = new StringBuilder(s);
		sb.deleteCharAt(p);
		return sb.toString();
	}
	
	//mostrar la pila buidant-la
	private static void mostrarPilaBuidanla()
	{
		int llargada = pila.ultima();
		for(int i = 0;i < llargada; i++)
		{
			if(i == (llargada-1))
			{
				System.out.print(pila.desempilar() + "." + " ");
			}
			else
			{
				System.out.print(pila.desempilar() + " ");
			}
		}
	}

}