package mail;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directori;
    	
        System.out.print("Entra el Directori: ");
        directori = sc.nextLine();
        
    	mostrarDirs(directori);
    	
    }
    
    public static void mostrarDirs(String path) {
        File f = new File(path);
        File[] llistat = f.listFiles();

        if (llistat == null) 
        	return;

        for (File f2 : llistat) {
            if (f2.isDirectory()) {
                System.out.println("Dir:" + f2.getAbsoluteFile());
                mostrarDirs(f2.getAbsolutePath());
            }
            else {
                System.out.println("File:" + f2.getAbsoluteFile());
            }
        }
    }
}
