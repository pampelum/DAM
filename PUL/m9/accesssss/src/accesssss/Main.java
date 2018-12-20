package accesssss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {

        /*    Crea un fitxer de text amb el nom i contingut que vulguis.
         *    Ara crea una aplicació que llegeixi aquest fitxer caràcter a caràcter i mostri el seu contingut per pantalla, sense espais.
         */
        Scanner sc = new Scanner(System.in);
        String ruta = null;

        System.out.println("Introdueix la ruta del arxiu: ");
        ruta = sc.next();

        File arxiu = new File(ruta);
        FileReader fr = new FileReader(arxiu);

        int lletra = fr.read();

        /*Bucle per llegir caracter per caracter*/
        while(lletra != -1) {
            /*Comprobem si el caracter es un espai, si ho es no s'imprimira per pantalla*/
            if(lletra != 32) {
                 char caracter = (char) lletra;
                 System.out.print(caracter);
                 lletra = fr.read();
            }else {
                 lletra = fr.read();
            }

        }
       fr.close(); 
       sc.close();
    }

}
