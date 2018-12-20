package noms;

public class Llistat_telefon {
	
	Llista [] llistat = new Llista[26];
	
	Llistat_telefon()
	{
		llistat = iniciarLlista();
	}
	
	//afegri una persona a la llista
	public void afegir_persona(String n, int i, String c) {
		int posicio = lletra_to_int(n);
		
		llistat[posicio].afegir(new Node(n, i, c));
	}
	
	//mostrar contactes de la lletra introduida
	public void mostrar_contactes_lletra(String ll)
	{
		llistat[lletra_to_int(ll)].mostrarNodes();
	}
	
	//Borrar un contacte de la llista
	public void borrar(String n)
	{
		int posicio = lletra_to_int(n);
		int contador = 1;
		Node temp = llistat[posicio].first();
		boolean trobat = false;
		
		while(temp != null && trobat == false)
		{
			if(n.compareTo(temp.nom) == 0)
			{
				trobat = true;
			}
			else
			{
				contador++;
				temp = temp.next;
			}
		}
		
		if(trobat == true)
		{
			llistat[posicio].borrarPosicio(contador);
		}
		else
		{
			System.out.println("no sha trobat la persona");
		}
	}
	
	//buscar un contacte passant el nom si no el troba retorna un missatge derror
	public void buscar_nom(String n) 
	{
		int posicio = lletra_to_int(n);
		Node temp = llistat[posicio].first();
		boolean trobat = false;
		
		while(temp != null && trobat == false)
		{
			if(n.compareTo(temp.nom) == 0)
			{
				trobat = true;
			}
			else
			{
				temp = temp.next;
			}
		}
		
		if(trobat == true)
		{
			System.out.println(temp.nom + " " + temp.cognom + " " +temp.numero);
		}
		else
		{
			System.err.println("Persona no trobada");
		}
	}
	
	public void buscar_cognom(String n) 
	{
		int posicio = lletra_to_int(n);
		Node temp = llistat[posicio].first();
		boolean trobat = false;
		
		while(temp != null && trobat == false)
		{
			if(n.compareTo(temp.cognom) == 0)
			{
				trobat = true;
			}
			else
			{
				temp = temp.next;
			}
		}
		
		if(trobat == true)
		{
			System.out.println(temp.nom + temp.cognom + temp.numero);
		}
		else
		{
			System.err.println("Persona no trobada");
		}
	}
	
	//iniciar l'array amb les llistes
	private static Llista[] iniciarLlista()
	{
		Llista [] ll = new Llista[26];
		
		for(int i = 0; i < ll.length; i++)
		{
			ll[i] = new Llista();
		}
		
		return ll;
	}
	
	//trobar lindex de la primera lltra
	private static int lletra_to_int(String s)
	{
		char primeraLletra = s.toUpperCase().charAt(0);
		
		return (int)primeraLletra%65;
	}
}
