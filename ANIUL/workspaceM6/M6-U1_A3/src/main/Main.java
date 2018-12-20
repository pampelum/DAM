package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String fitxer1, fitxer2;
		File file1, file2;
		
		
		System.out.print("Entra el fitxer 1:");
		fitxer1 = sc.nextLine();
		file1 = new File(fitxer1);
		System.out.print("Entra el fitxer 2:");
		fitxer2 = sc.nextLine();
		file2 = new File(fitxer2);
		
		if(file1.exists() && file2.exists())
		{
			compareFileContent(file1,file2);
		}
		
		
		
		
	}
	
	public static void compareFileContent(File file1, File file2) throws IOException
	{
		InputStream br1, br2;
		String contingut1 = "", contingut2 = "";
		int read1, read2;
		
		br1 = new FileInputStream(file1);
		br2 = new FileInputStream(file2);
		
		do{
			read1 = br1.read();
			contingut1 += read1;
			read2 = br2.read();
			contingut2 += read2;
		}while(read1 != -1 && read2 != -1);
		
		if(contingut1.compareTo(contingut2) == 0)
		{
			System.out.println("Els fitxers son iguals");
		}
		else
		{
			System.out.println("Els fitxers son diferents");
		}
	}
}
