package ordenar;

public class Llista {
	Node first = null;
	Node last = null;
	
	Llista()
	{
		
	}
	
	//afegri un node al principi de la llista
	public void afegirInici(Node n)
	{
		if(this.last == null)//comprovar si es el primer first
		{
			last = n;
		}
		n.next = this.first;
		this.first = n;
	}
	
	//afegir un nodel al final de la llista
	public void afegirFinal(Node n)
	{
		this.last.next = n;
		this.last = n;
	}
	
	//afegir un node abans de la posicio introduida
	public void afegirPosicioAbans(Node n,int p)
	{
		if(!llistaBuida())//comprovar si la llista es buida
		{
			if(p <= contarNodes())//comprovar si la posicio es mes petita que la llargada de la llista
			{
				if(p > 1)//comporvar si la posicio es me petita que 1 i posar el node a la posicio
				{
					Node temp = buscarPosicioAbans(p-1);
					n.next = temp.next;
					temp.next = n;
				}
				else//son mes petits de 1
				{
					if(p <= 0)//la posicio introduida es 0 o mes petit
					{
						System.err.println("Posicio no valida");
					}
					else//afegir a la primera posicio
					{
						afegirInici(n);
					}
				}
			}
			else
			{
				System.err.println("Posicio no valida");
			}
		}
		else
		{
			System.err.println("Llista Buida");
		}
	}
	
	public void afegirPosicioDespres(Node n, int p)
	{
		if(!llistaBuida())
		{
			n.next = buscarPosicioDespres(p).next;
			buscarPosicioDespres(p).next = n;
		}
		else
		{
			System.err.println("Llista Buida");
		}
	}
	
	//borrar pocicio en una pocicio
	public void borrarPosicio(int p)
	{
		Node abans = buscarPosicioAbans(p-1);
		Node node_eliminiar = buscarPosicioAbans(p);
		
		abans.next = node_eliminiar.next;
	}
	
	public void mostrarNodes()
	{
		if(!llistaBuida())
		{
			Node temp = this.first;
			
			while(temp.next != null)
			{
				System.out.println(temp.numero);
				temp = temp.next;
			}
			
			System.out.println(temp.numero);
		}
		else
		{
			System.err.println("Llista Buida");
		}
	}
	
	//contar els nodes que te la llista
	public int contarNodes()
	{
		if(!llistaBuida())//comprovar si la llista es buida
		{
			Node temp = first;
			
			int i = 1;
			
			while(temp.next != null)//recorre tots els nodes
			{
				i++;
				temp = temp.next;
			}
			
			return i;
		}
		else
		{
			System.err.println("Llista Buida");
			return 0;
		}
	}
	
	//Comprovar si la llista es buida
	public boolean llistaBuida()
	{
		if(first == null)
			return true;
		else
			return false;
	}
	
	//ens retorna el primer node
	public Node first()
	{
		return this.first;
	}
	
	
	//ens retorna lultim node
	public Node last()
	{
		return this.last;
	}
	
	//Buscar la posicio Abans
	private Node buscarPosicioAbans(int p)
	{
		Node temp = first;
		int i = 1;
		
		while(temp.next != null && i < p)//Recorre tot llista
		{
			temp = temp.next;
			i++;
		}
		
		return temp;
	}
	
	//buscar la pocicio despres
	private Node buscarPosicioDespres(int p)
	{
		Node temp = first;
		int i = 1;
		
		while(temp.next != null && i < p)
		{
			temp = temp.next;
			i++;
		}
		
		return temp;
	}
	
}
