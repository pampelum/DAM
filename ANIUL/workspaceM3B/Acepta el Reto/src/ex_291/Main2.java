package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class Main2 {
	public static void main(String[] args) {
		TreeMap<String, Set<Long>> tm = new TreeMap<String, Set<Long>>();
	    Scanner sc = new Scanner(System.in);
	    String paraula;
	    String nom;
	    String linia;
	    String [] paraules;
	    String nom_temp;
	    Long i2;
	    Long linies = (long) -1;
	    Set<Long> num_linia;

	    
	    
	    do
	    {
		    linies = (long) sc.nextInt();
		    tm = new TreeMap<String, Set<Long>>();
		    
		   
		    if(linies != 0)
		    {
		    	sc.nextLine();
				    
			    //recore totes les linies
			    for(long i = 0; i < linies; i++)
			    {
			    	linia = sc.nextLine();
			    	linia = linia.toLowerCase();
			    	paraules = linia.split(" ");
			    	
			    	//recore cada paraula de la linia
			    	for(int j = 0; j < paraules.length; j++)
			    	{
			    		i2 = i + 1;
			    		paraula = paraules[j];
			    		//comprovar si la paraula ja existeix
			    		if(!tm.containsKey(paraula))
			    		{
			    			num_linia = new HashSet<Long>();
			    			
			    			if(paraula.length() > 2)
			    			{
			    				num_linia.add(i2);
			    				tm.put(paraula, num_linia);
			    			}
			    		}
			    		else
			    		{
			    			num_linia = tm.get(paraula);
			    			num_linia.add(i2);
			    		}
			    	}
			    } 
			    Set set = tm.entrySet();
			    Iterator iterator = set.iterator();
			    Set<Long> values = new HashSet<Long>();
			    
			    while(iterator.hasNext())
			    {
			    	Map.Entry mentry = (Map.Entry)iterator.next();
			        System.out.print(mentry.getKey());
			        values = (Set<Long>) mentry.getValue();
			        for(Long num:values)
			        {
			        	System.out.print(" " + num);
			        }
			        System.out.println();
			    }
		    
			    System.out.println("----");
		    }
		    
		    
	    }while(linies != 0);
	    
	    
	}
}