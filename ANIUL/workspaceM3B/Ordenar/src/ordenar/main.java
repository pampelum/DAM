package ordenar;

public class main {

	public static void main(String[] args) {

		Node numeros [] = {new Node(9), new Node(1), new Node(3), new Node(4)};
		Llista llista = new Llista();
		
		Boolean ordenat = false;
		
		for(int i  = 0; i < numeros.length; i++)//recorrer tots el nodes
		{
			if(llista.llistaBuida())//comprovar si la llista es buida
			{
				llista.afegirInici(numeros[i]);//afegir el node a la primera posicio
				ordenat = true;
			}
			
			//comprovar si el node es mes petit que la primera posicio
			if(numeros[i].numero < llista.first().numero && ordenat == false)
			{
				llista.afegirInici(numeros[i]);
				ordenat = true;
			}
			
			//comrovar si el node es mes gran que la ultima posicio
			if(numeros[i].numero > llista.last().numero && ordenat == false)
			{
				llista.afegirFinal(numeros[i]);
				ordenat = true;
			}
			
			int i2 = 1;
			Node temp = llista.first();
			
			while(temp != null && ordenat == false)
			{
				if(numeros[i].numero < temp.numero)
				{
					llista.afegirPosicioAbans(numeros[i], i2);
					ordenat = true;
				}
				else
				{
					temp = temp.next;
					i2++;
				}
			}
			
			ordenat = false;
		}
		
		llista.mostrarNodes();
	}

}
