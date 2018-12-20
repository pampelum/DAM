package ac2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String dir;
		String file;
		String file_rename;
		String nom;
		String nom2;
		File f;
		
		System.out.print("Entra la ruda del directori a crear:");
		dir = sc.next();
		f = new File(dir);
		File directori = new File(dir);
		
		if(!f.exists())
		{
			System.out.println("Creant Directori:" + dir);
			f.mkdir();
			System.out.println("Directory Creat");
			System.out.println();
		}
		else {
			System.out.println("El Directori ja esta creat");
		}
		
		System.out.print("Entra el nom del fitxer a crear:");
		file = sc.next();
		file = dir + "\\" + file;
		f = new File(file);
		
		if(!f.exists())
		{
			System.out.println("Creant Fitxer:" + file);
			f.createNewFile();
			System.out.println("Fitxer Creat");
			System.out.println();
		}
		
		//mostrar el nom
		System.out.println("Nom:" + f.getName());
		//ruta absoluta
		System.out.println("Ruta absoluta:" + f.getAbsolutePath());
		//ruta superior
		System.out.println("Ruta superiror:" + f.getParent());
		//si es pot escriure llegir i executar
		System.out.println("Escriptura" + f.canWrite());
		System.out.println("Lecutra" + f.canRead());
		System.out.println("Excecucio" + f.canExecute());
		//mida del fitxer
		System.out.println("Mida" + f.getTotalSpace());
		//es un directori
		System.out.println("Directori?:" + f.isDirectory());
		//es un fitxer
		System.out.println("Fitxer?:" + f.isFile());
		//ultima modificacio
		System.out.println("Ultima Modificacio" + f.lastModified());
		
		//renombrar fitxer
		System.out.print("Entra el fitxer a renombrar(Ruta del fitxer):");
		file_rename = sc.next();
		System.out.print("Entra el nou nom:");
		nom2 = sc.next();
		File f2 = new File(file_rename);
		nom2 = f2.getParent() + "\\" + nom2;
		f2.renameTo(new File(nom2));
		
		//mostrar fitxer de un directori
		System.out.println(Arrays.toString(directori.listFiles()));
		
		//borrar un fitxer
		System.out.println("Entra la ruta de l'arxiu a borrar:");
		f2 = new File(sc.next());
		System.out.println("Borrat: " + f2.delete());
		
		
		System.out.println("Entra el direcotri amb fitxers Ocults:");
		f2 = new File(sc.next());
		File[] fitxers = f2.listFiles();
		System.out.println("Fitxers Ocults:");
		
		for(int i = 0; i < fitxers.length; i++)
		{
			if(fitxers[i].isHidden())
			{
				System.out.println(fitxers[i]);
			}
		}
		
		//mostrar fitxers ocults al principi i despres no ocults
		System.out.println("Fitxers no ocults");
		
		for(int i = 0; i < fitxers.length; i++)
		{
			if(!fitxers[i].isHidden())
			{
				System.out.println(fitxers[i]);
			}
		}
		
		//mostrar arxius amb extencio pdf
		System.out.print("Entra la Ruta on buscar Arxius .pdf: ");
		f2 = new File(sc.next());
		
		System.out.println("Arxius .pdf: " + Arrays.toString(f2.listFiles(new Filtre(".pdf"))));
		
	}
	
	

}

