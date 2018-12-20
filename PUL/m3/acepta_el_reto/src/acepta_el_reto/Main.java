package acepta_el_reto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String , Objecte> map = new HashMap<String ,  Objecte>();
		Scanner sc = new Scanner(System.in);
		String paraula = "";
		
		while(paraula.equals("exit") == false) {
			paraula = sc.next();
			if(paraula.equals("exit") == false && paraula.toCharArray().length > 2) {
				map.put(paraula, new Objecte(paraula));
			}	
		}
		
		System.out.println(map);
	}

}
