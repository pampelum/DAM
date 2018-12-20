import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int n_assignatures;
		
		LinkedList<Assignatura> ll = new LinkedList<Assignatura>();
		
		String ruta_fitxer;
		
		
		
		File fitxer;
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw;
		FileReader fr;
		BufferedReader br;
		
		
		
		System.out.print("Entra la ruta en la qual es creara el fitxer:");
		ruta_fitxer = sc.nextLine() + "\\notes.txt";
		
		fitxer = new File(ruta_fitxer);
		
		if(!fitxer.exists())
		{
			fitxer.createNewFile();
		}
		else
		{
			fitxer.delete();
			fitxer.createNewFile();
		}
		
		fw = new FileWriter(fitxer, true);
		fr = new FileReader(fitxer);
		
		br = new BufferedReader(fr);
		

		System.out.print("Entra el numero d'asignatures");
		n_assignatures = sc.nextInt();
		
		for(int i = 0; i < n_assignatures; i++)
		{
			entrarAsignatura(sc, fw);
		}
		
		
		calcular_Mitjana(br, ll);
	}
	
	public static void entrarAsignatura(Scanner sc, FileWriter fw) throws NumberFormatException, IOException
	{
		String asignatura;
		String escriure;
		
		int nota;
		
		asignatura = demanarAsignatura(sc);
		
		nota = demanarNota(sc);
		
		escriure = asignatura + "," + nota;
		
		fw.write(escriure + System.getProperty("line.separator"));
		fw.flush();
	}
	
	public static int demanarNota(Scanner sc)
	{
		int nota;
		
		do {
			System.out.print("Entra la nota: ");
			nota = sc.nextInt();
			
			if(nota < 0 && nota > 10)
			{
				System.out.println("Nota Incorrecte");
				System.out.println("Torna a entrar la nota");
			}
			
			
		}while(nota < 0 && nota > 10);
		
		return nota;
	}

	public static String demanarAsignatura(Scanner sc)
	{
		String asignatura;
		
		System.out.print("Entra el nom de l'asignatura");
		asignatura = sc.next();
		
		return asignatura;
	}

	public static void calcular_Mitjana(BufferedReader br, LinkedList<Assignatura> ll) throws IOException
	{
		String entrada = "";
		String [] temp;
		
		int total_nota = 0;
		int total_assignatures = 0;
		
		entrada = br.readLine();
		
		do
		{
			temp = entrada.split(",");
			
			ll.add(new Assignatura(Integer.parseInt(temp[1]), temp[0]));
			
			entrada = br.readLine();
		}while(entrada != null);
		
		for(int i = 0; i < ll.size(); i++)
		{
			total_nota += ll.get(i).nota;
			total_assignatures += i;
		}
		
		System.out.println("La nota mitjana es de: " + (total_nota / (total_assignatures + 1)));
	}

}

class Assignatura
{
	int nota;
	String asignatura;
	
	Assignatura(int n, String a)
	{
		this.nota = n;
		this.asignatura = a;
	}
}
