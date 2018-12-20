package file;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta = new File("C:\\Users\\Dipard\\Desktop");
		
		String [] llista = ruta.list(new Filtre(".txt"));
		
		for(int i = 0; i < llista.length; i++) {
			System.out.println(llista[i]);
		}
	}

}
