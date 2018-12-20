package ex_291;

import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		TreeMap<String, int[]> tm = new TreeMap<String, int[]>();
	    Scanner sc = new Scanner(System.in);
	    String paraula;
	    String nom;
	    String linia;
	    String [] paraules;
	    String nom_temp;
	    int[] num_linia;
	    int[] num;
	    int linies;

	    
	    linies = sc.nextInt();
	    
	    sc.nextLine();
	    
	    //recore totes les linies
	    for(int i = 0; i < linies; i++)
	    {
	    	linia = sc.nextLine();
	    	linia = linia.toLowerCase();
	    	paraules = linia.split(" ");
	    	
	    	//recore cada paraula de la linia
	    	for(int i2 = 0; i2 < paraules.length; i2++)
	    	{
	    		num_linia = new int[linies];
	    		
	    		if(!tm.containsKey(paraules[i2]))
	    		{
	    			if(paraules[i2].length() > 2)
	    			{
	    				num_linia[i] = i + 1;
	    				tm.put(paraules[i2], num_linia);
	    			}
	    		}
	    		else
	    		{
	    			num_linia = tm.get(paraules[i2]);
	    			num_linia[i] = i + 1;
	    		}
	    	}
	    }
	    
	    Vector vec = new java.util.Vector(tm.keySet()); 
	    Collections.sort(vec);
	    
	    for(int i = 0; i < vec.size(); i++)
	    {
	    	nom = (String) vec.get(i);
	    	num = tm.get(nom);
	    	System.out.print(nom);
	    	for(int i2 = 0; i2 < num.length; i2++)
	    	{
	    		if(num[i2] != 0)
	    		{
	    			System.out.print(" " + num[i2]);
	    		}
	    	}
	    	System.out.println();
    	}
    
	    System.out.println("----");
	}
}
