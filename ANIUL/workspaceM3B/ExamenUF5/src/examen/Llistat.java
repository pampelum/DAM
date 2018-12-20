package examen;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Llistat {
	
	HashMap<Character, LinkedList<String>> llistat = new HashMap();
	
	public Llistat(){
		iniciarLlistes();
		
		
	}
	
	public void iniciarLlistes() {
		final int MAX = 26;
		char lletra;
				
		for(byte i = 0; i < MAX; i++)
		{
			lletra = (char) ((i%65) + 65);
			llistat.put(lletra, new LinkedList());
		}
	}
	
	public void afegirParaula(String p)
	{
		Boolean trobat = false;
		int comp;
		char firstLeter = Character.toUpperCase(p.charAt(0));
		LinkedList<String> temp = llistat.get(firstLeter);
		
		if(temp.isEmpty())//si la llistat es buda posar al principi
		{
			temp.addFirst(p);
		}
		else 
		{
			comp = temp.getFirst().compareTo(p);
			
			if(comp < 0)//si la paraula es mes peitta que la primera posa al principi
			{
				temp.addFirst(p);
			}
			else
			{
				comp = temp.getLast().compareTo(p);
				
				if(comp > 0)//is la paraula es mes gran posar al final
				{
					temp.addLast(p);
				}
				else
				{
					int size = temp.size();
					
					for(int i = 0; i < size; i++)//recorem tota la llista
					{
						comp = temp.get(i).compareTo(p);
						
						if(comp > 0)//si el nom es mes petit vol dir que va abans
						{
							trobat = true;
							temp.add(i, p);
						}
						else//el nom es mes gran i hem de pasar a comprovar el seguent nom de llista
						{
							i++;
						}
					}
				}
			}
		}
		
	}
	
	public void mostrarEntrada(char c)
	{
		LinkedList<String> temp = llistat.get(Character.toUpperCase(c));
		
		int size = temp.size();
		
		for(int i = 0; i < size; i++)
		{
			System.out.println(temp.get(i));
		}
	
	}
}
