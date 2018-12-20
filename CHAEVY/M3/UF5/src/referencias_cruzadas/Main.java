package referencias_cruzadas;

import java.util.Scanner;
import java.util.*;		

public class Main {

	public static void main(String[] args) {
		Hashtable <String, objecte> hm = new Hashtable <String, objecte>();
		
		Scanner sc = new Scanner(System.in);
		
		String paraula = null;
	
		do {
			paraula = sc.next();
			hm.put(paraula, new objecte(paraula));
			
		}while(paraula.equals("0") == false);
		
		System.out.println(hm.get(paraula));
		sc.close();
	}

}

/*
hm.put("burinot", 1);
hm.put("buri", 2);
hm.put("not", 3);

for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
*/
